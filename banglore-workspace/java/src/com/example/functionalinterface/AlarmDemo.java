package com.example.functionalinterface;

public class AlarmDemo {
	
	public static void main(String[] args) {
		new AlarmDemo();
	}

	public AlarmDemo() {
		demoTwo();
		demoOne();
	}

	private void demoTwo(){
		startAlarm(()-> System.out.printf("Hello Mr. Lazy man, get up fast.... House is on fire...."));
	}

	private void demoOne(){
		IAlarmService alarmService = () -> System.out.println("Hello Mr. Lazy man, get up fast.... House is on fire....");
		alarmService.blowAlarm();
	}
	
	public void startAlarm(IAlarmService alarmService){
		alarmService.blowAlarm();
	}
	
}