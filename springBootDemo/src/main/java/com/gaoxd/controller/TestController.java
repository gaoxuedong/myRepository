package com.gaoxd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaoxd.dao.OrdupwMapper;
import com.gaoxd.entity.PageResult;
import com.gaoxd.pojo.Ordupw;
import com.gaoxd.pojo.OrdupwExample;
import com.gaoxd.pojo.OrdupwExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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

	@PostMapping("/findAll")
	public PageResult getAll(int page, int rows,String pwCodeCompany,String pwPlan) {
		OrdupwExample example = new OrdupwExample();
		Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(pwCodeCompany)){
			criteria.andPwCodeCompanyEqualTo(pwCodeCompany);
		}
		if(!StringUtils.isEmpty(pwPlan)){
			criteria.andPwPlanEqualTo(pwPlan);
		}
		
		int total = dao.countByExample(example);
		PageHelper.startPage(page, rows);
		List<Ordupw> list = dao.selectByExample(example);
		PageInfo<Ordupw> pageInfo = new PageInfo<>(list);
		list = pageInfo.getList();
		PageResult pageResult = new PageResult();
		pageResult.setRows(list);
		pageResult.setTotal(total);
		return pageResult;

	}
	@GetMapping("/getAll")
	public PageResult getAll() {
		OrdupwExample example = new OrdupwExample();
		example.createCriteria();
		List<Ordupw> list = dao.selectByExample(example);
		PageResult pageResult = new PageResult();
		pageResult.setRows(list);
		pageResult.setTotal(list.size());
		return pageResult;
		
	}

}
