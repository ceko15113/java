import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * BalanceApplet class
 * 7-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class BalanceApplet extends Applet
{
	private Panel balancePanel;
	
	public void init()
	{
		Label headerLabel = new Label("残高照会");
		headerLabel.setBackground(new Color(0x32, 0xcd, 0x32));
		headerLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

		Label nameLabel = new Label("Name");

		Label footerLabel = new Label("残高照会する口座名を指定してください。");
		footerLabel.setBackground(new Color(0x32, 0xcd, 0x32));

		TextField nameField = new TextField(20);

		Button okButton = new Button("OK");
		Button cancelButton = new Button("Cancel");

		Panel inputPanel = new Panel();
		inputPanel.add(nameLabel);
		inputPanel.add(nameField);

		Panel balancePanel = new Panel();
		balancePanel.setLayout(new GridLayout(5, 1));
		balancePanel.add(headerLabel);
		balancePanel.add(inputPanel);
		balancePanel.add(okButton);
		balancePanel.add(cancelButton);
		balancePanel.add(footerLabel);

		add(balancePanel);
	}
}
