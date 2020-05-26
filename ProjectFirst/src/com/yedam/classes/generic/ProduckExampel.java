package com.yedam.classes.generic;

public class ProduckExampel {
	public static void main(String[] args) {
		Product<Apple, String> p1 = new Product<Apple, String>();
		p1.setKind(new Apple());
		Apple apple = p1.getkind();
		p1.setModel("사과");
		String str = p1.getModel();
		
		Product<String, Orange> p2 = new Product<String, Orange>();
		p2.setKind("오렌지");
		p2.setModel(new Orange());
			
	}
}
