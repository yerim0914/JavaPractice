package day13;

import java.io.IOException;
import java.io.InterruptedIOException;

public class Shape {
	private String color;
	
	public Shape() {
	}
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	public void draw(){
		System.out.println(color + " »öÄ¥ÇÏ±â  ");
	
		
	}


	
}
