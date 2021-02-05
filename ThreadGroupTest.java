public class ThreadGroupTest {
	public static void main(String[] args){
		System.out.println("ThreadGroupTest: "+ Thread.currentThread());

		ThreadGroup tGroup1 = new ThreadGroup(Thread.currentThread().getThreadGroup(), "ThreadGroup1");
		ThreadGroup tGroup2 = new ThreadGroup("ThreadGroup2");
		ThreadGroup tGroup3 = new ThreadGroup(tGroup1, "ThreadGroup3");

		Thread t1 = new Thread(tGroup1,"Thread-1");
		Thread t2 = new Thread(tGroup2,"Thread-2");
		Thread t3 = new Thread(tGroup3,"Thread-3");
		
		System.out.println(" t1: "+t1);
		System.out.println(" t2: "+t2);
		System.out.println(" t3: "+t3);

		System.out.println(
			"main 스레드 그룹:"	
			+ Thread.currentThread().getThreadGroup()
			+", 활동중인 스레드 개수:"
			+ Thread.currentThread().getThreadGroup().activeCount()
			+", 활동중인 스레드 그룹개수:"
			+ Thread.currentThread().getThreadGroup().activeGroupCount()
		);

		Thread.currentThread().getThreadGroup().list();
	}
}
