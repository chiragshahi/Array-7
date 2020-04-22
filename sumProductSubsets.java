// Time Complexity : O(n) where n is the number of words in the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Using formula
/*   a + b + c + ab + bc + ca + abc 
   = a + ac + b + bc + ab + abc + c + 1 - 1
   = a(1+c) + b(1+c) + ab(1+c) + c + 1 - 1
   = (a + b + ab + 1)(1+c) - 1 
   = (1+a) * (1+b) * (1+c) - 1 
*/

class sumProductSubsets {

	public static int sumProductSubsets(int[] arr) {
		int ans = 1;
		for (int i : arr) {
			ans *= (i+1);
		}
		return ans-1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(sumProductSubsets(arr));
	}
}