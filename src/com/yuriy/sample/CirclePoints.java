package com.yuriy.sample;

public class CirclePoints implements Shape {
	private Point center;
	private float radius;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Center = (" + getCenter().getX() + "; " + getCenter().getY() + ")");
		System.out.println("Radius = " + getRadius());
	}

}
