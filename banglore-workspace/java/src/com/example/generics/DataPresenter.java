package com.example.generics;

public class DataPresenter<K> {

	public <T> void show(T data){
		System.out.println(data);
	}

	public <T,V> void showData(T data,V value){
		System.out.println(data);
		System.out.println(value);
	}
	
	public <T,V> void showMoreData(T data,V value,V size){
		System.out.println(data);
		System.out.println(value);
		System.out.println(size);
	}
	
	public <T> T manipulateData(T data){
		System.out.println(data);
		return data;
	}
	
	public <T> void show(T data,K result){
		System.out.println(data);
		System.out.println(result);
			
	}
}
