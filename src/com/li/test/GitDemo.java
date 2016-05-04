package com.li.test;

public class GitDemo {

	public static String show(String word){
		return word;
	}
	
	public static void print(String word){
		System.out.println(show(word));
	}
	
	public static void main(String[] args){
		System.out.println(show("hello world!"));
		print("world");
	}
}
