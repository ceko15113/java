/**
 * School class
 * 3-2
 *
 * @author 276113
 * @author 杉山 幸輝
 */
class School
{
	/**
	 * Main
	 * 一郎と太郎のインスタンスを生成、講義を受け、それぞれ評価を取得します。
	 * また、評価を一つ取得するたびに、その時点での GPA を表示します。
	 * 最後に、卒業が可能かどうかを判定、表示します。
	 *
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args)
	{
		Student ichiro = new Student("日大一郎", "1001");
		ichiro.getS(2);
		ichiro.printGPA();
		ichiro.getA(3);
		ichiro.printGPA();
		ichiro.getD(2);
		ichiro.printGPA();
		ichiro.getB(2);
		ichiro.printGPA();
		ichiro.getC(3);
		ichiro.printGPA();
		ichiro.judge();

		Student taro = new Student("日大太郎", "10");
		taro.getC(2);
		taro.printGPA();
		taro.getB(2);
		taro.printGPA();
		taro.getA(3);
		taro.printGPA();
		taro.getD(3);
		taro.printGPA();
		taro.getB(2);
		taro.printGPA();
		taro.getD(2);
		taro.printGPA();
		taro.judge();
	}
}
