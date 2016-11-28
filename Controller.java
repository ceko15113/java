// 276113
// 杉山 幸輝
// 2-3

class Controller
{
	public static void main(String[] args)
	{
		Model m1 = new Model();
		Model m2 = new Model();
		Model m3 = new Model();
		Model m4 = new Model();
		Model m5 = new Model();
		Model m6 = new Model();
		Model m7 = new Model();
		Model m8 = new Model();
		Model m9 = new Model();

		long n1 = m1.compute(10);
		long n2 = m2.compute(20);
		long n3 = m3.compute(30);
		long n4 = m4.compute(40);
		long n5 = m5.compute(50);
		long n6 = m6.compute(60);
		long n7 = m7.compute(70);
		long n8 = m8.compute(80);
		long n9 = m9.compute(90);

		View v = new View();
		v.show("フィボナッチ数列の第10項の値", n1);
		v.show("フィボナッチ数列の第20項の値", n2);
		v.show("フィボナッチ数列の第30項の値", n3);
		v.show("フィボナッチ数列の第40項の値", n4);
		v.show("フィボナッチ数列の第50項の値", n5);
		v.show("フィボナッチ数列の第60項の値", n6);
		v.show("フィボナッチ数列の第70項の値", n7);
		v.show("フィボナッチ数列の第80項の値", n8);
		v.show("フィボナッチ数列の第90項の値", n9);
	}
}
