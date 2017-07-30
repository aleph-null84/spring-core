package com.yuriy.sample;

import java.util.List;

public class TriangleList {
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		int i = 0;
		for (Point point: points) {
			i++;
			System.out.println("Point A[" + i + "] = (" + point.getX() + "; " + point.getY() + ")");
		}
	}

}
