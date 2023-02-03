package org.mocken.stopwatch;

public class StopWatch {
	
	private long startTime;
	private long lapTime = -1L;
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
	
	public long getElapsedTimeInNanos() {
		return stopTime>-1?stopTime-startTime:System.nanoTime()-startTime;
	}
	
	public long getElapsedTimeInMS() {
		return (stopTime>-1?stopTime-startTime:System.nanoTime()-startTime)/1000000L;
	}
	
	public long getLapTimeInMS() {
		long value = (lapTime>-1?System.nanoTime()-lapTime:System.nanoTime()-startTime)/1000000L;
		lapTime = System.nanoTime();
		return value;
	}

}
