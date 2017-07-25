package tr.org.linux.kamp.student;

public class AppStudent {

	public static void main(String[] args) {
		
		Student student1=new Student("ali veli",80);
		System.out.println(student1.getName() +"nin harf notu: "+ student1.getLetterGrade());
	}
}
