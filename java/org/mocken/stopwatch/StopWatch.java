package org.mocken.stopwatch;

public class StopWatch {
	
	private long startTime;
	private long stopTime = -1L;
	
	public StopWatch() {
		startTime = System.nanoTime();
	}
	
	public void restart() {
		startTime = System.nanoTime();
	}
	
	public void stop() {
		stopTime = System.nanoTime();
	}
	
	public long getElapsedTime() {
		return stopTime>-1?stopTime-startTime:System.nanoTime()-startTime;
	}
	
	public long getElapsedTimeInMS() {
		return (stopTime>-1?stopTime-startTime:System.nanoTime()-startTime)/1000000L;
	}

}
