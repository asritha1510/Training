import java.util.ArrayList;
import java.util.Scanner;

public class waterstore {
	
	public static void main(String args[]) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);arr.add(0);arr.add(3);arr.add(0);arr.add(5);arr.add(0);arr.add(0);
			System.out.println(arr);
		Scanner sc=new Scanner(System.in);
			int lit=0,level=0;int k;
			System.out.println("Enter no of litres to be stored");
			k = sc.nextInt();
	while(lit<k) {	
	for(int i=0;i<arr.size();i++) {
		if(arr.get(i)==0) {
			lit++;
		}
		else 
			arr.set(i,arr.get(i)-1);
	}
	level++;		
	}	
	System.out.println("No of levels "+level);
	}
}
