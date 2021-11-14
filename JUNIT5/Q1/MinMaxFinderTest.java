package io.Junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	
	@Test
	@DisplayName("Testing findMinMax method")
	void testFindMinMax() {
		
		MinMaxFinder minMaxFinder = new MinMaxFinder();
		
		int[] expected = new int[] {3, 56};
		int[] actual = minMaxFinder.findMinMax(new int[] {56, 34, 7, 3, 54, 3, 34, 34, 53});
		
		assertArrayEquals(expected, actual , "The arrays Should be equal");
		
	}

}
