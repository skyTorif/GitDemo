package com.li.test;

public class GitDemo {

	public static String show(String word){
		System.out.println("我改的是show函数！");
		return word;
	}
	
	public static void print(String word){
		System.out.println(show(word));
	}
	
	public static void main(String[] args){
		System.out.println(show("hello world!"));
		print("world");
		int b = 2;
		int a = b;
		System.out.println("我改的是main主函数！");
	}
}
