import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class hashfile {
	
	public static void main(String[] args)
    {
		
        HashMap<String,String> map= new HashMap<>();
        map.put("Animal", "Tiger");
        map.put("Bird", "Parrot");
        map.put("Reptile", "Crocodile");
        

        
        HashMap<String,Integer> map1= new HashMap<>();
        map1.put("Dog", 1);
        map1.put("Cat", 2);
        map1.put("Pig", 3);
       File f=new File("C:\\Users\\adiddi\\Desktop\\example1.txt");
       
        try {
        	filewrite(map);
        	filewrite(map1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
        	fileread(f);     	
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

	private static void fileread(File f) throws FileNotFoundException {
		Scanner sc=new Scanner(f);
    	String s;
    	while(sc.hasNext()) {
    		s=sc.nextLine();
    				System.out.println(s);
    	}
		
	}

	private static <V, K> void filewrite(HashMap<K, V> map) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\adiddi\\Desktop\\example1.txt",true);
        for (Entry<K, V> entry :
             map.entrySet()) {
            fw.write(entry.getKey() + ":"
                     + entry.getValue()+"\n");
            
        }
        fw.close();
	}


}
