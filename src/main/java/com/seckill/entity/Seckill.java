package com.seckill.entity;

import java.util.Date;

/**
 * <p>Title: Seckill</p>
 * <p>Description: 秒杀实体 </p>
 * <p>Company: CSS </p> 
 * @author zhuky 
 * @date 2017年10月23日 上午11:34:15
 */
public class Seckill extends BaseEntity{
	
	private Long id;
	
	private String name;
	
	/** 库存 */
	private Integer stock;
	
	private Date startTime;
	
	private Date endTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
