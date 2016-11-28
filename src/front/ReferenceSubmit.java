/**
 * 
 */
package front;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author wtupc96
 *
 */
public class ReferenceSubmit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7898717283421234357L;
	private static JButton jButtonSubmit = new JButton("提交"), jButtonReset = new JButton("重置"),
			jButtonSendToFile = new JButton("输出");

	public ReferenceSubmit() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(1, 3, 5, 5));

		jButtonSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		jButtonReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		jButtonSendToFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		add(jButtonSubmit);
		add(jButtonReset);
		add(jButtonSendToFile);
	}
}
