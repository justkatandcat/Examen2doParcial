package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SesionServlet1 extends HttpServlet {
   
     @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

         String nombre;
         String contras;
         nombre = request.getParameter("usuario");
         contras = request.getParameter("contra");
         
      HttpSession sesion = request.getSession();
      sesion.setAttribute("ses", nombre + contras);

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
       
      out.println("<a href=\"/Examen2/ValidaSesiones1\"> suma </a>");
      out.println("<br>");
      out.println("ID: " + sesion.getId());
  
    }
   

}
