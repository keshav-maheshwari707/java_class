public class Count {
	public static int countLength(String str) {
		int count = 0;
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				if (count > ans) {
					ans = count;
				} 
				count = 0;
			}
		}
		if (count > ans) {
				return count;
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "my name is Keshav";
		int answer = countLength(str);
		System.out.println(answer);
	}
}
		