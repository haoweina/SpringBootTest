package com.example.testBean;

public class Penguin {
	private int id;
	private String name;

	public Penguin(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void eat(){
		System.out.println("name" + "吃饭");
	}
}
