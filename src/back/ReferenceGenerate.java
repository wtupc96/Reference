/**
 * 
 */
package back;

import static back.ReferenceData.*;

/**
 * @author wtupc96
 *
 */
public class ReferenceGenerate {
	private static int num = 1;
	private static StringBuffer stringBuffer;

	public static String generateString() {
		stringBuffer = new StringBuffer();
		stringBuffer.append("[" + num + "]");
		stringBuffer.append(getAuthor() + '.');
		stringBuffer.append(getTitle() + '.');
		stringBuffer.append("[" + getNameInen() + "].");
		stringBuffer.append(getLocation1() + ':');
		stringBuffer.append(getResponsibility() + ',');
		stringBuffer.append(getYear() + ':');
		stringBuffer.append(getPageStart() + '-' + getPageEnd());
		++num;
		return stringBuffer.toString();
	}
}
