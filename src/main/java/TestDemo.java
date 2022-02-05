import java.util.Random;

public class TestDemo {
	
	int addPositive(int a, int b) {
		if (a > 0 && b > 0) {//both numbers are above zero, no errors
			return a + b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	//method we are testing
	 int randomNumberSquared() {
		 int i = getRandomInt();	 
		 return i * i;	
	}
	 //method we are mocking
	 int getRandomInt() {
		 Random random = new Random();
		 return random.nextInt(10) + 1;
	 }
}
