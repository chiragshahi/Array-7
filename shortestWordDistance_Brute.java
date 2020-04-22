// Time Complexity : O(n^2) where n is the number of words in the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class shortestWordDistance_Brute {
    public int shortestDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int len = n;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.equals(word1) || word.equals(word2)) {
                for (int j = i+1; j < n; j++) {
                    String wrd = words[j];
                    if (wrd.equals(word1) || wrd.equals(word2)) {
                        if (!word.equals(wrd)) {
                            len = Math.min(len, j-i);
                        }
                    }
                }
            }
        }
        return len;
    }
}