class StopThread implements Runnable {
	private boolean stopped = false;
	public void run(){
		while(!stopped){
			System.out.println("Thread is alive..");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Thread is dead..");
	}
	public void stop(){
		stopped = true;
	}
}

public class StopThreadTest {
	public static void main(String[] args){
		System.out.println("# Start StopThreadTest.java");
		StopThreadTest stt = new StopThreadTest();
		stt.process();
	}

	public void process(){
		StopThread st = new StopThread();	
		Thread thread = new Thread(st);
		thread.start();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		st.stop();
	}
}

