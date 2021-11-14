package io.JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("Testing MathsUtils")
class MathUtilsTest {
	
	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathUtils = new MathUtils();
		//testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with Tags"+testInfo.getTags());
	}
	
	@Nested
	@DisplayName("add Method")
	@Tag("Math")
	class AddTest{
		
		@Test
		@DisplayName("while adding positive numbers")
		void addPositive() {
			int expected = 2;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected, actual, () -> "Should return right sum "+expected+" but it was "+actual);
		}
		
		@Test
		@DisplayName("while adding Negetive Numbers")
		void addNegetive() {
			assertEquals(-3, mathUtils.add(2, -5));
		}
	
	}
	
	@RepeatedTest(3)
	@DisplayName("sub Method")
	@Tag("Math")
	void testSub() {
		assertEquals(10, mathUtils.sub(12, 2), "Should return right substracted value");
	}
	
	@Test
	@DisplayName("Mutliply Method")
	void mul() {
			assertAll(
					() -> assertEquals(4, mathUtils.mul(2, 2)),
					() -> assertEquals(0, mathUtils.mul(2, 0)),
					() -> assertEquals(-2, mathUtils.mul(-1,2))
			);
	}
	
	@Test
	@Tag("Math")
	void testDivide() {
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with Tags"+testInfo.getTags());
		assertThrows(ArithmeticException.class, () -> mathUtils.div(1, 0), "Divide by zero throws exception");
	}
	
	@Test
	@Tag("Circle")
	void testComputeCircleArea() {
		assertEquals(314.1592653589793 ,mathUtils.computeCircleArea(10), "The method should return area of the circle");
		
	}
	
	@Test
	@Disabled
	@DisplayName("Test-Driven Development. Should not run")
	void testDisabled() {
		fail("This method should be disabled");
	}
	
}
