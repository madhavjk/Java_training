
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class to be executed
class Task implements Runnable
{
	private String name;
	
	public Task(String s)
	{
		name = s;
	}
	
	
	public void run()
	{
	
			for (int i = 1; i<=10; i++)
			{
				
				System.out.println(i);
					//prints the initialization time for every task
			
			}
			
   }
}
		
	

public class Test
{
	// Maximum number of threads in thread pool
	static final int MAX_T = 5;			

	public static void main(String[] args)
	{
		// creates five tasks
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");
		Runnable r4 = new Task("task 4");
		Runnable r5 = new Task("task 5");
		Runnable r6 = new Task("task 6");
		Runnable r7 = new Task("task 7");
		Runnable r8 = new Task("task 8");
		Runnable r9 = new Task("task 9");
		Runnable r10 = new Task("task 10");
		
		
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		// passes the Task objects to the pool to execute
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.execute(r6);
		pool.execute(r7);
		pool.execute(r8);
		pool.execute(r9);
		pool.execute(r10);
		
		// pool shutdown
		pool.shutdown();	
	}
}
