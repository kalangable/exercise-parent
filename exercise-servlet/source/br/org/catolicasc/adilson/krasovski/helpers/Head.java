package br.org.catolicasc.adilson.krasovski.helpers;

public class Head extends Element {
	public static final String getElement() {
		return getElement("");
	}

	public static final String getElement(String title) {
		StringBuffer sBuffer = new StringBuffer(getStarHead());
		addLine(sBuffer, title.trim().isEmpty() ? "" : "        <title>" + title + "</title>\r");
		addLine(sBuffer, "    </head>");
		return sBuffer.toString();
	}

	private static final String getStarHead() {
		StringBuffer sBuffer = new StringBuffer();
		addLine(sBuffer, "	<head>");
		addLine(sBuffer, "		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">");
		addLine(sBuffer, "		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">");
		addLine(sBuffer, "		<link rel=\"stylesheet\" href=\"http://getbootstrap.com/examples/theme/theme.css\">");
		return sBuffer.toString();
	}

}
