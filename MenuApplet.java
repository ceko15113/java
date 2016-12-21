import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * MenuApplet class
 * 7-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class MenuApplet extends Applet
{
	private Panel menuPanel;
	private Button buttons[];
	
	public void init()
	{
		String labels[] = {"Open", "Close", "Deposit", "Withdraw", "Balance"};
		String index[] = {"West", "East", "North", "South", "Center"};

		Label header = new Label("じゃばー銀行へようこそ！");
		header.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
		header.setBackground(new Color(0x32, 0xcd, 0x32));

		Label footer = new Label("ご希望の処理を選択してください。");
		footer.setBackground(new Color(0x32, 0xcd, 0x32));

		Dimension dim = new Dimension(60, 60);

		buttons = new Button[labels.length];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(labels[i]);
			buttons[i].setPreferredSize(dim);
		}

		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		for (int i = 0; i < buttons.length; i++) {
			panel.add(index[i], buttons[i]);
		}

		menuPanel = new Panel();
		menuPanel.setLayout(new BorderLayout());
		menuPanel.add("North", header);
		menuPanel.add("Center", panel);
		menuPanel.add("South", footer);

		add(menuPanel);
		setVisible(true);
	}
}
