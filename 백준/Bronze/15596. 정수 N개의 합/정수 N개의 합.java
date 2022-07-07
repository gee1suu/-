public class Test {

	long sum(int[] a) {
		long ans = 0;
		for (int idx = 0; idx < a.length; idx++)
			ans += a[idx];
		return ans;
	}

}
