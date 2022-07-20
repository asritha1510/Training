
public class gen {

	public static <E extends Comparable<E>> void maximum(E x, E y, E z) {
	    E max = x; 

	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 
	     System.out.println(max);
	  } 

	  public static void main(String args[]) {
	    maximum(1, 2, 3);
	    maximum(1.1,1.2,1.3);
	    maximum("asri", "abhi", "ani");
	  }
}
