package model.demo;

public class Employee {

	private int eid;
	private String ename;
	private String job;
	private Double sal;
	private int deptno;
	private String password;
	
	public Employee() {
		super();
	}
	
	

	public Employee(int eid, String ename, String job, Double sal, int deptno, String password) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
		this.password = password;
	}


	


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Double getSal() {
		return sal;
	}


	public void setSal(Double sal) {
		this.sal = sal;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ ", password=" + password + "]";
	}
	
	
	
}
