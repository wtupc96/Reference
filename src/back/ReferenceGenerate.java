/**
 * 
 */
package back;

import static back.ReferenceData.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wtupc96
 *
 */
public class ReferenceGenerate {
	private static int num = 1;
	private static StringBuffer stringBuffer;
	private static final Pattern PATTERN1 = Pattern.compile("[0-9]{3,4}"), PATTERN2 = Pattern.compile("[0-9]*");
	private static Matcher matcher;

	public static void setNum(int num) {
		ReferenceGenerate.num = num;
	}
	
	public static String generateString() {
		if (!(getAuthor().equals("") || getTitle().equals("") || getResponsibility().equals("")
				|| getLocation1().equals("") || getYear().equals(""))) {
			stringBuffer = new StringBuffer();
			stringBuffer.append("[" + num++ + "]");
			stringBuffer.append(getAuthor() + '.');
			stringBuffer.append(getTitle() + '.');
			stringBuffer.append("[" + getNameInen() + "].");
			stringBuffer.append(getLocation1() + ':');
			stringBuffer.append(getResponsibility() + ',');
			stringBuffer.append(getYear());
			if (!(getPageStart().equals("") || getPageEnd().equals("")))
				stringBuffer.append(":" + getPageStart() + '-' + getPageEnd());
			return stringBuffer.toString();
		} else
			return "信息缺失，请核对信息！";
	}
}
