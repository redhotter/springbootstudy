package com.atguigu.main.application.dao;

import java.util.List;

import com.atguigu.main.application.bean.Employ;

public interface EmployMapper {	
	Employ queryById(int id );
	void uqdateEmp(Employ e);
	void deleteEmp(int id);
	void inserEmp(Employ e);
	List<Employ> queryEmps();
	

}
