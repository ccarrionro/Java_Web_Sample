package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los datos del formulario
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");

		// Pasar los datos a la vista (JSP)
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellidos", apellidos);

		// Redirigir a la página de resultado
		request.getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().println("El método GET no es soportado en esta URL.");
	}

}