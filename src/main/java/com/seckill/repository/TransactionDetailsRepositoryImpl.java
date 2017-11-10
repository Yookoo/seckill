package com.seckill.repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;

import com.seckill.entity.Seckill;
import com.seckill.entity.TransactionDetails;

public class TransactionDetailsRepositoryImpl implements TransactionDetailsRepository{

	
	/**
	 * 主键计数器
	 */
	private static AtomicLong COUNTER =new AtomicLong();
	/**
	 * 模拟内存存储
	 */
	private final ConcurrentMap<Long, TransactionDetails> transactionDetailsMap = new ConcurrentHashMap<Long, TransactionDetails>();
	
	@Autowired
	private SeckillRepository seckillRepository;
	
	@Override
	public void save(TransactionDetails transactionDetails) {
		
		Long seckillId = transactionDetails.getSeckillId();
		Seckill seckill = seckillRepository.queryById(seckillId);
		transactionDetails.setSeckill(seckill);
		Long id = COUNTER.incrementAndGet();
		transactionDetailsMap.put(id, transactionDetails);
	}

	@Override
	public TransactionDetails queryById(Long id) {
		return transactionDetailsMap.get(id);
	}

}
