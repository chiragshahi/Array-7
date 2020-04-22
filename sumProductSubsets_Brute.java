// Time Complexity : O(n*2^n) where n is the number of words in the array
// Space Complexity : O(2^n) where n is the number of words in the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

class sumProductSubsets_Brute {

	static List<List<Integer>> subsets;
	public static int sumProductSubsets(int[] arr) {
		subsets = new ArrayList<>();
		backtrack(arr, 0, new ArrayList<>());
		int ans = 0;
		for (List<Integer> set : subsets) {
			System.out.println(Arrays.deepToString(set.toArray()));
			// if (set != null) {
				int toAdd = 1;
				for (Integer i : set) {
					// if (i != null) {
						toAdd *= i;
					// }
				}
				ans += toAdd;
			// }
		}
		return ans-1; // subtracting 1 here since for set [], we add 1 to ans
	}

	private static void backtrack(int[] arr, int idx, List<Integer> list) {
		// base
		if (idx > arr.length) return;
		// logic
		subsets.add(new ArrayList<>(list));
		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			backtrack(arr, i+1, list);
			list.remove(list.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(sumProductSubsets(arr));
	}
}