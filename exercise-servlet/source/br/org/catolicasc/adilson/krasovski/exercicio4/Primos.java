package br.org.catolicasc.adilson.krasovski.exercicio4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
import br.org.catolicasc.adilson.krasovski.exercicio3.CalculaTabuada;
import br.org.catolicasc.adilson.krasovski.helpers.Footer;
import br.org.catolicasc.adilson.krasovski.helpers.Head;
import br.org.catolicasc.adilson.krasovski.helpers.Menu;

/**
 * Servlet implementation class TabuadaDe2
 */
@WebServlet("/Primos")
@Log
public class Primos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getElement("Exercicio 4"));
		out.println("    <body role=\"document\">");
		out.println(Menu.getElement());

		out.println("    <div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("<div class=\"jumbotron\">");
		out.println("    <h1>Exercicio 4</h1>");
		out.println("    <p class=\"lead\">Faca um Servlet que imprima os numeros primeos menos que 100</p>");
		out.println("</div>");
		out.println("<div class=\"page-header\">     ");
		out.println("<h1>Números Primos</h1>               ");
		out.println("</div>                        ");
		out.println("<table class=\"table table-striped\">         ");
		out.println("<thead>                 ");
		out.println("<tr>                    ");
		out.println("  <th>Numeros</th>            ");

		out.println("</tr>                   ");
		out.println("</thead>                ");
		out.println(" <tbody>                ");
		CalculaPrimos primos = new CalculaPrimos(100);

		out.println("	<tr>");
		for (Integer primo : primos.getValidNumbers()) {
			out.println("        <td>" + primo + "</td>");
		}
		out.println("	</tr>");

		out.println(" </tbody>");
		out.println(" </table>");

		out.println("</div>");
		out.println(Footer.getElement());

		out.println("    </body>\n");
		out.println("</html>");

	}
}
