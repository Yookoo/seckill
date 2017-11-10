package com.seckill.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Before;
import org.junit.Test;
/**
 * Seckill的测试类
 * <p>Title: SeckillTest</p>
 * <p>Description: </p>
 * <p>Company: CSS </p> 
 * @author zhuky
 * @date 2017年10月23日 上午11:40:04
 */
public class SeckillTest {

	@Before
	public void setup(){

	}
	
	@Test
	public void toStringTest(){
		Seckill seckill= new Seckill();
		seckill.setId(1L);
		seckill.setStock(100);
		seckill.setName("1000元秒杀iphone7");
		seckill.setCreateTime(new Date());
		seckill.setStartTime(new Date());
		seckill.setEndTime(new Date());
		System.out.println(ReflectionToStringBuilder.toString(seckill));
	}
}
