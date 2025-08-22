package iuh.fit.se.bai3;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

/**
 * @author DAILOC
 * **/

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private ObjectMapper objectMapper;

    public void init() {
        objectMapper = new ObjectMapper();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Create sample user
        User user = new User("John Doe", 25, "john.doe@example.com");

        // Convert to JSON
        String jsonResponse = objectMapper.writeValueAsString(user);

        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();
    }

    public void destroy() {
    }
}