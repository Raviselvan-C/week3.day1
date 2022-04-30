package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID - "+ id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID - "+ id+";"+" Student Name - "+ name);
	}
	
	public void getStudentInfo(String email, long pH) {
		System.out.println("Student Contact - "+ pH+";"+" Student eMail - "+ email);
	}
	
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(53);
		obj.getStudentInfo(53, "C.Raviselvan");
		obj.getStudentInfo("ravi.ulagu@gmai.com", 9952552257l);
	}

}
