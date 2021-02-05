class AdvancedStopTread implements Runnable {
	public void run(){
		try {
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("Thread is alive..");;
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			
		}finally{
			System.out.println("Thread is dead..");;
		}
	}
}

public class AdvancedStopThreadTest{
	public static void main(String[] args){
		System.out.println("# Start AdvancedStopThreadTest.java");
		AdvancedStopThreadTest astt = new AdvancedStopThreadTest();
		astt.process();
	}

	public void process(){
		AdvancedStopTread ast = new AdvancedStopTread();
		Thread thread = new Thread(ast);
		thread.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		thread.interrupt();
	
	}

}
