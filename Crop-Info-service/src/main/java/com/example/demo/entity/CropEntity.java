package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document (collection="crop")
public class CropEntity {
	@Id
	private int id;
	private String CropName;
	private String CropLocation;
	private String CropPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCropName() {
		return CropName;
	}
	public void setCropName(String cropName) {
		CropName = cropName;
	}
	public String getCropLocation() {
		return CropLocation;
	}
	public void setCropLocation(String cropLocation) {
		CropLocation = cropLocation;
	}
	public String getCropPrice() {
		return CropPrice;
	}
	public void setCropPrice(String cropPrice) {
		CropPrice = cropPrice;
	}
	public CropEntity(int id, String cropName, String cropLocation, String cropPrice) {
		super();
		this.id = id;
		CropName = cropName;
		CropLocation = cropLocation;
		CropPrice = cropPrice;
	}
	public CropEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
