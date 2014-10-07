package br.org.catolicasc.adilson.krasovski.exercicio1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.catolicasc.adilson.krasovski.helpers.Footer;
import br.org.catolicasc.adilson.krasovski.helpers.Head;
import br.org.catolicasc.adilson.krasovski.helpers.Menu;

/**
 * Servlet implementation class OlaMundo
 */
@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(Head.getElement());
		out.println("	<body role=\"document\">");
		out.println(Menu.getElement());

		out.println("		<div class=\"container theme-showcase\" role=\"main\"> ");
		out.println("			<div class=\"jumbotron\">");
		out.println("				<h1>Exercicio 1</h1>");
		out.println("				<p class=\"lead\">Faça um Servlet que escreva Olá Mundo. E rode através da sua IDE</p>");
		out.println("			</div>");

		out.println("			<div class=\"page-header\">     ");
		out.println("				<h1>Ola Mundo!</h1>               ");
		out.println("			</div>                        ");
		out.println("		</div>                        ");

		out.println(Footer.getElement());
		out.println("    </body>\n");
		out.println("</html>");

	}

}
