package br.org.catolicasc.adilson.krasovski.exercicio6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.val;
import lombok.extern.java.Log;
import br.org.catolicasc.adilson.krasovski.exercicio3.CalculaTabuada;
import br.org.catolicasc.adilson.krasovski.helpers.Footer;
import br.org.catolicasc.adilson.krasovski.helpers.Head;
import br.org.catolicasc.adilson.krasovski.helpers.Menu;

/**
 * Servlet implementation class TabuadaDe2
 */
@WebServlet("/TabuadaPOST")
@Log
public class TabuadaMetodoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		val numero = request.getParameter("numero");

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getElement("Exercicio 6"));
		out.println("    <body role=\"document\">");
		out.println(Menu.getElement());

		out.println("		<div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("			<div class=\"jumbotron\">");
		out.println("    			<h1>Exercicio 6</h1>");
		out.println("    			<p class=\"lead\">Faça um HTML que solicite um número para o usuário e redirecione para um Servlet que gera a tabuada deste número usando o método POST</p>");
		out.println("			</div>");
		out.println("			<div class=\"page-header\">     ");
		out.println("				<h1>Tabuada</h1>               ");
		out.println("			</div>");
		out.println("			<form role=\"form\" action=\"TabuadaPOST\" method=\"POST\">");
		out.println("				<div class=\"form-group\">");
		out.println("					<label for=\"numero\">Número</label>");
		out.println("					<input type=\"text\" class=\"form-control\" name=\"numero\" placeholder=\"Digite um numero\">");
		out.println("				</div>");
		out.println("				<button type=\"submit\" class=\"btn btn-primary\">Calcular</button>");
		out.println("			</form>");
		out.println("		</div>");
		out.println(Footer.getElement());

		out.println("    </body>\n");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		val numero = request.getParameter("numero");

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getElement("Exercicio 6"));
		out.println("    <body role=\"document\">");
		out.println(Menu.getElement());

		out.println("		<div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("			<div class=\"jumbotron\">");
		out.println("    			<h1>Exercicio 6</h1>");
		out.println("    			<p class=\"lead\">Faça um HTML que solicite um número para o usuário e redirecione para um Servlet que gera a tabuada deste número usando o método POST</p>");
		out.println("			</div>");
		out.println("			<div class=\"page-header\">     ");
		out.println("				<h1>Tabuada</h1>               ");
		out.println("			</div>");
		if (numero != null) {
			out.println("			<form role=\"form\" action=\"TabuadaPOST\">");
			out.println("		<table class=\"table table-striped\">         ");
			out.println("			<thead>                 ");
			out.println("				<tr>                    ");
			out.println("  					<th>" + numero + "</th>            ");
			out.println("				</tr>                   ");
			out.println("			</thead>                ");
			out.println(" 			<tbody>                ");
			CalculaTabuada c = new CalculaTabuada(Integer.parseInt(numero));
			for (int i = 0; i <= 10; i++) {
				out.println("					<td>" + c.nextMulti(i) + "</td>");
			}
			out.println(" 					</tbody>");
			out.println(" 				</table>");
			out.println("				<button type=\"refresh\" class=\"btn btn-primary\">Novo Cálculo</button>");
			out.println("			</form>");
		}
		out.println("</div>");
		out.println(Footer.getElement());

		out.println("    </body>\n");
		out.println("</html>");

	}
}
