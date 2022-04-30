package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("18 inch Screen");
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
		
	}

}
