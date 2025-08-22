package iuh.fit.se.bai4;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        // Lấy init-param từ ServletConfig
        String greeting = getServletConfig().getInitParameter("greeting");
        // Lấy context-param từ ServletContext
        String appTitle = getServletContext().getInitParameter("appTitle");
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p><b>Init-param (greeting):</b> " + greeting + "</p>");
        out.println("<p><b>Context-param (appTitle):</b> " + appTitle + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}