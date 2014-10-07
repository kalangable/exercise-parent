package br.org.catolicasc.adilson.krasovski.helpers;

public class Head {
	public static final String getHead() {
		StringBuffer sBuffer = new StringBuffer(getStarHead());
		sBuffer.append("    </head>");
		return sBuffer.toString();
	}

	public static final String getHeadWhithTitle(String title) {
		StringBuffer sBuffer = new StringBuffer(getStarHead());
		sBuffer.append("        <title>" + title + "</title>");
		sBuffer.append("\r");
		sBuffer.append("    </head>");
		return sBuffer.toString();
	}

	private static final String getStarHead() {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("	<head>");
		sBuffer.append("\r");
		sBuffer.append("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">");
		sBuffer.append("\r");
		sBuffer.append("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">");
		sBuffer.append("\r");
		sBuffer.append("		<link rel=\"stylesheet\" href=\"http://getbootstrap.com/examples/theme/theme.css\">");
		sBuffer.append("\r");
		return sBuffer.toString();
	}

}
