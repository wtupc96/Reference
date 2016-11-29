/**
 * 
 */
package front;

import static back.ReferenceData.setAuthor;
import static back.ReferenceData.setLocation1;
import static back.ReferenceData.setPageEnd;
import static back.ReferenceData.setPageStart;
import static back.ReferenceData.setResponsibility;
import static back.ReferenceData.setTitle;
import static back.ReferenceData.setType;
import static back.ReferenceData.setYear;
import static front.ReferenceInformation.getAuthor;
import static front.ReferenceInformation.getItemChosen;
import static front.ReferenceInformation.getLocation1;
import static front.ReferenceInformation.getResponsibility;
import static front.ReferenceInformation.getTitle;
import static front.ReferenceInformation.getYear;
import static front.ReferenceDisplay.setLabelText;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import back.ReferenceGenerate;
import front.ReferenceInformation.PageStartAndEnd;

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
				setType(getItemChosen());
				setAuthor(((JTextField) (getAuthor().getjComponent())).getText());
				setLocation1(((JTextField) (getLocation1().getjComponent())).getText());
				setPageStart(PageStartAndEnd.getjTextField1().getText());
				setPageEnd(PageStartAndEnd.getjTextField2().getText());
				setResponsibility(((JTextField) (getResponsibility().getjComponent())).getText());
				setTitle(((JTextField) (getTitle().getjComponent())).getText());
				setYear(((JTextField) (getYear().getjComponent())).getText());
				setLabelText(ReferenceGenerate.generateString());
			}
		});
		jButtonReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				((JTextField)(getAuthor().getjComponent())).setText("");
				((JTextField)(getLocation1().getjComponent())).setText("");
				((JTextField)(PageStartAndEnd.getjTextField1())).setText("");
				((JTextField)(PageStartAndEnd.getjTextField2())).setText("");
				((JTextField)(getResponsibility().getjComponent())).setText("");
				((JTextField)(getTitle().getjComponent())).setText("");
				((JTextField)(getYear().getjComponent())).setText("");
				setLabelText("");
				ReferenceGenerate.setNum(1);
			}
		});
		jButtonSendToFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReferenceGenerate.sendToFile();
			}
		});

		add(jButtonSubmit);
		add(jButtonReset);
		add(jButtonSendToFile);
	}
}
