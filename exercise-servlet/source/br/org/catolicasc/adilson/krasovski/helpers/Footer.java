package br.org.catolicasc.adilson.krasovski.helpers;

public class Footer {

	public final static String getFooter() {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("		<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>");
		sBuffer.append("\r");
		sBuffer.append("		<script src=\"http://code.jquery.com/jquery-2.1.1.min.js\"></script>");
		return sBuffer.toString();
	}
}
