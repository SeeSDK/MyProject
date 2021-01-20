package com.seesdk.microcloud.rest;

import javax.annotation.Resource;

import com.seesdk.microcloud.service.IDeptService;
import com.seesdk.vo.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ;
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Object get(@PathVariable("id") long id) {
		return this.deptService.get(id) ;
	}
	@RequestMapping(value="/dept/add",method=RequestMethod.GET)
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept) ;
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public Object list() {
		return this.deptService.list() ;
	}
}
