import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ThreeButtonApplet class
 * 6-4
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class ThreeButtonApplet extends Applet implements ActionListener
{
	private Button button1;
	private Button button2;
	private Button button3;
	private Label label;
	private int xx, yy, zz;

	/**
	 * 初期化
	 */
	public void init()
	{
		label = new Label("どちらかのボタンをクリックして下さい");

		button1 = new Button("ボタン１");
		button2 = new Button("ボタン２");
		button3 = new Button("ボタン３");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		this.add(label);
		this.add(button1);
		this.add(button2);
		this.add(button3);

		xx = yy = zz = 0;
	}

	/**
	 * イベントハンドラ
	 *
	 * @param e イベントが発生したオブジェクト
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button1) {
			xx++;
			label.setText("ボタン１が" + xx + "回クリックされました");
		}
		else if (e.getSource() == button2) {
			yy++;
			label.setText("ボタン２が" + yy + "回クリックされました");
		} else {
			zz++;
			label.setText("ボタン３が" + zz + "回クリックされました");
		}
	}
}
