package com.gaoxd.entity;

import java.util.List;

import com.gaoxd.pojo.Ordupw;

public class PageResult {
	private Integer total;
	private List<Ordupw>rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Ordupw> getRows() {
		return rows;
	}
	public void setRows(List<Ordupw> rows) {
		this.rows = rows;
	}
	
	

}
