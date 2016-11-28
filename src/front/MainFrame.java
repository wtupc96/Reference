/**
 * 
 */
package front;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author wtupc96
 *
 */
public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

	public MainFrame() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		add(new Component(), BorderLayout.CENTER);
		
		setSize(300,500);
		setTitle("参考文献格式转换器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
