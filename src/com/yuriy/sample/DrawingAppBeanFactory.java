package com.yuriy.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingAppBeanFactory {

	public static void main(String[] args) {
		
		System.out.println("=== Bean Factory ===");
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("app-context-bean-factory.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();

	}

}
