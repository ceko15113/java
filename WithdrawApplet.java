import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * WithdrawApplet class
 * 7-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class WithdrawApplet extends Applet
{
	private Panel withdrawPanel;
	
	public void init()
	{
		Label headerLabel = new Label("引き出し");
		headerLabel.setBackground(new Color(0x32, 0xcd, 0x32));
		headerLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

		Label nameLabel = new Label("Name");
		Label amountLabel = new Label("Amount");

		Label footerLabel = new Label("引き出しする口座名と金額を指定してください。");
		footerLabel.setBackground(new Color(0x32, 0xcd, 0x32));

		TextField nameField = new TextField(20);
		TextField amountField = new TextField(20);

		Button okButton = new Button("OK");
		Button cancelButton = new Button("Cancel");

		Panel namePanel = new Panel();
		namePanel.add(nameLabel);
		namePanel.add(nameField);

		Panel amountPanel = new Panel();
		amountPanel.add(amountLabel);
		amountPanel.add(amountField);

		Panel withdrawPanel = new Panel();
		withdrawPanel.setLayout(new GridLayout(6, 1));
		withdrawPanel.add(headerLabel);
		withdrawPanel.add(namePanel);
		withdrawPanel.add(amountPanel);
		withdrawPanel.add(okButton);
		withdrawPanel.add(cancelButton);
		withdrawPanel.add(footerLabel);

		add(withdrawPanel);
	}
}
