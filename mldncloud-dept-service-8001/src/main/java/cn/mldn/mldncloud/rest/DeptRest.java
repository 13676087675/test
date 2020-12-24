package cn.mldn.mldncloud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import cn.mldn.mldncloud.dto.DeptDTO;
import cn.mldn.mldncloud.service.IDeptService;

@RestController
public class DeptRest {
	@Autowired
	private IDeptService deptService ;			// 注入部门业务

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/dept/discover")
	public Object discover(){
		return this.discoveryClient;
	}

	@PostMapping("/dept/add")
	public Object get(@RequestBody DeptDTO dept) {
		return this.deptService.add(dept)  ;	// 增加部门信息
	}
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") long deptno) {
		return this.deptService.get(deptno)  ;	// 查询部门信息
	}
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ;		// 部门信息列表
	}
}
