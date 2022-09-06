package kh.sorting.bubblesort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test2Elements() {

		List<Integer> list = Arrays.asList(2, 1);
		List<Integer> result =  (new BubbleSort()).bubbleSort(list);
		
		assertEquals(Integer.valueOf(1), result.get(0));
		assertEquals(Integer.valueOf(2), result.get(1));
	}
	
	@Test
	public void testOddElements() {
	}

	@Test
	public void test4Elements() {

		List<Integer> list = Arrays.asList(2, 1, 4, 3);
		List<Integer> result =  (new BubbleSort()).bubbleSort(list);
		
		assertEquals(Integer.valueOf(1), result.get(0));
		assertEquals(Integer.valueOf(2), result.get(1));
		assertEquals(Integer.valueOf(3), result.get(2));
		assertEquals(Integer.valueOf(4), result.get(3));

	}
	
}
