
public class TimerEg1 extends Thread {
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(10000);
				System.out.println("10 Second Timeout Message");
			} catch (InterruptedException ex) {
			}
		}
	}
}
