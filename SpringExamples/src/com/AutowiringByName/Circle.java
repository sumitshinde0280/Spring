package com.AutowiringByName;

public class Circle
{
 private Point center;
 private Point center1;
 private Point center2;

  
	public Point getCenter() {
	return center;
}


public void setCenter(Point center) {
	this.center = center;
}


public Point getCenter1() {
	return center1;
}


public void setCenter1(Point center1) {
	this.center1 = center1;
}


public Point getCenter2() {
	return center2;
}


public void setCenter2(Point center2) {
	this.center2 = center2;
}


	public void draw() {
		System.out.println("Center of circle is  X:= "+center.getX()+"   Y:= "+center.getY());
		System.out.println("Center of circle is  X:= "+center1.getX()+"   Y:= "+center1.getY());
		System.out.println("Center of circle is  X:= "+center2.getX()+"   Y:= "+center2.getY());
	}
}