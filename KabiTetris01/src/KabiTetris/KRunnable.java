package KabiTetris;

import java.util.Random;

public class KRunnable implements Runnable {
	
	private static final Random random = new Random();
	
	@Override
	public void run() {
		System.out.println("**** KRunnable Start *****");
		
		String threadName = Thread.currentThread().getName();
		System.out.printf("- %s has been started %n", threadName);
		int delay = 1000 + random.nextInt(4000);
		try {
			Thread.sleep(delay);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("- %s has been ended (%d)ms %n", 
				threadName, delay);
		
		System.out.println("**** KRunnable Finish *****");
	}

}
