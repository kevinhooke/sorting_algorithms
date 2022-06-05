package kh.sorting.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Selection Sort algorithm: sorts a list by finding the next smallest value in the list
 * and swapping the value in the current start position in the list with the smallest value.
 * Repeats this approach starting at the next list index and continues until end of the list
 * is reached.
 *
 * Two implementation approaches:
 * 
 * - selectionSort() - using a new list for sorted values
 * - selectionSortInPlace() - in place sort swapping values as they are sorted
 * 
 * @author kevinhooke
 */
public class SelectionSort {

	public List<Integer> selectionSort(List<Integer> inputList){
		List<Integer> unsorted = new ArrayList<>();
		unsorted.addAll(inputList);
		
		List<Integer> sortedResult = new ArrayList<>();
	
		for(int currentIndex = 0; currentIndex < inputList.size(); currentIndex++){
			int currentSmallest = this.findSmallestInList(unsorted);
			sortedResult.add(currentSmallest);
			
			int indexOfFirstSmallest = unsorted.indexOf(currentSmallest);
			unsorted.remove(indexOfFirstSmallest);
		}
		
		return sortedResult;
	}
	
	public List<Integer> selectionSortInPlace(List<Integer> inputList){
		
		for(int currentIndex = 0; currentIndex < inputList.size(); currentIndex++){
			int currentSmallest = this.findSmallestInList(inputList, currentIndex); 
			//this.findIndexOfSmallestInList(inputList, currentIndex);
			int indexOfFirstSmallest = inputList.indexOf(currentSmallest);
			
			//swap current position in list with the next smallest
			Integer valueToSwap = inputList.get(currentIndex);
			inputList.set(currentIndex, Integer.valueOf(currentSmallest));
			inputList.set(indexOfFirstSmallest, valueToSwap);
		}
		
		return inputList;
	}

	/**
	 * Finds smallest value in a list starting at index 0
	 * 
	 * @param list
	 * @return
	 */
	Integer findSmallestInList(List<Integer> list) {
		return this.findSmallestInList(list, 0);
	}

	
	/**
	 * Finds smallest value in a list
	 * 
	 * @param list
	 * @return
	 */
	Integer findSmallestInList(List<Integer> list, int startingIndex) {
		Integer smallest = null;
		
		for(int currentIndex = startingIndex; currentIndex < list.size(); currentIndex++) {
			if(currentIndex == startingIndex) {
				smallest = list.get(startingIndex);
			}
			else {
				if(list.get(currentIndex) < smallest) {
					smallest = list.get(currentIndex); 
				}
			}
		}
		
		return smallest;		
	}

	/**
	 * Finds index of smallest value in a list starting at index 0
	 * 
	 * @param list
	 * @return
	 */
	int findIndexOfSmallestInList(List<Integer> list) {
		return this.findIndexOfSmallestInList(list, 0);
	}

	/**
	 * Finds index of smallest value in a list
	 * 
	 * @param list
	 * @return
	 */
	int findIndexOfSmallestInList(List<Integer> list, int startingIndex) {
		int index = 0;
		Integer smallest = null;
		
		for(int currentIndex = startingIndex; currentIndex < list.size(); currentIndex++) {
			if(currentIndex == 0) {
				smallest = list.get(0);
			}
			else {
				if(list.get(currentIndex) < smallest) {
					smallest = list.get(currentIndex); 
					index = currentIndex;
				}
			}
		}
		
		return index;		
	}

}
