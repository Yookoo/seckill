package com.seckill.entity;

/**
 * 
 * <p>Title: TransactionDetails</p>
 * <p>Description: 交易明细</p>
 * <p>Company: CSS </p> 
 * @author zhuky
 * @date 2017年10月23日 上午11:36:57
 */
public class TransactionDetails extends BaseEntity{

	private Long id;

	private Long seckillId;
	
	private String userPhone;
	
	private Short state;

	private Seckill seckill;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(Long seckillId) {
		this.seckillId = seckillId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	} 
	
}
