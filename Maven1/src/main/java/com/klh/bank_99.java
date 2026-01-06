package com.klh;

class Bank{
	void getInterest() {
		System.out.println("Interest by : ");
	}
}
class SBI extends Bank{
	@Override
	void getInterest() {
		System.out.println("SBI_90099");
	}
}
class HDFC extends Bank{
	@Override
	void getInterest() {
		System.out.println("HDFC_90099");
	}
}

public class bank_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		b1.getInterest();
		b2.getInterest();

	}

}
