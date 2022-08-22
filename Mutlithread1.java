class MultithreadingDemo extends Thread {
	public void run()
	{
	
			// Displaying the thread that is running
			System.out.println("Hello All");
		
		
	}
}


public class Multithread1 {
	public static void main(String[] args)
	{
		int n = 5; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
	}
}
