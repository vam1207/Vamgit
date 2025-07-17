/*DP_AP_07_Distinct Sub sequences_I_using DP  

Given two strings s and t, return the number of distinct subsequences of s which equals t.

The test cases are generated so that the answer fits on a 32-bit signed integer.

 

Example 1:

Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit

Example 2:

Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag
 

Constraints:

1 <= s.length, t.length <= 1000
s and t consist of English letters.

Test Csaes=

case=1
input=
rabbbit
rabbit
output=3


case=2
input=babgbag
bag
output=
5


*/


/*Java Solution 1

Let W(i, j) stand for the number of subsequences of S(0, i) equals to T(0, j). If S.charAt(i) == T.charAt(j), W(i, j) = W(i-1, j-1) + W(i-1,j); Otherwise, W(i, j) = W(i-1,j).
*/


public int numDistincts(String S, String T) 
{
	int[][] table = new int[S.length() + 1][T.length() + 1];
 
	for (int i = 0; i < S.length(); i++)
		table[i][0] = 1;
 
	for (int i = 1; i <= S.length(); i++) {
		for (int j = 1; j <= T.length(); j++) {
			if (S.charAt(i - 1) == T.charAt(j - 1)) {
				table[i][j] += table[i - 1][j] + table[i - 1][j - 1];
			} else {
				table[i][j] += table[i - 1][j];
			}
		}
	}
 
	return table[S.length()][T.length()];
}

/*
Java Solution 2

Do NOT write something like this, even it can also pass the online judge.

public int numDistinct(String S, String T) {
	HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
 
	for (int i = 0; i < T.length(); i++) {
		if (map.containsKey(T.charAt(i))) {
			map.get(T.charAt(i)).add(i);
		} else {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(i);
			map.put(T.charAt(i), temp);
		}
	}
 
	int[] result = new int[T.length() + 1];
	result[0] = 1;
 
	for (int i = 0; i < S.length(); i++) {
		char c = S.charAt(i);
 
		if (map.containsKey(c)) {
			ArrayList<Integer> temp = map.get(c);
			int[] old = new int[temp.size()];
 
			for (int j = 0; j < temp.size(); j++)
				old[j] = result[temp.get(j)];
 
			// the relation
			for (int j = 0; j < temp.size(); j++)
				result[temp.get(j) + 1] = result[temp.get(j) + 1] + old[j];
		}
	}
 
	return result[T.length()];
}

*/
