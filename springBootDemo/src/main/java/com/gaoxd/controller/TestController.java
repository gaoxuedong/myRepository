package com.gaoxd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaoxd.dao.OrdupwMapper;
import com.gaoxd.pojo.Ordupw;
import com.gaoxd.pojo.OrdupwExample;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private OrdupwMapper dao;
	@GetMapping("/test/{code}/{plan}/{rate}")
	public List<Ordupw> getOrdupws(@PathVariable String code, @PathVariable String plan, @PathVariable String rate) {
		OrdupwExample example = new OrdupwExample();
		example.createCriteria().andPwCodeCompanyEqualTo(code).andPwPlanEqualTo(plan).andPwRateScaleEqualTo(rate);
		List<Ordupw> list = dao.selectByExample(example);
		return list;

	}

}
