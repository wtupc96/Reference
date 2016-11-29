/**
 * 
 */
package back;

import static back.ReferenceData.getAuthor;
import static back.ReferenceData.getLocation1;
import static back.ReferenceData.getNameInen;
import static back.ReferenceData.getPageEnd;
import static back.ReferenceData.getPageStart;
import static back.ReferenceData.getResponsibility;
import static back.ReferenceData.getTitle;
import static back.ReferenceData.getYear;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	private static File file = new File("1.txt");
	
	public static void setNum(int num) {
		ReferenceGenerate.num = num;
	}

	public static String generateString() {

		if (!(getAuthor().equals("") || getTitle().equals("") || getResponsibility().equals("")
				|| getLocation1().equals("") || getYear().equals(""))) {
			matcher = PATTERN1.matcher(getYear());
			if (!matcher.matches())
				return "出版年错误，请核对信息！";
			stringBuffer = new StringBuffer();
			stringBuffer.append("[" + num++ + "]");
			stringBuffer.append(getAuthor() + '.');
			stringBuffer.append(getTitle() + '.');
			stringBuffer.append("[" + getNameInen() + "].");
			stringBuffer.append(getLocation1() + ':');
			stringBuffer.append(getResponsibility() + ',');
			stringBuffer.append(getYear());
			if (!(getPageStart().equals("") || getPageEnd().equals(""))) {
				matcher = PATTERN2.matcher(getPageStart());
				if (!matcher.matches())
					return "页码格式错误，请核对信息！";
				matcher = PATTERN2.matcher(getPageEnd());
				if (!matcher.matches())
					return "页码格式缺失，请核对信息！";
				stringBuffer.append(":" + getPageStart() + '-' + getPageEnd());
			}
			return stringBuffer.toString();
		} else
			return "信息缺失，请核对信息！";
	}

	public static void sendToFile() {
		try (FileWriter fileWriter = new FileWriter(file,true)) {
			if (stringBuffer != null) {
				fileWriter.append(stringBuffer.toString());
			}else {
				fileWriter.write(generateString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
