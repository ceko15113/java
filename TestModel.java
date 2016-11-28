// 276113
// 杉山 幸輝
// 2-4

class TestModel
{
	public static void main(String[] args)
	{
		Model m = new Model();
		boolean flag = true;

		for (int i = 0; i < 10; i++) {
			if (m.compute(i * 10 + 2) != m.compute(i * 10) + m.compute(i * 10 + 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("検証成功");
		else
			System.out.println("検証失敗");
	}
}

