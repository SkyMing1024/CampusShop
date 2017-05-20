package indi.mt.shop.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.User;
import indi.mt.shop.service.ProductListService;

/**
 * Servlet implementation class TestUpLoadServlet
 */
public class TestUpLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	// 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "imgs_products";
 
    // 上传配置
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
    /**
     * 上传数据及保存文件
     */
    protected void doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		String pname = null;
		String pdesc = null;
		String buyPrice = null;
		String salePrice =null;
		String cid2 = null;
    	
		// 检测是否为多媒体上传
		if (!ServletFileUpload.isMultipartContent(request)) {
		    // 如果不是则停止
		    PrintWriter writer = response.getWriter();
		    writer.println("Error: 表单必须包含 enctype=multipart/form-data");
		    writer.flush();
		    return;
		}
 
        // 配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
 
        ServletFileUpload upload = new ServletFileUpload(factory);
         
        // 设置最大文件上传值
        upload.setFileSizeMax(MAX_FILE_SIZE);
         
        // 设置最大请求值 (包含文件和表单数据)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // 中文处理
        upload.setHeaderEncoding("UTF-8"); 

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
        String uploadPath = request.getServletContext().getRealPath("/") + UPLOAD_DIRECTORY;
         
        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        String fileName = null;
        String filePath;
        try {
            // 解析请求的内容提取文件数据
            List<FileItem> formItems = upload.parseRequest(request);
 
            if (formItems != null && formItems.size() > 0) {
            	System.out.println("formsize:"+formItems.size());
                // 迭代表单数据
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                        fileName = new File(item.getName()).getName();
                        filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);
                        // 在控制台输出文件的上传路径
                        System.out.println("filename:"+fileName);
                        System.out.println(filePath);
                        // 保存文件到硬盘
                        item.write(storeFile);
                        request.setAttribute("message",
                            "文件上传成功!");
                    }else {
                    	if(item.getFieldName().equals("title")){
                    		pname = item.getString("UTF-8");
                    	}else if (item.getFieldName().equals("desc")) {
                    		pdesc = item.getString("UTF-8");
						}else if (item.getFieldName().equals("buyPrice")) {
							buyPrice = item.getString("UTF-8");
						}else if (item.getFieldName().equals("salePrice")) {
							salePrice = item.getString("UTF-8");
						}else if (item.getFieldName().equals("catvalue")) {
							cid2 = item.getString("UTF-8");
						}
					}
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "错误信息: " + ex.getMessage());
        }
        
        request.setCharacterEncoding("utf-8");
		User user = (User) request.getSession().getAttribute("user");
		String pimage = "imgs_products/"+fileName;
		Product product = new Product(null, pname, 
				Double.parseDouble(buyPrice),
				Double.parseDouble(salePrice), pdesc, pimage, user.getId(), Integer.parseInt(cid2), 0, null, null, null);
		System.out.println(product);
		new ProductListService().addProduct(product);
		String url = "user_center.jsp?id="+user.getId();
		response.sendRedirect(url);
//        request.getServletContext().getRequestDispatcher(url).forward(
//                request, response);
    }

}
