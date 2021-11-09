package com.generics;

class TestGenerics<T> {
	// An object of type T is declared
	T obj;

	TestGenerics(T obj) { // constructor
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}


