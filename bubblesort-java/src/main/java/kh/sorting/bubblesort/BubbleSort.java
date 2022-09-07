package kh.sorting.bubblesort;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * @author kevinhooke
 */
public class BubbleSort {

	/**
	 * Compares each pair of adjacent elements and swaps their positions if the second
	 * element is smaller than the first. Repeats which each adjacent pair.
	 * Repeats the process from beginning to end until no more swaps are made, at
	 * which point the list is sorted.
	 * 
	 * @param inputList
	 * @return
	 */
	public List<Integer> bubbleSort(List<Integer> inputList){
			
		boolean sortComplete = false;
		
		while(!sortComplete) {
			sortComplete = true;
			for(int index = 0; index < inputList.size(); index++) {
				
				//is current index less than 2 from end of the list (is there
				//still 2 or more elements to compare
				if(index < inputList.size() -1)
				{
					//if first element is > second element, swap positions
					if(inputList.get(index) > inputList.get(index + 1)) {
						Integer temp = inputList.get(index);
						inputList.set(index, inputList.get(index + 1));
						inputList.set(index + 1, temp);
						sortComplete = false;
					}
				}				
			}
		}
		
		return inputList;
		
	
	}
	
}
