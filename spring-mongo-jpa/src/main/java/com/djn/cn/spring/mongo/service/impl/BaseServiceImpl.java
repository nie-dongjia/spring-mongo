package com.djn.cn.spring.mongo.service.impl;


import com.djn.cn.spring.mongo.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 基础实现
 * @author op.nie-dongjia  
 */
public class BaseServiceImpl<T> implements IBaseService<T> {
	@Autowired
	private MongoRepository mongoRepository;

	@Override
	public T save(T entity) {

		return (T) mongoRepository.save(entity);
	}

	@Override
	public List<T> findAll() {
		return mongoRepository.findAll();
	}

	@Override
	public T findOne(String id) {
		return (T) mongoRepository.findById(id).get();
	}

	@Override
	public void deleteById(String id) {
		mongoRepository.deleteById(id);
	}

	@Override
	public void delete(T entity) {
		mongoRepository.delete(entity);
	}
}
