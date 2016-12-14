/**
 * HelloApplet class
 * 6-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class HelloApplet extends java.applet.Applet
{
	/**
	 * 初期化
	 */
	public void init()
	{
		java.awt.Label helloLabel;
		helloLabel = new java.awt.Label("こんにちは");
		this.add(helloLabel);
	}
}
