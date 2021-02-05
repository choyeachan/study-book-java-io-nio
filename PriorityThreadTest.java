class PriorityThread implements Runnable {
	public void run(){
		try{
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("Priority : "+Thread.currentThread().getPriority());
				Thread.sleep(500);
			}
		}catch(InterruptedException e){

		}
	}
}

public class PriorityThreadTest {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Start Main..");
		System.out.println("Thread.MAX_PRIORITY : "+ Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY : "+Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY : "+Thread.NORM_PRIORITY);

		Thread t = new Thread(new PriorityThread());
		t.start();
		Thread.sleep(500);

		t.setPriority(Thread.MIN_PRIORITY);
		Thread.sleep(500);

		t.setPriority(8);
		Thread.sleep(500);

		t.setPriority(Thread.MAX_PRIORITY);
		Thread.sleep(500);

		t.interrupt();

		System.out.println("End Main..");
	}
}
