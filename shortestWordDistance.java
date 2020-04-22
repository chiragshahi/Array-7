// Time Complexity : O(n) where n is the number of words in the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class shortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int len = n;
        int p1 = -1, p2 = -1;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(word1)) p1 = i;
            else if (words[i].equals(word2)) p2 = i;
            if (p1 != -1 && p2 != -1) len = Math.min(len, Math.abs(p1-p2));
        }
        return len;
    }
}