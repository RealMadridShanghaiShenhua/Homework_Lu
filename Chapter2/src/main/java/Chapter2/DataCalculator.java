package Chapter2;

public class DataCalculator {

	public int addTypeOne(int a, int b) {
		return a + b;
	}
	
	public int addTypeTwo(int a, int b) {
		return a += b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public int mod(int a, int b) {
		return a % b;
	}
	
	public int incrementTypeOne(int a) {
		return ++a;
	}
	
	public int incrementTypeTwo(int a) {
		return a++;
	}
	
	public int getLargerOne(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}
}
