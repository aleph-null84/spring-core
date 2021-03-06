package com.yuriy.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		
		System.out.println("=== Triangle Points Application Context Aware ===");
		ApplicationContext contextTrianglePointsApplicationContextAware 
		  = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points-application-context-aware.xml");
		
		TrianglePointsApplicationContextAware trianglePointsApplicationContextAware 
		  = (TrianglePointsApplicationContextAware) contextTrianglePointsApplicationContextAware.getBean("trianglePointsAppContextAware");
		trianglePointsApplicationContextAware.draw();
		
		System.out.println("=== Triangle Points Bean Definition Inheritance ===");
		ApplicationContext contextTrianglePointsApplicationBeanDefinitionInheritance
		  = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points-bean-definition-inheritance.xml");
		
		TrianglePointsApplicationBeanDefinitionInheritance trianglePointsApplicationBeanDefinitionInheritance
		  = (TrianglePointsApplicationBeanDefinitionInheritance) contextTrianglePointsApplicationBeanDefinitionInheritance.getBean("trianglePointsBeanDefInh");
		trianglePointsApplicationBeanDefinitionInheritance.draw();
		
		System.out.println("=== Triangle Points Lifecycle Callbacks ===");
		AbstractApplicationContext contextTrianglePointsLifecycleCallbacks
		  = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points-lifecycle-callbacks.xml");
		
		contextTrianglePointsLifecycleCallbacks.registerShutdownHook();
		
		TrianglePointsLifecycleCallbacks trianglePointsLifecycleCallbacks
		  = (TrianglePointsLifecycleCallbacks) contextTrianglePointsLifecycleCallbacks.getBean("trianglePoints");
		trianglePointsLifecycleCallbacks.draw();
		
		System.out.println("=== Triangle Points Baen Post Processor ===");
		ApplicationContext contextTrianglePointsBeanPostProcessor
		  = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points-bean-post-processor.xml");
		
		TrianglePoints trianglePointsBeanPostProcessor
		  = (TrianglePoints) contextTrianglePointsBeanPostProcessor.getBean("trianglePointsBeanPostProcessor");
		trianglePointsBeanPostProcessor.draw();
		
		System.out.println("=== Shape Interface ===");
		ApplicationContext contextShapePoints = new ClassPathXmlApplicationContext("classpath:app-context-triangle-points.xml");
		
		Shape shape = (Shape) contextShapePoints.getBean("trianglePoints");
		shape.draw();
		shape = (Shape) contextShapePoints.getBean("circlePoints");
		shape.draw();

	}

}
