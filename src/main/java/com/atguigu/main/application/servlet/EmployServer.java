package com.atguigu.main.application.servlet;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.main.application.bean.Employ;
import com.atguigu.main.application.dao.EmployMapper;

@Service
public class EmployServer {
	@Autowired
	private EmployMapper em;
	
	public Employ queryA(int id) { 
		return em.queryById(id);
	}
	
	public List<Employ> queryAll(){
		return em.queryEmps();
	}
	
	public void uqdateA(Employ e) {
		em.uqdateEmp(e);
	}
	
	public void deleteA(int id) {
		em.deleteEmp(id);
	}

}
