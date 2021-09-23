package kh.sorting.selection;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

	private Integer smallest;
	
	public List<Integer> selectionSort(List<Integer> unsorted){
		List<Integer> sortedResult = new ArrayList<>();
	
		for(int currentIndex = 0; currentIndex < unsorted.size(); currentIndex++){
			int currentSmallest = this.findSmallestInList(unsorted.subList(currentIndex, unsorted.size()));
			sortedResult.add(currentSmallest);
			
			//TODO: remove smallest value from the unsorted list
		}
		
		return sortedResult;
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
