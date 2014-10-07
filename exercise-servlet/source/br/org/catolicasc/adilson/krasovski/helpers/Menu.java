package br.org.catolicasc.adilson.krasovski.helpers;

public class Menu extends Element {

	private static final String MENU;

	static {
		StringBuffer sb = new StringBuffer();
		addLine(sb, "<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">");
		addLine(sb, "  <div class=\"container\">");
		addLine(sb, "    <div class=\"navbar-header\">");
		addLine(sb, "      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">");
		addLine(sb, "        <span class=\"sr-only\">Toggle navigation</span>");
		addLine(sb, "        <span class=\"icon-bar\"></span>");
		addLine(sb, "        <span class=\"icon-bar\"></span>");
		addLine(sb, "        <span class=\"icon-bar\"></span>");
		addLine(sb, "      </button>");
		addLine(sb, "      <a class=\"navbar-brand\" href=\"#\">Servlets</a>");
		addLine(sb, "    </div>");
		addLine(sb, "    <div class=\"navbar-collapse collapse\">");
		addLine(sb, "      <ul class=\"nav navbar-nav\">");
		addLine(sb, "        <li class=\"active\"><a href=\"OlaMundo\">Inicio</a></li>");
		addLine(sb, "        <li><a href=\"Tabuada\">Tabuada</a></li>");
		addLine(sb, "        <li><a href=\"TabuadaVariada\">Tabela Tabuada</a></li>");
		addLine(sb, "      </ul>");
		addLine(sb, "    </div>");
		addLine(sb, "    </div>");

		addLine(sb, "</div>");
		MENU = sb.toString();
	}

	public static String getElement() {
		return MENU;
	}

}
