import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TwoButtonApplet class
 * 6-3
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class TwoButtonApplet extends Applet implements ActionListener
{
	Button button1;
	Button button2;
	Label label;

	/**
	 * 初期化
	 */
	public void init()
	{
		label = new Label("どちらかのボタンをクリックして下さい");

		button1 = new Button("ボタン１");
		button2 = new Button("ボタン２");

		button1.addActionListener(this);
		button2.addActionListener(this);

		this.add(label);
		this.add(button1);
		this.add(button2);
	}

	/**
	 * イベントハンドラ
	 *
	 * @param e イベントが発生したオブジェクト
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button1) {
			label.setText("ボタン１がクリックされました");
		}
		else {
			label.setText("ボタン２がクリックされました");
		}
	}
}
