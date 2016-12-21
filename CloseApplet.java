import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * CloseApplet class
 * 7-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class CloseApplet extends Applet
{
	private Panel closePanel;
	
	public void init()
	{
		Label headerLabel = new Label("口座解約");
		headerLabel.setBackground(new Color(0x32, 0xcd, 0x32));
		headerLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

		Label nameLabel = new Label("Name");

		Label footerLabel = new Label("解約する口座名を指定してください。");
		footerLabel.setBackground(new Color(0x32, 0xcd, 0x32));

		TextField nameField = new TextField(20);

		Button okButton = new Button("OK");
		Button cancelButton = new Button("Cancel");

		Panel inputPanel = new Panel();
		inputPanel.add(nameLabel);
		inputPanel.add(nameField);

		Panel closePanel = new Panel();
		closePanel.setLayout(new GridLayout(5, 1));
		closePanel.add(headerLabel);
		closePanel.add(inputPanel);
		closePanel.add(okButton);
		closePanel.add(cancelButton);
		closePanel.add(footerLabel);

		add(closePanel);
	}
}
