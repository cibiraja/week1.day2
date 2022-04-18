package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		LearnMethods LM=new LearnMethods();
		LM.carName();
		int RegNumber=LM.getCarRegNumber();
		   System.out.println(RegNumber);
		   String Varient=LM.getCarVarient();
		   System.out.println(Varient);
		   int Multiply=LM.multiplyTwoNumbers(7,8);
		   System.out.println(Multiply);
	}
	
	public void carName() {
		System.out.println("Honda");
	}
	public int getCarRegNumber() {
		int CarRegNumber=1131;
		return CarRegNumber;
	}
	public String getCarVarient() {
		return"fuel";
	}
	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}
		
		
		
	}
	


