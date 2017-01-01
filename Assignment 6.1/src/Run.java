
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerEg1 te1 = new TimerEg1();
		System.out.println("You time starts now:");
		te1.start();
		TimerEg2 te2 = new TimerEg2();
		Thread t = new Thread(te2);
		t.start();
	}

}

/*
 ******************************************************************************
 * Output:
 * You time starts now:
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
5 Second Timeout Message
10 Second Timeout Message
 ******************************************************************************
 * 
 */