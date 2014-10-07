package br.org.catolicasc.adilson.krasovski.helpers;

public class Footer extends Element {

	private static final String FOOTER;

	static {
		StringBuffer sb = new StringBuffer();
		addLine(sb, "		<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>");
		addLine(sb, "		<script src=\"http://code.jquery.com/jquery-2.1.1.min.js\"></script>");
		FOOTER = sb.toString();
	}

	public final static String getElement() {
		return FOOTER;
	}

}
