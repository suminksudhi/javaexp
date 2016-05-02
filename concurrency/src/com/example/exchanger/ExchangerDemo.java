package com.example.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.stream.DoubleStream;

public class ExchangerDemo {

	DataContainer emptyContainer = null;
	DataContainer fullContainer = null;

	public static void main(String[] args) {
		new ExchangerDemo();
	}

	public ExchangerDemo() {
		
		emptyContainer = new DataContainer();
		fullContainer = new DataContainer();
		DoubleStream.of(34.56,23.54,32.45,67.34,6.89,45.78,34.8,78.00,45.00,80.00).forEach((value)->{
			fullContainer.writeData(value);
		});		
		
		Exchanger<DataContainer> exchanger = new Exchanger<>();

		new Thread(new Producer(exchanger)).start();
		new Thread(new Consumer(exchanger)).start();
	}

	class Producer implements Runnable {

		Exchanger<DataContainer> exchanger = null;

		public Producer(Exchanger<DataContainer> exchanger) {
			this.exchanger = exchanger;
		}

		public void run() {
			DataContainer dataContainer = emptyContainer;
			while(true){
				
				while(!dataContainer.isFull()){
					dataContainer.writeData((Math.random()*5000));
				}
				try {
					System.out.println("Producer filled the bucket and reached the barrier point!");
					dataContainer = exchanger.exchange(dataContainer);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}

		}
	}

	class Consumer implements Runnable {

		Exchanger<DataContainer> exchanger = null;

		public Consumer(Exchanger<DataContainer> exchanger) {
			this.exchanger = exchanger;
		}

		public void run() {
			DataContainer dataContainer = fullContainer;
			while(true){
				
				while(!dataContainer.isEmpty()){
					System.out.printf("Consumed : %s%n",dataContainer.readData());
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consumer emptied the bucket and reached the barrier point!");
				try {
					dataContainer = exchanger.exchange(dataContainer);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

	class DataContainer {

		List<Double> data = new ArrayList<>();

		public double readData() {
			int idx = data.size() - 1;
			return data.remove(idx);
		}

		public void writeData(double value) {
			data.add(value);
		}

		public boolean isFull() {
			if (data.size() == 10)
				return true;
			return false;
		}

		public boolean isEmpty() {
			if (data.size() == 0)
				return true;
			return false;
		}

	}
}
