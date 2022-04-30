package week3.day1;

public class Automation extends ParentLanguage implements Language, TestTool {

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}
	
	public void Action() {
		this.Selenium();
		this.Java();
		System.out.println(this.a);
		super.learnSuper();
	}
	
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Action();
	}
	
	
	

}
