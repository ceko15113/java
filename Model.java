// 276113
// 杉山 幸輝
// 2-3

class Model
{
	long compute(int n)
	{
		long sum = 0;
		long prev1 = 1;
		long prev2 = 1;

		if (n == 0 || n == 1)
			return 1;

		for (int i = 2; i <= n; i++) {
			sum = prev1 + prev2;
			prev2 = prev1;
			prev1 = sum;
		}
		
		return sum;
	}
}
