/**
 * 
 */
package front;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author wtupc96
 *
 */
public class ReferenceDisplay extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel jLabel = new JLabel();

	public static void setLabelText(String text){
		jLabel.setText(text);
	}
	
	public ReferenceDisplay() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		add(jLabel, BorderLayout.CENTER);
	}
}
