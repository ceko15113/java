/**
 * Account class
 * 4-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class Account
{
	/** 口座名 */
	private String name;

	/** 口座残高 */
	private int balance;

	/**
	 * Constructor
	 * 口座残高を 0 に初期化し、
	 * 口座名を設定します。
	 *
	 * @param myName 名前
	 */
	public Account(String myName)
	{
		balance = 0;
		name = myName;
	}

	/**
	 * 口座に預金する
	 * 引数として渡された金額を預金します。
	 * また、処理が成功、失敗したかを示すコードを返します。
	 *
	 * @param amount 預金額
	 * @return
	 *   正常終了：0
	 *   預金額が 0 円以下：-3
	 */
	public int doDeposit(int amount)
	{
		if (amount <= 0) {
			return -3;
		}
		balance += amount;
		return 0;
	}

	/**
	 * 口座から引出す
	 * 引数として渡された金額を口座から引出します。
	 * また、処理が成功、失敗したかを示すコードを返します。
	 *
	 * @param amount 引出額
	 * @return
	 *   正常終了：0
	 *   預金残高を超過：-1
	 *   預金額が 0 円以下：-3
	 *   
	 */
	public int doWithdraw(int amount)
	{
		if (balance < amount) {
			return -1;
		}
		if (amount <= 0) {
			return -3;
		}
		balance -= amount;
		return 0;
	}

	/**
	 * 口座の残高
	 *
	 * @return 口座残高
	 */
	public int doBalance()
	{
		return balance;
	}

	/**
	 * 口座名
	 *
	 * @return 口座名
	 */
	public String getName()
	{
		return name;
	}
}
