package com.mycom.spring.handle;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycom.spring.service.MajorService;
import com.mycom.spring.service.StudentService;

import sun.misc.Request;

//	/stu		HTTP POST 新增
//	/stu/1	HTTP	PUT 更新id为1的学生
//	/stu/1 HTTP	DELETE 删除id为1的学生
//	/stu/1 HTTP GET 获取id为1的学生

@Controller
public class StudentHandle
{
	@Autowired
	private StudentService studentService;
	@Autowired
	private MajorService majorService;
	@RequestMapping(value="/students")
	public String list(Map<String, Object> map)
	{
		map.put("students", studentService.getAll());
		return  "list";
	}
	@RequestMapping(value="/stu/{id}",method=RequestMethod.DELETE)
	public String  delete(@PathVariable("id")Integer id)
	{
		studentService.delete(id);
		return "redirect:/students";
	}
	@RequestMapping(value="/stu",method=RequestMethod.GET)
	public String input()
	{
		return "input";
	}
}
