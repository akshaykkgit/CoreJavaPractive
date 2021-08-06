package akshay.compare;

public class Student implements Comparable<Student>{
	
	
	int rollNo;
	String name;
	int age;
	
	Student(int rollno,String name,int age){  
		this.rollNo=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	

	@Override
	public int compareTo(Student st) {
		 
		if(age==st.age) {
			return 0;
		}
		else if (age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	

}
