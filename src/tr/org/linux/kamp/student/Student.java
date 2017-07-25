package tr.org.linux.kamp.student;

public class Student {

	private String name;
	private double avg;
	
	public Student(String name,double avg) {
		this.name=name;
		if(avg>=0.0 && avg<=100 ) {
			
			this.avg=avg;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		if(avg>=0.0 && avg<=100 ) {
			this.avg=avg;
		}
	}
	
	public String getLetterGrade() {
		String letterGrade="";
		
		if(avg>=90.0) {
			letterGrade="A";
		}
		else if(avg>=80.0) {
			letterGrade="B";
		}
		else if(avg>=70.0) {
			letterGrade="C";
		}
		else if(avg>=60.0) {
			letterGrade="D";
		}
		else {
			letterGrade="F";
		}
		
		return letterGrade;
		
		
	}
}
