package clone;
import java.util.Collection;
import java.util.HashSet;

import clone.Student;

public class cloneobj {
	public static void main(String args[])
    {  
        HashSet<Object> set = new HashSet<>();
        Student s1=new Student(1,"Asri");
        Student s2=new Student(2,"Liki");      
        set.add(s1);
        set.add(s2);
        display(set);    
        Object setclone = new HashSet<String>();
        setclone=set.clone();
        display((HashSet<Object>) setclone);
        s1.setName("Abhi");
        display((HashSet<Object>) setclone);
        display(set);
        }

	private static void display(HashSet<Object> set) {
		
		 for(Object s:set){

	            System.out.println(((Student) s).getId()+" "+((Student) s).getName()+" ");

	        }
	}
}