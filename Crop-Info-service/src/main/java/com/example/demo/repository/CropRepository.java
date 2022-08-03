package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.CropEntity;

public interface CropRepository  extends MongoRepository<CropEntity,Integer>{
	

}
