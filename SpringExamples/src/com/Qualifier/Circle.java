package com.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle
{
 private Point center;

	
@Autowired
@Qualifier("circleBean")
public void setCenter(Point center) {
	this.center = center;
}

	public void draw() {
		System.out.println("Center of circle is  X:= "+center.getX()+"   Y:= "+center.getY());
	}
}