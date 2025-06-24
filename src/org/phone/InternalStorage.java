package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("Processor Name  : Intel");
	}
	public void ramSize() {
		System.out.println("Ram Size :3535435");
	}
	public void ramSizeModify() {
		System.out.println("Suguna");
	}
	public static void main(String[] args) {
		
		InternalStorage is= new InternalStorage();
		ExternalStorage ex = new ExternalStorage();
		ex.size();
		is.processorName();
		is.ramSize();		
		is.ramSizeModify();

	}

}
