import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < 5; i++)
			q.add(Integer.parseInt(sc.next()));

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

		// To remove the head of queue.
	
		System.out.println("removed element-" + q.remove());
		System.out.println("removed element-" + q.remove());

		System.out.println(q);

		
	}
}
