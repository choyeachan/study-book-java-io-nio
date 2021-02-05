class ExtendThread extends Thread {
	public void run() {
		System.out.println("Thread 클래스를 상속");
	}
}

public class ExtendThreadTest {
	public static void main(String[] args){
		Thread t = new ExtendThread();
		t.start();
	}
}
