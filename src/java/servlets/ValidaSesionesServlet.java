package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ValidaSesionesServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

      response.setContentType("text/html");
      HttpSession sesion = request.getSession();
      String titulo = null;

      String claveSesion = (String) sesion.getAttribute("ses");

      if(claveSesion.equals("KatiaJuarez")){
        titulo = "llave correcta continua la sesion";
        PrintWriter out = response.getWriter();
        out.println("ID: " + sesion.getId());
        out.println("<a href=\"/Examen2/index.html\"> BIENVENIDA  </a>");
      }
      else
      {
        titulo = "llave incorrecta inicie nuevamente sesion";
        PrintWriter out = response.getWriter();
        out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
        out.println("<a href=\"/EjemploSession/error.html\"> ERROR  </a>");
      }


      //Mostramos los  valores en el cliente
      PrintWriter out = response.getWriter();
      out.println("¿Continua la Sesion y es valida?: " + titulo);
      
      out.println("<br>");
      out.println("something ");
      out.println("<br>");
      
      
    }

}
