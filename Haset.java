import java.util.*;

public class Haset {
	public static void main(String[] args)
    {

        HashSet<ArrayList> set = new HashSet<>();
        HashSet<ArrayList> secondset = new HashSet<>();
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        l1.add("Asri");
        l1.add("Liki");
        set.add(l1);
        l2.add("Abhi");
        l2.add("Ani");
        set.add(l2);
       System.out.println(set);
       secondset=(HashSet<ArrayList>) set.clone();
       System.out.println(secondset);
       l1.add("preethi");
       System.out.println(secondset);
       System.out.println(set);


    }
}
