package ext;

public class SamsungCalculator implements Calculator {
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	@Override
	public int divided(int x, int y) throws ArithmeticException {
		return x + y;
	}
}
