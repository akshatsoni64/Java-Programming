/******************************************************************************

AIM - Append incremented value of the last value of an array to the array itself

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(
		    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		int temp = arr.get(arr.size()-1) + 1;
		String s = String.valueOf(temp);
		for(char c: s.toCharArray()){
		    arr.add(Integer.parseInt(String.valueOf(c)));
		};
		System.out.println(arr);
	}
}
