/**
 * 
 */
package back;

/**
 * @author wtupc96
 *
 */
public class ReferenceData {
	private static final String[] nameCH = { "专著", "论文集", "报纸文章", "期刊文章", "学位论文", "报告", "其他" };
	private static final char[] nameEN = { 'M', 'C', 'N', 'J', 'D', 'R', 'Z' };
	private static String author, responsibility, title, location, year, pageStart, pageEnd;
	private static int type;

	public static int getType() {
		return type;
	}

	public static void setType(int type) {
		ReferenceData.type = type;
	}

	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		ReferenceData.author = author;
	}

	public static String getResponsibility() {
		return responsibility;
	}

	public static void setResponsibility(String responsibility) {
		ReferenceData.responsibility = responsibility;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		ReferenceData.title = title;
	}

	public static String getLocation1() {
		return location;
	}

	public static void setLocation1(String location) {
		ReferenceData.location = location;
	}

	public static String getYear() {
		return year;
	}

	public static void setYear(String year) {
		ReferenceData.year = year;
	}

	public static String getPageStart() {
		return pageStart;
	}

	public static void setPageStart(String pageStart) {
		ReferenceData.pageStart = pageStart;
	}

	public static String getPageEnd() {
		return pageEnd;
	}

	public static void setPageEnd(String pageEnd) {
		ReferenceData.pageEnd = pageEnd;
	}

	public static char getNameInen() {
		return nameEN[getType()];
	}

	public static String[] getNamech() {
		return nameCH;
	}
}
