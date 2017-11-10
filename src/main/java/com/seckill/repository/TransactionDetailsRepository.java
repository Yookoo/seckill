package com.seckill.repository;

import com.seckill.entity.TransactionDetails;

public interface TransactionDetailsRepository {


	void save (TransactionDetails transactionDetails);
	
	TransactionDetails queryById(Long id);
}
