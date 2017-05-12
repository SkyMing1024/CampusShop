package indi.mt.shop.domain;

import java.sql.Date;

public class Product {
	
	private String pid;
	private String pname;
	private double buyPrice;
	private double salePrice;
	private String pdesc;
	private String pimage;
	private String beloneto;
	private int cid2;
	private int readTimes;
	private boolean state;
	private boolean isHot;
	private java.sql.Date creatTime;
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
	public int getRead_times() {
		return readTimes;
	}
	public void setRead_times(int read_times) {
		this.readTimes = read_times;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
	public  Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
	public Product() {

	}
	public Product(String pid, String pname, double buyPrice, double salePrice, String pdesc, String pimage,
			String beloneto, int cid2, int readTimes, boolean state, boolean isHot, Date creatTime) {
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
		this.state = state;
		this.isHot = isHot;
		this.creatTime = creatTime;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", buyPrice=" + buyPrice + ", salePrice=" + salePrice
				+ ", pdesc=" + pdesc + ", pimage=" + pimage + ", beloneto=" + beloneto + ", cid2=" + cid2
				+ ", readTimes=" + readTimes + ", state=" + state + ", isHot=" + isHot + ", creatTime=" + creatTime
				+ "]\n";
	}
	
	
	
}
