/**
 * Kodomo class
 * 3-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class Kodomo
{
	/** 名前 */
	private String name;

	/**
	 * Constructor
	 * 引数として与えられた文字列で、
	 * メンバ変数 name を初期化します。
	 *
	 * @param myName 名前
	 */
	public Kodomo(String myName)
	{
		name = myName;
	}
	
	/**
	 * 名前を表示
	 * メンバ変数 name にセットされている文字列を使い、
	 * 所定のフォーマットで名前を出力します。
	 */
	public void sayName()
	{
		System.out.println("ボクは" + name + "です");
	}
}
