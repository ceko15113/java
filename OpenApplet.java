import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * OpenApplet class
 * 7-1
 *
 * @author 276113
 * @author 杉山 幸輝
 */
public class OpenApplet extends Applet
{
	private Panel openPanel;
	
	public void init()
	{
		Label headerLabel = new Label("口座開設");
		headerLabel.setBackground(new Color(0x32, 0xcd, 0x32));
		headerLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

		Label nameLabel = new Label("Name");

		Label footerLabel = new Label("開設する口座名を指定してください。");
		footerLabel.setBackground(new Color(0x32, 0xcd, 0x32));

		TextField nameField = new TextField(20);

		Button okButton = new Button("OK");
		Button cancelButton = new Button("Cancel");

		Panel inputPanel = new Panel();
		inputPanel.add(nameLabel);
		inputPanel.add(nameField);

		Panel openPanel = new Panel();
		openPanel.setLayout(new GridLayout(5, 1));
		openPanel.add(headerLabel);
		openPanel.add(inputPanel);
		openPanel.add(okButton);
		openPanel.add(cancelButton);
		openPanel.add(footerLabel);

		add(openPanel);
	}
}
