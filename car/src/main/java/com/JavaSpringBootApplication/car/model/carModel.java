package com.JavaSpringBootApplication.car.model;

public class carModel {
	private String name;
	private String mnfctr;

	public carModel() {
		
	}
	
	public carModel(String name, String mnfctr){
		super();
		this.name = name;
		this.mnfctr = mnfctr;
	}
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getMnfctr() {
		      return mnfctr;
	   }
	   public void setMnfctr(String mnfctr) {
		      this.mnfctr = mnfctr;
	   }
}

