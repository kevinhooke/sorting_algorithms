package kh.sorting.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Selection Sort implementations:
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
		List<Integer> sorted = new ArrayList<>();
		sorted.addAll(inputList);
		
		//TODO
		
		return sorted;
	}
	
	Integer findSmallestInList(List<Integer> list) {
		Integer smallest = null;
		
		for(int currentIndex = 0; currentIndex < list.size(); currentIndex++) {
			if(currentIndex == 0) {
				smallest = list.get(0);
			}
			else {
				if(list.get(currentIndex) < smallest) {
					smallest = list.get(currentIndex); 
				}
			}
		}
		
		return smallest;
		
	}
	
}
