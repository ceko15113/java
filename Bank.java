/**
 * Bank class
 * 4-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class Bank
{
	/** 開設できる口座の上限数 */
	private int banksize;

	/** Account オブジェクトの配列 */
	private Account customer[];

	/** 現在の口座数 */
	private int last;

	/**
	 * Constructor
	 * 変数を初期化します。
	 */
	public Bank()
	{
		banksize = 20;
		last = 0;
		customer = new Account[banksize];
	}

	/**
	 * 口座開設
	 * name で与えられた名義で、口座を開設します。
	 *
	 * @param name 口座名義
	 * @return
	 *    0: 正常終了
	 *   -5: 名義が重複
	 *   -6: 口座の最大数を超えている
	 */
	public int doOpen(String name)
	{
		int idx;

		if (last == banksize) {
			return -6;
		}
		
		for (int i = 0; i < last; i++) {
			if (name.equals(customer[i].getName())) {
				return -5;
			}
		}

		idx = 0;
		for (int i = 0; i < last; i++) {
			if (0 < name.compareTo(customer[idx].getName())) {
				idx++;
			}
		}

		for (int i = 0; i < last - idx; i++) {
			customer[last - i] = customer[last - i - 1];
		}
		customer[idx] = new Account(name);
		last++;

		return 0;
	}

	/**
	 * 口座を閉鎖
	 * name で与えられた名義の口座を閉鎖します。
	 *
	 * @param name 口座名義
	 * @return
	 *    0: 正常終了
	 *   -1: 残高が 0 円でない
	 *   -5: その名義の口座が存在しない
	 *
	 */
	public int doClose(String name)
	{
		int idx;

		idx = getIndexFromName(name);
		if (idx == -1) {
			return -5;
		}

		if (customer[idx].doBalance() != 0) {
			return -1;
		}

		for (int i = idx; i < last - 1; i++) {
			customer[i] = customer[i + 1];
		}
		last--;

		return 0;
	}

	/**
	 * 口座に預金
	 * name で与えられた名義の口座に amount で
	 * 与えられた金額を預金します。
	 *
	 * @param name 口座名義
	 * @param amount 預金金額
	 * @return
	 *    0: 正常終了
	 *   -3: 預金額が 0 円以下
	 *   -4: 金額が整数ではない
	 *   -5: その名義の口座が存在しない
	 */
	public int doDeposit(String name, String amount)
	{
		if (getIndexFromName(name) == -1) {
			return -5;
		}

		try {
			return doDeposit(name, Integer.parseInt(amount));
		}
		catch (NumberFormatException e) {
			return -4;
		}
	}

	public int doDeposit(String name, int amount)
	{
		int idx;

		idx = getIndexFromName(name);
		if (idx == -1) {
			return -5;
		}

		return customer[idx].doDeposit(amount);
	}

	/**
	 * 口座から引き出し
	 * name で与えられた名義の口座から、amount で
	 * 与えられた金額を引き出します。
	 *
	 * @param name 口座名義
	 * @param amount 引き出し額
	 * @return
	 *    0: 正常終了
	 *   -1: 引き出し額が預金残高を超えている
	 *   -3: 引き出し額が 0 円以下
	 *   -5: その名義の口座が存在しない
	 */
	public int doWithdraw(String name, String amount)
	{
		if (getIndexFromName(name) == -1) {
			return -5;
		}

		try {
			return doWithdraw(name, Integer.parseInt(amount));
		}
		catch (NumberFormatException e) {
			return -4;
		}
	}
	public int doWithdraw(String name, int amount)
	{
		int idx;

		idx = getIndexFromName(name);
		if (idx == -1) {
			return -5;
		}

		return customer[idx].doWithdraw(amount);
	}

	/**
	 * 残高照会
	 * 
	 * @param name 口座名義
	 * @return
	 *   0 以上の値: 口座残高
	 *           -5: その名義の口座が存在しない
	 */
	public int doBalance(String name)
	{
		int idx;

		idx = getIndexFromName(name);
		if (idx == -1) {
			return -5;
		}

		return customer[idx].doBalance();
	}

	/**
	 * 口座名から配列のインデックスを取得
	 *
	 * @param name 口座名義
	 * @return
	 *   0 以上の値: その名義の口座データが格納されている配列のインデックス
	 *           -1: その名義の口座データが存在しない
	 */
	private int getIndexFromName(String name)
	{
		for (int i = 0; i < last; i++) {
			if (name.equals(customer[i].getName())) {
				return i;
			}
		}

		return -1;
	}
}
