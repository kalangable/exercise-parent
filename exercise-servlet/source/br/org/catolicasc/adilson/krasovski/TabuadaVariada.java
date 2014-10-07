package br.org.catolicasc.adilson.krasovski;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.catolicasc.adilson.krasovski.helpers.Footer;
import br.org.catolicasc.adilson.krasovski.helpers.Head;

/**
 * Servlet implementation class Tabuada
 */
@WebServlet(name = "TabuadaVariada", urlPatterns = { "/TabuadaVariada" })
public class TabuadaVariada extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7791908416215607086L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		StringWriter buffer = new StringWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getHeadWhithTitle("Exercicio 3"));
		out.println("    <body role=\"document\">");
		out.println("<!-- Fixed navbar -->                                                                                                                                       ");
		out.println("<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">                                                                                      ");
		out.println("  <div class=\"container\">                                                                                                                                   ");
		out.println("    <div class=\"navbar-header\">                                                                                                                             ");
		out.println("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">                                          ");
		out.println("        <span class=\"sr-only\">Toggle navigation</span>                                                                                                      ");
		out.println("        <span class=\"icon-bar\"></span>                                                                                                                      ");
		out.println("        <span class=\"icon-bar\"></span>                                                                                                                      ");
		out.println("        <span class=\"icon-bar\"></span>                                                                                                                      ");
		out.println("      </button>                                                                                                                                             ");
		out.println("      <a class=\"navbar-brand\" href=\"#\">Servlets</a>                                                                                                  ");
		out.println("    </div>                                                                                                                                                  ");
		out.println("    <div class=\"navbar-collapse collapse\">                                                                                                                  ");
		out.println("      <ul class=\"nav navbar-nav\">                                                                                                                           ");
		out.println("        <li class=\"active\"><a href=\"OlaMundo\">Inicio</a></li>                                                                                                        ");
		out.println("        <li><a href=\"Tabuada\">Tabuada</a></li>                                                                                                                 ");
		out.println("        <li><a href=\"TabuadaVariada\">Tabela Tabuada</a></li>");
		out.println("      </ul>");
		out.println("    </div>");
		out.println("    </div>");
		out.println("</div>                                                                                                                                                      ");

		out.println("    <div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("<div class=\"jumbotron\">");
		out.println("    <h1>Exercicio 3</h1>");
		out.println("    <p class=\"lead\">Faca um Servlet que imprima as tabuada do 2 ao 10</p>");
		out.println("</div>");

		out.println("<div class=\"page-header\">     ");
		out.println("<h1>Tabuada</h1>               ");
		out.println("</div>                        ");
		out.println("<table class=\"table table-striped\">         ");
		out.println("<thead>                 ");
		out.println("<tr>                    ");
		for (int i = 2; i <= 10; i++) {
			out.println("  <th>" + i + "</th>            ");
		}
		out.println("</tr>                   ");
		out.println("</thead>                ");
		out.println(" <tbody>                ");

		for (int j = 0; j <= 10; j++) {
			CalculaTabuada c = new CalculaTabuada(j);
			out.println("     <tr>");
			for (int i = 2; i <= 10; i++) {
				out.print("         <td>");
				out.print(c.nextMultiplicado(i).trim());
				out.println("</td>");
			}
			out.println("     </tr>");
		}
		out.println(" </tbody>                ");
		out.println(" </table>");
		// out.println("</div>                        ");

		out.println("</div>                                                                                                                                                      ");
		out.println("</div>                                                                                                                                                      ");
		out.println(Footer.getFooter());

		buffer.write("    </body>\n");
		buffer.write("</html>");

		out.print(buffer);
	}

}
