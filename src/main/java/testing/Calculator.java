package testing;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public void longCalculation() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Set<Integer> digitsSet(int number) {
		Set<Integer> setIntegers = new HashSet<>();
		String numberStr = String.valueOf(number);
		for(char c : numberStr.toCharArray()) {
			setIntegers.add(Integer.parseInt(String.valueOf(c)));
		}
		return setIntegers;
	}

}
