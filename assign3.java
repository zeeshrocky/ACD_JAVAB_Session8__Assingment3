public class ThreadPriority extends Thread {
	public void run(){
		System.out.println("Name of the running thread:"+Thread.currentThread().getName());  
		System.out.println("Priority of the running thread:"+Thread.currentThread().getPriority());  
		}  
	public static void main(String args[]){  
		ThreadPriority t1=new ThreadPriority();  
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t3.setName("Thread-C");
		t1.setPriority(Thread.MIN_PRIORITY);  
		t2.setPriority(Thread.NORM_PRIORITY);  
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();  
		t2.start();  
		t3.start();
		}  
}