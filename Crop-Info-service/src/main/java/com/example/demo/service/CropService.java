package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CropEntity;
import com.example.demo.repository.CropRepository;

@Service
public class CropService {
	@Autowired
	public CropRepository croprepo;
	
	//get all crop info
	public List<CropEntity>getCropInfo()
	{
		List<CropEntity>crop=new ArrayList<CropEntity>();
		croprepo.findAll().forEach(crop1->crop.add(crop1));
		return crop;
		
	}
	//get crop info by id 
	public CropEntity getCropById(int id) {
		return croprepo.findById(id).get();
		
		
	}
	// post crop info
	public void addCropInfo(CropEntity cropEntity) {
		croprepo.save(cropEntity);
		
	}
	//deleting crop info by id
	public void deleteCropInfo(int id) {
		croprepo.deleteById( id);
	}
	//updating the crop info
	public void updateCropInfo(int id, CropEntity cropEntity) {
		croprepo.save(cropEntity);
	}
	
	
	


	

}
