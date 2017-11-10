package com.seckill.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.seckill.entity.Seckill;
/**
 * Seckill 资源库
 * 
 * @author ZKY
 *
 */

public interface SeckillRepository {
	/**
	 * 保存seckill
	 * @param seckill
	 * @return
	 */
	void save(Seckill seckill);
	/**
	 * 根据ID查询秒杀对象
	 * @param id
	 * @return
	 */
	Seckill queryById(Long id);
	
	/**
	 *  查询所有
	 * @return
	 */
	List<Seckill> queryAll();
	
	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 */
	void deleteById(Long id);
	/**
	 * 库存-1
	 * @param seckill
	 * @return
	 */
	Seckill reduceStock(Seckill seckill);
	
}
