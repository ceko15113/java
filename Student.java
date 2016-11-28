/**
 * Student class
 * 3-2
 *
 * @author 276113
 * @author 杉山 幸輝
 */
class Student
{
	/** 名前 */
	private String name;

	/** 学生番号 */
	private String id;

	/** GPA */
	private double gpa;

	/** 受講単位数 */
	private int totalUnit;

	/** 合格単位数 */
	private int passedUnit;

	/** 評価ごとの単位数 */
	private int s, a, b, c, d;

	/**
	 * Constructor
	 * 引数として与えられた名前と学生番号をメンバ変数
	 * name と id にセットします。変数の初期化も行います。
	 *
	 * @param myName 名前
	 * @param myId 学生番号
	 */
	public Student(String myName, String myId)
	{
		name = myName;
		id = myId;
		gpa = totalUnit = passedUnit = 0;
		s = a = b = c = d = 0;
	}

	/**
	 * GPA 計算
	 */
	private void calcGpa()
	{
		gpa = (4.0 * s + 3.0 * a + 2.0 * b + 1.0 * c) / totalUnit;
	}

	/**
	 * S 評価を取得
	 * 受講単位数、合格単位数、S 評価の単位数を
	 * 加算し、GPA 値を更新します。
	 *
	 * @param unit 単位数
	 */
	public void getS(int unit)
	{
		totalUnit += unit;
		passedUnit += unit;
		s += unit;
		calcGpa();
	}

	/**
	 * A 評価を取得
	 * 受講単位数、合格単位数、A 評価の単位数を
	 * 加算し、GPA 値を更新します。
	 *
	 * @param unit 単位数
	 */
	public void getA(int unit)
	{
		totalUnit += unit;
		passedUnit += unit;
		a += unit;
		calcGpa();
	}

	/**
	 * B 評価を取得
	 * 受講単位数、合格単位数、B 評価の単位数を
	 * 加算し、GPA 値を更新します。
	 *
	 * @param unit 単位数
	 */
	public void getB(int unit)
	{
		totalUnit += unit;
		passedUnit += unit;
		b += unit;
		calcGpa();
	}

	/**
	 * C 評価を取得
	 * 受講単位数、合格単位数、C 評価の単位数を
	 * 加算し、GPA 値を更新します。
	 *
	 * @param unit 単位数
	 */
	public void getC(int unit)
	{
		totalUnit += unit;
		passedUnit += unit;
		c += unit;
		calcGpa();
	}

	/**
	 * D 評価を取得
	 * 受講単位数、D 評価の単位数を
	 * 加算し、GPA 値を更新します。
	 *
	 * @param unit 単位数
	 */
	public void getD(int unit)
	{
		totalUnit += unit;
		d += unit;
		calcGpa();
	}

	/**
	 * 成績を表示
	 * 学生番号、名前、合格単位数、GPA を表示します。
	 */
	public void printGPA()
	{
		System.out.println("学生番号　：" + id);
		System.out.println("名前　　　：" + name);
		System.out.println("合格単位数：" + passedUnit);
		System.out.println("GPA 　　　：" + gpa);
		System.out.print("\n");
	}

	/**
	 * 卒業判定
	 * 合格単位数と GPA 値から、卒業が可能かどうか判定し、表示します。
	 */
	public void judge()
	{
		System.out.println("卒業判定結果：");
		if (10 <= passedUnit && 2.0 <= gpa)
			System.out.println("卒業おめでとう！");
		if (passedUnit < 10)
			System.out.println(10 - passedUnit + "単位不足のため卒業できません");
		if (gpa < 2.0)
			System.out.println("GPAが" + gpa + "のため卒業できません");
		System.out.print("\n");
	}
}
