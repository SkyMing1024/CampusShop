package indi.mt.shop.test;

public class TestProduct {
	private String pid;
	private String pname;
	private double buyPrice;
	private double salePrice;
	private String pdesc;
	private String pimage;
	private String beloneto;
	private int cid2;
	private int readTimes;
	private String isHot;
	private String state;
	private String creatTime;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getBeloneto() {
		return beloneto;
	}
	public void setBeloneto(String beloneto) {
		this.beloneto = beloneto;
	}
	public int getCid2() {
		return cid2;
	}
	public void setCid2(int cid2) {
		this.cid2 = cid2;
	}
	public int getReadTimes() {
		return readTimes;
	}
	public void setReadTimes(int readTimes) {
		this.readTimes = readTimes;
	}
	public String getIsHot() {
		return isHot;
	}
	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}
	public String getCreatTime() {
		return creatTime;
	}
	
	
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public TestProduct(String pid, String pname, double buyPrice, double salePrice, String pdesc, String pimage,
			String beloneto, int cid2, int readTimes, String isHot, String creatTime) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
		this.pdesc = pdesc;
		this.pimage = pimage;
		this.beloneto = beloneto;
		this.cid2 = cid2;
		this.readTimes = readTimes;
		this.isHot = isHot;
		this.creatTime = creatTime;
	}
	public TestProduct() {
	}
	@Override
	public String toString() {
		return "TestProduct [pid=" + pid + ", pname=" + pname + ", buyPrice=" + buyPrice + ", salePrice=" + salePrice
				+ ", pdesc=" + pdesc + ", pimage=" + pimage + ", beloneto=" + beloneto + ", cid2=" + cid2
				+ ", readTimes=" + readTimes + ", isHot=" + isHot + ", creatTime=" + creatTime + "]";
	}
	
	
}
