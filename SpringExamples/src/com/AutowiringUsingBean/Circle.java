package com.AutowiringUsingBean;

public class Circle
{
 private Point center;

public Circle(Point center) {
	super();
	this.center = center;
}
  
	public void draw() {
		System.out.println("Center of circle is  X:= "+center.getX()+"   Y:= "+center.getY());
	}
}