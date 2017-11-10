package com.seckill.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.seckill.entity.Seckill;
/**
 * Seckill 资源库实现类
 * <p>Title: SeckillRepositoryImpl</p>
 * <p>Description: </p>
 * @author zhuky
 * @date 2017年10月26日 上午8:45:09
 */
public class SeckillRepositoryImpl implements SeckillRepository{
	
	/**
	 * 主键计数器
	 */
	private static AtomicLong COUNTER =new AtomicLong();
	/**
	 * 模拟内存存储
	 */
	private final ConcurrentMap<Long, Seckill> seckillMap = new ConcurrentHashMap<Long, Seckill>();
	
	@Override
	public Seckill queryById(Long id) {
		return seckillMap.get(id);
	}

	@Override
	public List<Seckill> queryAll() {
		return new ArrayList<>(seckillMap.values());
	}

	@Override
	public void save(Seckill seckill) {
		Long id = COUNTER.incrementAndGet();
		seckill.setId(id);
		seckillMap.put(seckill.getId(), seckill);
	}

	@Override
	public void deleteById(Long id) {
		seckillMap.remove(id);
	}

	@Override
	public Seckill reduceStock(Seckill seckill) {
		seckill.setStock(seckill.getStock()-1);
		return seckill;
	}

}
