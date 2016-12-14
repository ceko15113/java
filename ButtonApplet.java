import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ButtonApplet class
 * 6-2
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class ButtonApplet extends Applet implements ActionListener
{
	private Button button;
	private Label label;

	/**
	 * 初期化
	 */
	public void init()
	{
		label = new Label("ボタンをクリックして下さい");

		button = new Button("クリック");

		button.addActionListener(this);

		this.add(label);
		this.add(button);
	}

	/**
	 * イベントハンドラ
	 *
	 * @param e イベントが発生したオブジェクト
	 */
	public void actionPerformed(ActionEvent e)
	{
		label.setText("クリックされました");
	}
}
