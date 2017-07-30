package com.yuriy.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppContext {

	public static void main(String[] args) {

		System.out.println("=== Application Context ===");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:app-context.xml");
		
		Triangle triangleSetter = (Triangle) context.getBean("triangleSetter");
		triangleSetter.draw();
		
		Triangle triangleConstructor = (Triangle) context.getBean("triangleConstructor");
		triangleConstructor.draw();
		
		System.out.println("=== Triangle Points ===");
		ApplicationContext contextTrianglePoints = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points.xml");
		
		TrianglePoints trianglePoints = (TrianglePoints) contextTrianglePoints.getBean("triangle-points-alias");
		trianglePoints.draw();
		
		System.out.println("=== Triangle List of Points ===");
		ApplicationContext contextTriangleList = new ClassPathXmlApplicationContext("classpath:app-context-triangle-list.xml");
		
		TriangleList trianglePointsList = (TriangleList) contextTriangleList.getBean("triangleList");
		trianglePointsList.draw();
		
		System.out.println("=== Triangle Points Autowiring ===");
		ApplicationContext contextTrianglePointsAutowiring 
		  = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points-autowiring.xml");
		
		TrianglePointsAutowiring trianglePointsAutowiring 
		  = (TrianglePointsAutowiring) contextTrianglePointsAutowiring.getBean("trianglePointsAutowiring");
		trianglePointsAutowiring.draw();

	}

}
