/**
 * Customer class
 * 3-2
 *
 * @author 276113
 * @author 杉山 幸輝
 */
class Customer
{
	/**
	 * Main
	 * 自分の名前で口座を開設し、預金や引出しを行います。
	 *
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args)
	{
		Account myAccount = new Account("杉山幸輝");

		switch (myAccount.doDeposit(10000)) {
			case 0:
			System.out.println("預金成功");
			break;
			
			case -3:
			System.out.println("0 円より大きい金額を入力してください");
			break;
		}
		System.out.println("口座残高：" + myAccount.doBalance() + " 円");

		switch (myAccount.doWithdraw(50000)) {
			case 0:
			System.out.println("引出成功");
			break;

			case -1:
			System.out.println("預金残高を超えています");
			break;

			case -3:
			System.out.println("0 円より大きい金額を入力してください");
			break;
		}
		System.out.println("口座残高：" + myAccount.doBalance() + " 円");

		switch (myAccount.doDeposit(-1000)) {
			case 0:
			System.out.println("預金成功");
			break;

			case -3:
			System.out.println("0 円より大きい金額を入力してください");
			break;
		}
		System.out.println("口座残高：" + myAccount.doBalance() + " 円");

		switch (myAccount.doWithdraw(-5000)) {
			case 0:
			System.out.println("引出成功");
			break;

			case -1:
			System.out.println("預金残高を超えています");
			break;

			case -3:
			System.out.println("0 円より大きい金額を入力してください");
			break;
		}
		System.out.println("口座残高：" + myAccount.doBalance() + " 円");
	}
}
