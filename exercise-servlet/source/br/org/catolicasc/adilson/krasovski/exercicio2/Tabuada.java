package br.org.catolicasc.adilson.krasovski.exercicio2;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/Tabuada")
@Log
public class Tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String multi = request.getParameter("multiplicador");
		log.severe("Dados [" + multi + "]");
		CalculaTabuada c = new CalculaTabuada(Integer.parseInt((multi == null ? "2" : multi)));
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getElement("Exercicio 2"));
		out.println("    <body role=\"document\">");
		out.println(Menu.getElement());

		out.println("    <div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("<div class=\"jumbotron\">");
		out.println("    <h1>Exercicio 2</h1>");
		out.println("    <p class=\"lead\">Faca um Servlet que imprima a tabuada do 2</p>");
		out.println("</div>");

		out.println("<div class=\"page-header\">     ");
		out.println("<h1>Tabuada</h1>               ");
		out.println("</div>                        ");
		out.println("<table class=\"table table-striped\">         ");
		out.println("<thead>                 ");
		out.println("<tr>                    ");
		out.println("  <th>" + multi + "</th>            ");

		out.println("</tr>                   ");
		out.println("</thead>                ");
		out.println(" <tbody>                ");
		for (int i = 0; i <= 10; i++) {
			out.println("        <td>" + c.nextMulti(i) + "</td>");
		}
		out.println(" </tbody>");
		out.println(" </table>");

		out.println("</div>");
		out.println("</div>");
		out.println(Footer.getElement());

		out.println("    </body>\n");
		out.println("</html>");

	}

}
