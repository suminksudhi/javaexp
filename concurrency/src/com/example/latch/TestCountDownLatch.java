package com.example.latch;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * TEST Class :: To demonstrate the Use of CountDownLatch<br>
 * Use Case: Race Course
 * 
 * @author Dilip Savant
 *
 */
public class TestCountDownLatch {

	public static void main(String[] args) {

		CountDownLatch signalRaceStart = new CountDownLatch(1);
		CountDownLatch signalRaceFinished = new CountDownLatch(10);

		BlockingQueue<String> riderFinishLineCrossOrderQueue = new ArrayBlockingQueue<>(10);
		
		Rider rider01 = new Rider(signalRaceStart, signalRaceFinished, 100L, riderFinishLineCrossOrderQueue);
		Rider rider02 = new Rider(signalRaceStart, signalRaceFinished, 90L, riderFinishLineCrossOrderQueue);
		Rider rider03 = new Rider(signalRaceStart, signalRaceFinished, 70L, riderFinishLineCrossOrderQueue);
		Rider rider04 = new Rider(signalRaceStart, signalRaceFinished, 80L, riderFinishLineCrossOrderQueue);
		Rider rider05 = new Rider(signalRaceStart, signalRaceFinished, 55L, riderFinishLineCrossOrderQueue);
		Rider rider06 = new Rider(signalRaceStart, signalRaceFinished, 45L, riderFinishLineCrossOrderQueue);
		Rider rider07 = new Rider(signalRaceStart, signalRaceFinished, 65L, riderFinishLineCrossOrderQueue);
		Rider rider08 = new Rider(signalRaceStart, signalRaceFinished, 70L, riderFinishLineCrossOrderQueue);
		Rider rider09 = new Rider(signalRaceStart, signalRaceFinished, 75L, riderFinishLineCrossOrderQueue);
		Rider rider10 = new Rider(signalRaceStart, signalRaceFinished, 85L, riderFinishLineCrossOrderQueue);

		Thread riderThread01 = new Thread(rider10, "Rider Code 10");
		Thread riderThread02 = new Thread(rider09, "Rider Code 09");
		Thread riderThread03 = new Thread(rider08, "Rider Code 08");
		Thread riderThread04 = new Thread(rider07, "Rider Code 07");
		Thread riderThread05 = new Thread(rider06, "Rider Code 06");
		Thread riderThread06 = new Thread(rider05, "Rider Code 05");
		Thread riderThread07 = new Thread(rider04, "Rider Code 04");
		Thread riderThread08 = new Thread(rider03, "Rider Code 03");
		Thread riderThread09 = new Thread(rider02, "Rider Code 02");
		Thread riderThread10 = new Thread(rider01, "Rider Code 01");
		
		RaceCoordinator raceCoordinator = new RaceCoordinator(signalRaceStart, signalRaceFinished, riderFinishLineCrossOrderQueue);
		Thread raceCoordinatorThread = new Thread(raceCoordinator, "Race Coordinator");
		
		// Riders All Set
		riderThread01.start();
		riderThread02.start();
		riderThread03.start();
		riderThread04.start();
		riderThread05.start();
		riderThread06.start();
		riderThread07.start();
		riderThread08.start();
		riderThread09.start();
		riderThread10.start();
		// Race Coordinator Ready to fire
		raceCoordinatorThread.start();
	}

}

/**
 * Rider
 * 
 * @author User
 *
 */
class Rider implements Runnable {

	CountDownLatch signalRaceStart;

	CountDownLatch signalRaceFinished;

	BlockingQueue<String> riderFinishLineCrossOrderQueue;

	Long raceFinishAbility;

	/**
	 * 
	 * @param raceStart
	 * @param raceFinished
	 * @param raceFinish
	 * @param clockRaceFinishEntry
	 */
	public Rider(CountDownLatch raceStart, CountDownLatch raceFinished, Long raceFinish,
			BlockingQueue<String> clockRaceFinishEntry) {

		signalRaceStart = raceStart;
		signalRaceFinished = raceFinished;
		raceFinishAbility = raceFinish;
		riderFinishLineCrossOrderQueue = clockRaceFinishEntry;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " : All Set to Kick-Start");
		try {
			signalRaceStart.await();
			System.out.println(Thread.currentThread().getName() + " : Kick-Ass Start !!!");
			TimeUnit.MILLISECONDS.sleep(raceFinishAbility);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			riderFinishLineCrossOrderQueue.add(Thread.currentThread().getName());
			signalRaceFinished.countDown();
			System.out.println(Thread.currentThread().getName() + " : Crossed the Finish Line !!!");
		}
	}

}

/**
 * Race Coordinator
 * 
 * @author User
 *
 */
class RaceCoordinator implements Runnable {

	CountDownLatch signalRaceStart;

	CountDownLatch signalRaceFinished;

	BlockingQueue<String> riderFinishLineCrossOrderQueue;

	/**
	 * 
	 * @param raceStart
	 * @param raceFinished
	 * @param clcokRaceFinishEntry
	 */
	public RaceCoordinator(CountDownLatch raceStart, CountDownLatch raceFinished,
			BlockingQueue<String> clcokRaceFinishEntry) {

		signalRaceStart = raceStart;
		signalRaceFinished = raceFinished;
		riderFinishLineCrossOrderQueue =  clcokRaceFinishEntry;
	}

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + " : On Your Marks");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(Thread.currentThread().getName() + " : Get Set");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(Thread.currentThread().getName() + " : Go !!!");
			// The Bullet Fired
			signalRaceStart.countDown();
			signalRaceFinished.await();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("Race has been finished !!!");
			try {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Hold on your every Breath !!!");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("And the results are :-");
				riderFinishLineCrossOrderQueue.forEach(riderName -> System.out.println(riderName));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
