package com.asri.objects;

public class Student {
    private String name;
	private String batch ;
    private String subject[]=new String[2];
    private String timings[]=new String[2];
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}


	public String[] getSubject() {
		return subject;
	}


	public void setSubject(String[] subject) {
		this.subject = subject;
	}


	public String[] getTimings() {
		return timings;
	}


	public void setTimings(String[] timings) {
		this.timings = timings;
	}


    

    public Student(String n, String b, String s[],String t[]) {
        this.name = n;
        this.batch = b;
        this.subject = s;
        this.timings=t;
    }

}
