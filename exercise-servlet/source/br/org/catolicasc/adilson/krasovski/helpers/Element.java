package br.org.catolicasc.adilson.krasovski.helpers;

/**
 * Utilitário para incluir o /r no StringBuffer e formatar melhor a saída para o Browser
 * @author adilson.krasovski
 *
 */
public class Element {
	private static final boolean IS_DEVELOMENT_TIME = true;
	
	/**
	 * Fornece a linha formatada com a quebra de linha
	 * @param sb
	 * @param txt
	 * @return
	 */
	protected static final StringBuffer addLine(StringBuffer sb, String txt) {
		if( IS_DEVELOMENT_TIME ) {
			sb.append(txt);
			sb.append("\r");
		} else {
			sb.append(txt.trim());
		}
		return sb;
	}

}
