package kh.sorting.selection;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testFindSmallestInList_atEnd() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 3, 2, 1 );
		
		Integer result = selectionSort.findSmallestInList(list1);
		assertEquals(Integer.valueOf(1), result);
	}

	@Test
	public void testFindSmallestInList_inMiddle() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 1, 4, 5 );
		
		Integer result = selectionSort.findSmallestInList(list1);
		assertEquals(Integer.valueOf(1), result);
	}
	
	@Test
	public void testSelectionSort() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 3, 2, 1 );
		
		List<Integer> result = selectionSort.selectionSort(list1);		
		assertEquals(Arrays.asList( 1, 2, 3, 4, 5 ), result);
	}

	@Test
	public void testSelectionSort_allValuesTheSame() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 5, 5 );
		
		List<Integer> result = selectionSort.selectionSort(list1);		
		assertEquals(Arrays.asList( 5, 5, 5 ), result);
	}
	
	/**
	 * Test sorting with duplicate values but in non-consecutive positions.
	 */
	@Test
	public void testSelectionSort_duplicatesNonConsecutive() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 3, 4, 1 );
		
		List<Integer> result = selectionSort.selectionSort(list1);		
		assertEquals(Arrays.asList( 1, 3, 4, 4, 5 ), result);
	}

	/**
	 * Test sorting with duplicate values but in non-consecutive positions.
	 */
	@Test
	public void testSelectionSort_duplicatesConsecutive() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 3, 4, 4, 1 );
		
		List<Integer> result = selectionSort.selectionSort(list1);		
		assertEquals(Arrays.asList( 1, 3, 4, 4, 5 ), result);
	}

	@Test
	public void testSelectionSort_inPlace() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 3, 2, 1 );
		
		List<Integer> result = selectionSort.selectionSortInPlace(list1);		
		assertEquals(Arrays.asList( 1, 2, 3, 4, 5 ), result);
	}

	@Test
	public void testSelectionSort_inPlace_duplicatesNonConsecutive() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 4, 3, 4, 1 );
		
		List<Integer> result = selectionSort.selectionSortInPlace(list1);		
		assertEquals(Arrays.asList( 1, 3, 4, 4, 5 ), result);
	}

	@Test
	public void testSelectionSort_inPlace_duplicatesConsecutive() {
		SelectionSort selectionSort = new SelectionSort();
		
		List<Integer> list1 = Arrays.asList( 5, 3, 4, 4, 1 );
		
		List<Integer> result = selectionSort.selectionSortInPlace(list1);		
		assertEquals(Arrays.asList( 1, 3, 4, 4, 5 ), result);
	}

}
