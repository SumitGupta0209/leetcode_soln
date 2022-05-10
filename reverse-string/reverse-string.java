class Solution {

	public void reverseString(char[] s) {
		reverseStringR(0, s);
	}

	public static void reverseStringR(Integer index, char[] s) {
		if(s == null || index >= s.length) {
			return;
		}
		char rs = s[index];
		reverseStringR(index + 1, s);
		s[(s.length -1) - index] = rs;
	}
}