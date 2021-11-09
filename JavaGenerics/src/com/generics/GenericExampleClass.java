package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleClass<T> { // <T> generics class with Type as T

	List<T> list = new ArrayList<>();
//	T obj;
//	public GenericExampleClass(T obj) {
//		this.obj = obj;
//	}
//	
	

	public void setValue(List<T> setList) {
		this.list = setList;
	}


	public void showList() {
		System.out.println(list);
	}

}
