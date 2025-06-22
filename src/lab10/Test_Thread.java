package lab10;

import java.io.IOException;

public class Test_Thread extends Thread {
	@Override
	public void run() {
		System.out.println(" start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println(" end thread");
	}

	public static void main(String[] args) throws IOException {
		int MAX = 2;
		for (int i = 0; i < MAX; i++) {
			(new Test_Thread()).start();
		}
		System.out.println("finish");
	}

}