package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{
	int number=0;
	ThreadedGreeter(int number){
		this.number=number;
	}
	@Override
	public void run() {
		System.out.println("Hello from thread number: "+number);
		if(number<50) {
			Thread t=new Thread(new ThreadedGreeter(number+1));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
