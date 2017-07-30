package com.yuriy.sample;

public class Triangle {
	
	private String type;
	
	public Triangle() {
		super();
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public void draw() {
		if (type == null) {
			System.out.println("Triangle drawn");
		} else {
			System.out.println(getType() + " Triangle drawn");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
