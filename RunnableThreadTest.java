class RunnableThread implements Runnable {
	public void run() {
		System.out.println("Runnable 인터페이스를 구현");
	}
}

public class RunnableThreadTest {
	public static void main(String[] args){
		Thread t = new Thread(new RunnableThread());
		t.start();
	}
}
