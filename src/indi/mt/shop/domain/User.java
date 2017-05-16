package indi.mt.shop.domain;

public class User {
	private String id;
	private String email;
	private String password;
	private String name;
	private String area;
	private String college;
	private String grade;
	private String tel;
	private String qq;
	private String photo;
	private int point;
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public User(String id, String email, String password, String name, String area, String college, String grade,
			String tel, String qQ, String photo,int point) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.area = area;
		this.college = college;
		this.grade = grade;
		this.tel = tel;
		qq = qQ;
		this.photo = photo;
		this.point = point;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", area=" + area
				+ ", college=" + college + ", grade=" + grade + ", tel=" + tel + ", qq=" + qq + ", photo=" + photo
				+  ",point="+point+"]";
	}
	
}
