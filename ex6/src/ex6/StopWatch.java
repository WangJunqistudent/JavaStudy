package ex6;

import java.util.Date;

public class StopWatch {
	private long startTime, endTime;
	
	public StopWatch() {
		this.startTime = 0;
		this.endTime = 0;
	}
	
	public void start() {
		Date time = new Date();
		this.startTime = time.getTime();
	}
	
	public void stop() {
		Date time = new Date();
		this.endTime = time.getTime();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
