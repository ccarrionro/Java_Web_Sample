package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client

		out.println("<html>");
		out.println("<body>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<form action=\'myServlet2\'>");
		out.println("<label for=\"lname\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"Carlos\"><br>");

		out.println("<label for=\"lname\">Apellidos:</label><br>");
		out.println("<input type=\"text\" id=\"lname\" name=\"lname\" value=\"Carrión\"><br><br>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		out.println("</form>");
		out.println("<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/myServlet2 \".</p>");
		out.println("</body>");
		out.println("</html> ");
	}

}