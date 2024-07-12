package com.anudip.springdemo;

public class Painter {
	Shape shape;

	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	public void perfom() {
		System.out.println("The painter is ");
		shape.draw();
	}
}
