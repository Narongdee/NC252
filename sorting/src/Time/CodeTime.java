package Time;

public class CodeTime {

	private long actionTime = 0;
	
	public CodeTime () {}
	
	public void  startTime () {
		this.actionTime = System.nanoTime();
	}
	
	public void stopTime () {
		this.actionTime = System.nanoTime() - actionTime;
	}
	
	public void resetTime () {
		this.actionTime = 0;
	}

	public long getActionTime() {
		return actionTime;
	}
	
	public String toString() {
		//String text = "Time is " + this.actionTime + " nanoseconds";
		return "Time is " + this.actionTime + " nanoseconds";
	}
	
	
}
