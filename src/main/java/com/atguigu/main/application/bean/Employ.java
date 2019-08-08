package com.atguigu.main.application.bean;

public class Employ {
	
	private Integer id;
	private String name;
	private String loc;
	private long salary;
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(Integer id, String name, String location, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.loc = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", location=" + loc + ", salary=" + salary + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
