package pucese.edu.ec;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.constraints.Length;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		String edad = request.getParameter("edad");
		String sueldo = request.getParameter("sueldo");	
		//pasar datos
		int edadP = Integer.parseInt(edad);
		double sueldoP = Double.parseDouble(sueldo);
		StringBuilder sb1 = new StringBuilder();
		sb1.append("<html> <head><title> ")
		.append("Error")
		.append("</title> </head>")
		.append("<body><h1>SE DETECTARON ERRORES AL MOMENTO DE INGRESAR DATO</h1>");
		
		if(id.equals("") || id.equals(" ")) {
			sb1.append("<p>id: ").append(id).append(": El campo esta vacio").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if(nombre.equals("") || nombre.equals(" ")) {
			sb1.append("<p>Nombre: ").append(nombre).append(": El campo esta vacio").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if(apellido.equals("") || apellido.equals(" ")) {
			sb1.append("<p>Apellido: ").append(apellido).append(": El campo esta vacio").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if(telefono.equals("") || telefono.equals(" ")) {
			sb1.append("<p>Telefono: ").append(telefono).append(": El campo esta vacio").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if(sueldoP <= 0) {
			sb1.append("<p>Sueldo: ").append(sueldo).append(": El campo no puede ser menor a 0").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if(sueldo.equals("0.0") || sueldo.equals(" ") || sueldo.equals("")) {
			sb1.append("<p>Sueldo: ").append(sueldo).append(": El campo esta vacio").append("</p>")
			.append("</body></html>");
			out.print(sb1.toString());
			out.flush();
		}
		else if (edadP <= 0 ) {
			sb1.append("<p>Edad: ").append(edadP).append(": ES MENOR A 0").append("</p>")
			.append("</body></html>");
			//imprimir la cadena que construye la pagina html
			out.print(sb1.toString());
			out.flush();
		}
		else if (edadP <= 0 ) {
			sb1.append("<p>Edad: ").append(edadP).append(": ES MENOR A 0").append("</p>")
			.append("</body></html>");
			//imprimir la cadena que construye la pagina html
			out.print(sb1.toString());
			out.flush();
		}
		else if(edad.length() > 2) {
			sb1.append("<p>Edad: ").append(edadP).append(": Contiene mas de 2 cifras").append("</p>")
			.append("</body></html>");
			//imprimir la cadena que construye la pagina html
			out.print(sb1.toString());
			out.flush();
		}
		else if(telefono.length() > 10) {
			sb1.append("<p>Edad: ").append(telefono).append(": NO PUEDE SER MAYOR A 10").append("</p>")
			.append("</body></html>");
			//imprimir la cadena que construye la pagina html
			out.print(sb1.toString());
			out.flush();
		}
		else {
			sb1.append("<html> <head><title> ")
			.append("LIBRETA DE CONTACTOS")
			.append("</title> </head>")
			.append("<body><h1>LIBRETA DE CONTACTOS</h1><table border='2px'>")
			
			.append("<thead><tr><th>")
			.append("<p>Id:").append(id).append("</p>")
			.append("<p>Nombre:").append(nombre).append("</p>")
			.append("<p>Apellido:").append(apellido).append("</p>")
			.append("<p>Telefono:").append(telefono).append("</p>")
			.append("<p>Edad:").append(edad).append("</p>")
			.append("<p>Sueldo:").append(sueldo).append("</p>")
			.append("</table></body></html>");
			
			//imprimir la cadena que construye la pagina html
			out.print(sb1.toString());
			out.flush();
		
		}
	}
	
	

}
