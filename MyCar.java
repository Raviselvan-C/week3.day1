package week3.day1;

public class MyCar {
	
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.applyBrake();
		obj.sounfHorn();
		
		Car obj1= new Car();
		obj1.applyBrake();
		obj1.sounfHorn();
		obj1.handBrake();
		obj1.turnAC();
		
		BMW obj2 = new BMW();
		obj2.applyBrake();
		obj2.sounfHorn();
		obj2.handBrake();
		obj2.turnAC();
		obj2.autoPark();
		
		
	}
	

}
