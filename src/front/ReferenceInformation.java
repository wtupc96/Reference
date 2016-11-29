/**
 * 
 */
package front;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import back.ReferenceData;

/**
 * @author wtupc96
 *
 */
public class ReferenceInformation extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3495196708621145356L;
	private static JComboBox<String> jComboBox;
	private static int itemChosen;
	private static RepetitiveComponent type, author, responsibility, title, location, year;
	private static PageStartAndEnd pageStartAndEnd;

	public static RepetitiveComponent getAuthor() {
		return author;
	}

	public static RepetitiveComponent getResponsibility() {
		return responsibility;
	}

	public static RepetitiveComponent getTitle() {
		return title;
	}

	public static RepetitiveComponent getLocation1() {
		return location;
	}

	public static RepetitiveComponent getYear() {
		return year;
	}

	public static PageStartAndEnd getPageStartAndEnd() {
		return pageStartAndEnd;
	}

	public static int getItemChosen() {
		return itemChosen;
	}

	public static void setItemChosen(int itemChosen) {
		ReferenceInformation.itemChosen = itemChosen;
	}

	public ReferenceInformation() {
		// TODO Auto-generated constructor stub
		jComboBox = new JComboBox<String>(ReferenceData.getNamech());
		jComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setItemChosen(jComboBox.getSelectedIndex());
			}
		});
		type = new RepetitiveComponent(jComboBox, new JLabel("类型"));
		author = new RepetitiveComponent(new JTextField(), new JLabel("作者"));
		responsibility = new RepetitiveComponent(new JTextField(), new JLabel("主要责任者"));
		title = new RepetitiveComponent(new JTextField(), new JLabel("文献题名"));
		location = new RepetitiveComponent(new JTextField(), new JLabel("出版地"));
		year = new RepetitiveComponent(new JTextField(), new JLabel("出版年"));
		pageStartAndEnd = new PageStartAndEnd();

		setLayout(new GridLayout(7, 1));

		add(type);
		add(author);
		add(responsibility);
		add(title);
		add(location);
		add(year);
		add(pageStartAndEnd);
	}

	static class PageStartAndEnd extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 3471552148355994701L;
		private static JTextField jTextField1 = new JTextField(), jTextField2 = new JTextField();
		private static JLabel jLabel = new JLabel("页码"), jLabel2 = new JLabel("-");

		public static void setjTextField1(JTextField jTextField1) {
			PageStartAndEnd.jTextField1 = jTextField1;
		}

		public static void setjTextField2(JTextField jTextField2) {
			PageStartAndEnd.jTextField2 = jTextField2;
		}

		public static JTextField getjTextField1() {
			return jTextField1;
		}

		public static JTextField getjTextField2() {
			return jTextField2;
		}

		public PageStartAndEnd() {
			// TODO Auto-generated constructor stub
			jLabel2.setHorizontalAlignment(JLabel.CENTER);
			setLayout(new GridLayout(2, 3));
			add(jLabel);
			add(new JPanel());
			add(new JPanel());
			add(jTextField1);
			add(jLabel2);
			add(jTextField2);
		}
	}

	class RepetitiveComponent extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -789628956747958030L;
		private JComponent jComponent;
		private JComponent jComponent2;

		public RepetitiveComponent(JComponent jComponent, JComponent jComponent2) {
			// TODO Auto-generated constructor stub
			this.jComponent = jComponent;
			this.jComponent2 = jComponent2;
			setLayout(new GridLayout(2, 1));
			add(jComponent2);
			add(jComponent);
		}

		public JComponent getjComponent() {
			return jComponent;
		}

		public void setjComponent(JComponent jComponent) {
			this.jComponent = jComponent;
		}

		public JComponent getjComponent2() {
			return jComponent2;
		}

		public void setjComponent2(JComponent jComponent2) {
			this.jComponent2 = jComponent2;
		}

	}
}
