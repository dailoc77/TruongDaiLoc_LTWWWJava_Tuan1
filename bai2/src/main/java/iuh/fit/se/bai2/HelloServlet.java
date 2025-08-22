package iuh.fit.se.bai2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Jakarta Servlet doGet() Demo";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>Đây là response từ phương thức doGet()</p>");
        out.println("<p>Content-Type: text/html</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}