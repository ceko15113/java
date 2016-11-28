/**
 * BankTestDriver class
 * 4-2
 *
 * @author 276113
 * @author 杉山 幸輝
 */
class BankTestDriver
{
	/**
	 * Main
	 * Bank クラスをテストします。
	 * いろいろな状況で Bank クラスのメソッドを呼び、
	 * 正しい値を返しているか確認します。
	 *
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		char c = 'C';
		
		System.out.println("A さんの口座を開設します");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doOpen("A") == 0) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("B さんの口座を開設します");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doOpen("B") == 0) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");
		
		System.out.println("A さんの口座を重複して開設します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doOpen("A") == -5) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");

		for (int i = 0; i < 18; i++) {
			bank.doOpen(String.valueOf(c++));
		}
		System.out.println("20 を超える口座を開こうとします");
		System.out.println("返却値 -6 で正常");
		System.out.print("結果：");
		if (bank.doOpen("X") == -6) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("口座残高が 20 を超えている状態で、A さんの口座を重複して開きます");
		System.out.println("返却値 -6 で正常");
		System.out.print("結果：");
		if (bank.doOpen("X") == -6) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("存在しない口座の残高を参照します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doBalance("Z") == -5) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");
		
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.println("A さんの口座に 1,000 円を預金します");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("A", 1000) == 0) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.print("\n");

		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.println("A さんの口座に -1,000 円を預金します");
		System.out.println("返却値 -3 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("A", -1000) == -3) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.print("\n");
		
		System.out.println("存在しない口座に 1,000 円を預金します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("Z", 1000) == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");
		
		System.out.println("存在しない口座に -1,000 円を預金します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("Z", -1000) == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");
		
		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.println("B さんの口座に 1,000 円を預金します（金額が文字列）");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("B", "1000") == 0) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.print("\n");

		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.println("B さんの口座に 0.1 円を預金します（金額が文字列）");
		System.out.println("返却値 -4 で正常");
		System.out.print("結果：");
		if (bank.doDeposit("B", "0.1") == -4) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.print("\n");
		
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.println("A さんの口座から 500 円を引き出します");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("A", 500) == 0) {
		  System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.print("\n");

		
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.println("A さんの口座から 1,500 円を引き出します");
		System.out.println("返却値 -1 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("A", 1500) == -1) {
		  System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.print("\n");
		
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.println("A さんの口座から -500 円を引き出します");
		System.out.println("返却値 -3 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("A", -500) == -3) {
		  System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("A さんの口座残高：" + bank.doBalance("A"));
		System.out.print("\n");

		System.out.println("存在しない口座から 1,000 円を引き出します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("Z", 1000) == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("存在しない口座から残高以上の金額を引き出します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("Z", 1000) == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("存在しない口座から -1,000 円を引き出します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("Z", 1000) == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.println("B さんの口座から 500 円を引き出します（金額が文字列）");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("B", "500") == 0) {
		  System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.print("\n");

		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.println("B さんの口座から 0.1 円を引き出します（金額が文字列）");
		System.out.println("返却値 -4 で正常");
		System.out.print("結果：");
		if (bank.doWithdraw("B", "0.1") == -4) {
		  System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.println("B さんの口座残高：" + bank.doBalance("B"));
		System.out.print("\n");
		
		System.out.println("残高が 0 円でない口座を解約します");
		System.out.println("返却値 -1 で正常");
		System.out.print("結果：");
		if (bank.doClose("A") == -1) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("存在しない口座を解約します");
		System.out.println("返却値 -5 で正常");
		System.out.print("結果：");
		if (bank.doClose("Z") == -5) {
			System.out.println("正常");
		}
		else {
		  System.out.println("異常");
		}
		System.out.print("\n");

		System.out.println("残高が 0 円の口座を解約します");
		System.out.println("返却値 0 で正常");
		System.out.print("結果：");
		if (bank.doClose("C") == 0) {
			System.out.println("正常");
		}
		else {
			System.out.println("異常");
		}
		System.out.print("\n");
	}
}

