/**
 * Mother3 class
 * 3-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class Mother3
{
	/**
	 * Main
	 * 一郎と二郎のインスタンスを生成、
	 * それぞれに自己紹介させる。
	 *
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args)
	{
		Kodomo ichiro = new Kodomo("一郎");
		Kodomo jiro = new Kodomo("二郎");
		ichiro.sayName();
		jiro.sayName();
	}
}
