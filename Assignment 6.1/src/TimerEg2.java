
public class TimerEg2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(5000);
				System.out.println("5 Second Timeout Message");
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
			}
		}

	}
}
