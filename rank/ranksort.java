package rank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ranksort {
	 public static void main(String[] args) {
	        ArrayList<Integer> al=new ArrayList<>();
	        int num;
	        Scanner sc=new Scanner(System.in);
	        while((num=sc.nextInt())!=-1){
	            al.add(num);
	        }
	        sorting(al);
	        System.out.println(al);
	    }
	    private static void sorting(ArrayList<Integer> al) {
	        PriorityQueue<Numbers> pq=new PriorityQueue<>(new Comparator<Numbers>() {
	            public int compare(Numbers o1, Numbers o2) {
	                return o2.value-o1.value;
	            }   
	        });
	        for(int i=0;i<al.size();i++)
	            pq.add(new Numbers(al.get(i),i));
	        int rank=al.size();
	        while (!pq.isEmpty()) {
	            al.set(pq.poll().rankk,rank);
	            --rank;
	        }
	    }
}


