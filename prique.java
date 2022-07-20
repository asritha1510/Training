import java.util.ArrayList;
import java.util.PriorityQueue;

public class prique {

	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<>();
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(0);
		System.out.println(al);	
		
		pq.addAll(al);
		System.out.println(pq);	
		
	}
}
