package com.example.generics;

public class DataHolder<T,V> {

	T data;
	V size;

	public DataHolder(T data) {
		this.data = data;
	}

	public DataHolder(T data,V size) {
		this.data = data;
		this.size = size;
	}

	public void display() {
		System.out.println(this.data);
		System.out.println(this.size);
	}
	
	public T read() {
		return this.data;
	}

	public V readSize() {
		return this.size;
	}
}
