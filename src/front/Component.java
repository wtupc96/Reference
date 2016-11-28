/**
 * 
 */
package front;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * @author wtupc96
 *
 */
public class Component extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Component() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout(2, 2));
		add(new ReferenceDisplay(), BorderLayout.NORTH);
		add(new ReferenceInformation(), BorderLayout.CENTER);
		add(new ReferenceSubmit(), BorderLayout.SOUTH);
		
	}
}
