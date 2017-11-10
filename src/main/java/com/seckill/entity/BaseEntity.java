package com.seckill.entity;

import java.util.Date;
/**
 * 所有实体的基类
 * <p>Title: BaseEntity</p>
 * <p>Description: </p>
 * @author zhuky
 * @date 2017年10月23日 上午11:39:13
 */
public class BaseEntity {

	private Date createTime;
	
	private Date updateTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
