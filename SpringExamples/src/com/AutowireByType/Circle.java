package com.AutowireByType;

public class Circle
{
 private Point center;
 
  
	public Point getCenter() {
	return center;
}


public void setCenter(Point center) {
	this.center = center;
}


	public void draw() {
		System.out.println("Center of circle is  X:= "+center.getX()+"   Y:= "+center.getY());
	}
}