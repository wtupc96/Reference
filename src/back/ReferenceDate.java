/**
 * 
 */
package back;

/**
 * @author wtupc96
 *
 */
public class ReferenceDate {
	private static final String[] nameCH = { "专著", "论文集", "报纸文章", "期刊文章", "学位论文", "报告", "其他" };
	private static final char[] nameEN = { 'M', 'C', 'N', 'J', 'D', 'R', 'Z' };

	public static String[] getNamech() {
		return nameCH;
	}

}
