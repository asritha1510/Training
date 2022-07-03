package com.asri.objects;

public class Main {

    public static void main(String[] args) {
      String subject1[]= {  "java", "angular"};
      String subject2[]= {"react","angular"};
      String subject3[]= {"react","angular"};
      String subject4[]= {"react","angular"};
      String subject5[]= {"react","angular"};
      String timings1[]= {"9:10","11:12"};
      String timings2[]= {"9:10","12:13"};
      String timings3[]= {"9:10","12:13"};
      String timings4[]= {"9:10","12:13"};
      String timings5[]= {"9:10","12:13"};
      Student s[]=new Student[5];
    Student s1=new Student("rishi1", "c5",subject1,timings1);
    Student s2=new Student("rishi2", "c5",subject2,timings2);
    Student s3=new Student("rishi3", "c5",subject3,timings3);
    Student s4=new Student("rishi4", "c5",subject4,timings4);
    Student s5=new Student("rishi5", "c5",subject5,timings5);
   
//    for(int i=0;i<5;i++)
//    {
//    	s[i]=s1;
//    }
    s[0]=s5;
    s[1]=s4;
    s[2]=s3;
    s[3]=s2;
    s[4]=s1;
    for(int i=0;i<s.length-1;i++)
    	
    {
    	for(int j=0;j<s.length;j++)
    	{
    	if(s[i].getSubject()==s[j].getSubject())
    		System.out.println(s[i].getName());
    	}
    }
    }
}