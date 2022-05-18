package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int addRes  = calculator.add(1110,1230,4567);
		double subRes = calculator.sub(34567, 4560);
		double mulRes = calculator.mul(5431, 213);
		float divRes = calculator.div(54f, 9f);
		System.out.println("addition result "+ addRes);
		System.out.println("Subtraction result " + subRes);
		System.out.println("Multiplication result "+ mulRes);
		System.out.println("Division Result "+divRes);

	}


}
