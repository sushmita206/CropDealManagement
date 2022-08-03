package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CropEntity;
import com.example.demo.service.CropService;

@RestController
@RequestMapping("/crop")
public class CropController {
	
	@Autowired
	public CropService cropService;
	
	@GetMapping("crop-info")
	public List<CropEntity> getCropInfoService(){
		return cropService.getCropInfo();
	}
	
	@GetMapping("/crop-info/{id}")  
	public CropEntity getCropInfoById(@PathVariable("id") int id)   
	{  
	return cropService.getCropById(id);
	} 
	
	@PostMapping("/crop-save")  
	public CropEntity addCropInfo(@RequestBody CropEntity CropEntity)   
	{  
	cropService.addCropInfo(CropEntity); 
	return CropEntity;  
	}
	
	@PutMapping("/Crop-info/{id}")  
	public CropEntity updatecropInfo(@PathVariable("id") int id,@RequestBody CropEntity cropEntity)   
	{  
	cropService.updateCropInfo(id,cropEntity);
	return cropEntity;  
	}  
	
	@DeleteMapping("/admin-info/{id}")  
	private void deleteCropInfo(@PathVariable("id") int id)   
	{  
	cropService.deleteCropInfo(id);  
	}  
	
	/*
	 * @GetMapping("/crop-info") public List<AdminEntity> getAdminInfoService(){
	 * return this.adminrepo.findAll();
	 * 
	 * }
	 * 
	 * @GetMapping("/crop-info/{id}") public AdminEntity
	 * getAdminById(@PathVariable(value="id")Integer id) { return
	 * adminrepo.findById(id); }
	 * 
	 * @PostMapping("/crop-save") public AdminEntity addAdminInfo(@RequestBody
	 * AdminEntity adminEntity) { return this.adminrepo.save(adminEntity); }
	 * 
	 * @RequestMapping("/info") public String getAdminInfo() {
	 * 
	 * return "This Is crop-Info"; }
	 */

}
