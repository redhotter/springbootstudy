package com.atguigu.main.application.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.main.application.bean.Employ;
import com.atguigu.main.application.servlet.EmployServer;

@Controller
public class Test {
	@Autowired
	private EmployServer es;
	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello() {
		return "success";
	}
	@ResponseBody
	@RequestMapping(value="/hello1")
	public Employ hello1(int id) {
		return es.queryA(id);
	}
	@ResponseBody
	@RequestMapping(value="hello4")
	public List<Employ> hello4() {
		return es.queryAll();
	}
	@ResponseBody
	@RequestMapping(value="/hello2")
	public String hello2(Employ e) {
		es.uqdateA(e);
		return "update success";
	}
	@ResponseBody
	@RequestMapping(value="/hello3")
	public String hello3(int id) {
		es.deleteA(id);
		return "delete success";
	}
	
	

}
