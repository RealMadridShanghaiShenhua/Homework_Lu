package Chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DataCalculatorTest {

	@Test
	@DisplayName("1 + 1 = 2")
	void addTwoNumbersTypeOne() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(2, calculator.addTypeOne(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{1} + {1} = {2}")
	@CsvSource({
			"1,    1,   2",
			"1,    2,   3"
	})
	void addTypeOne(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.addTypeOne(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("1 += 100 = 101")
	void addTwoNumbersTypeTwo() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(101, calculator.addTypeTwo(1, 100), "1 += 100 should equal 101");
	}

	@ParameterizedTest(name = "{1} += {100} = {101}")
	@CsvSource({
			"1,  100,  101",
		    "2,    5,   7"
	})
	void addTypeTwo(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.addTypeTwo(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("3 - 1 = 2")
	void minusTwoNumbers() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(2, calculator.minus(3, 1), "3 - 1 should equal 2");
	}

	@ParameterizedTest(name = "{3} - {1} = {2}")
	@CsvSource({
			"3,  1,  2",
			"6,  2,  4"
	})
	void minus(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.minus(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("2 * 5 = 10")
	void multiplyTwoNumbers() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(10, calculator.multiply(2, 5), "2 * 5 should equal 10");
	}

	@ParameterizedTest(name = "2 * {5} = {10}")
	@CsvSource({
			"2,  5,  10",
			"3,  6,  18"
	})
	void multiply(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.multiply(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("9 / 3 = 3")
	void divideTwoNumbers() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(3, calculator.divide(9, 3), "9 / 3 should equal 3");
	}

	@ParameterizedTest(name = "{9} / {3} = {3}")
	@CsvSource({
			"9,  3,  3",
			"4,  2,  2"
	})
	void divide(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.divide(first, second),
				() -> first + " / " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("10 % 4 = 2")
	void modTwoNumbers() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(2, calculator.mod(10, 4), "10 % 4 should equal 2");
	}

	@ParameterizedTest(name = "{10} % {4} = {2}")
	@CsvSource({
			"10,  4,  2",
			"8,   5,  3"
	})
	void mod(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.mod(first, second),
				() -> first + " % " + second + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("return ++1 = 2")
	void incrementTypeOne() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(2, calculator.incrementTypeOne(1), "return ++1 should equal 2");
	}

	@ParameterizedTest(name = "return ++ {1}  = {2}")
	@CsvSource({
			"1  ,  2",
			"5  ,  6"
	})
	void incrementTypeOne(int first, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.incrementTypeOne(first),
				() ->  " return ++" + first  + " should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("return 1++ = 1")
	void incrementTypeTwo() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(1, calculator.incrementTypeTwo(1), "return 1++ should equal 1");
	}

	@ParameterizedTest(name = "return {1} ++  = {1}")
	@CsvSource({
			"1  ,  1",
			"7  ,  7"
	})
	void incrementTypeTwo(int first, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.incrementTypeTwo(first),
				() -> first + "return " + "++ should equal " + expectedResult);
	}
	
	@Test
	@DisplayName("the larger one between 5 and 3 is 5")
	void getLargerOne() {
		DataCalculator calculator = new DataCalculator();
		assertEquals(5, calculator.getLargerOne(5, 3), "the larger one between 5 and 3 should be 5");
	}

	@ParameterizedTest(name = "the larger one between 5 and 3 is 5")
	@CsvSource({
			"5,  3,  5",
			"9,  2,  9"
	})
	void getLargerOne(int first, int second, int expectedResult) {
		DataCalculator calculator = new DataCalculator();
		assertEquals(expectedResult, calculator.getLargerOne(first, second),
				() -> "the larger one between" +first + " and " + second + " should be " + expectedResult);
	}
}
