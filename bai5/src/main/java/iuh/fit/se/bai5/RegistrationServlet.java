package iuh.fit.se.bai5;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        String html = "<html>"
                + "<head>"
                + "<title>Result Page</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; margin: 40px; background-color: #f0f0f0; }"
                + ".container { background-color: white; padding: 30px; border-radius: 8px; max-width: 600px; margin: 0 auto; box-shadow: 0 0 10px rgba(0,0,0,0.1); }"
                + ".method-info { background-color: #e9ecef; padding: 15px; border-radius: 5px; margin-bottom: 20px; }"
                + ".field { margin-bottom: 10px; }"
                + ".field strong { display: inline-block; width: 120px; }"
                + ".back-link { margin-top: 20px; text-align: center; }"
                + ".back-link a { text-decoration: none; background-color: #007bff; color: white; padding: 10px 15px; border-radius: 4px; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='container'>";

        html += "<div class='method-info'>"
                + "<h2>HTTP GET Request</h2>"
                + "<strong>Method:</strong> GET<br>"
                + "<strong>Query String:</strong> " + (request.getQueryString() != null ? request.getQueryString() : "N/A")
                + "</div>";

        html += "<h1>Registration Information (GET Method)</h1>";

        if (firstName != null && !firstName.trim().isEmpty()) {
            html += "<div class='field'><strong>First Name:</strong> " + firstName + "</div>";
        }
        if (lastName != null && !lastName.trim().isEmpty()) {
            html += "<div class='field'><strong>Last Name:</strong> " + lastName + "</div>";
        }
        if (username != null && !username.trim().isEmpty()) {
            html += "<div class='field'><strong>Username:</strong> " + username + "</div>";
        }
        if (email != null && !email.trim().isEmpty()) {
            html += "<div class='field'><strong>E-mail:</strong> " + email + "</div>";
        }
        // Password không hiển thị vì lý do bảo mật
        if (password != null && !password.trim().isEmpty()) {
            html += "<div class='field'><strong>Password:</strong> [Hidden for security]</div>";
        }
        if (facebook != null && !facebook.trim().isEmpty()) {
            html += "<div class='field'><strong>Facebook:</strong> " + facebook + "</div>";
        }
        if (shortBio != null && !shortBio.trim().isEmpty()) {
            html += "<div class='field'><strong>Short Bio:</strong><br>" + shortBio.replace("\n", "<br>") + "</div>";
        }

        html += "<div class='back-link'>"
                + "<a href='registration.html'>← Back to Registration</a>"
                + "</div>"
                + "</div>"
                + "</body>"
                + "</html>";

        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        String html = "<html>"
                + "<head>"
                + "<title>Result Page</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; margin: 40px; background-color: #f0f0f0; }"
                + ".container { background-color: white; padding: 30px; border-radius: 8px; max-width: 600px; margin: 0 auto; box-shadow: 0 0 10px rgba(0,0,0,0.1); }"
                + ".method-info { background-color: #d4edda; padding: 15px; border-radius: 5px; margin-bottom: 20px; }"
                + ".field { margin-bottom: 10px; }"
                + ".field strong { display: inline-block; width: 120px; }"
                + ".back-link { margin-top: 20px; text-align: center; }"
                + ".back-link a { text-decoration: none; background-color: #28a745; color: white; padding: 10px 15px; border-radius: 4px; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='container'>";

        html += "<div class='method-info'>"
                + "<h2>HTTP POST Request</h2>"
                + "<strong>Method:</strong> POST<br>"
                + "<strong>Content Type:</strong> " + (request.getContentType() != null ? request.getContentType() : "N/A")
                + "</div>";

        html += "<h1>Registration Information (POST Method)</h1>";

        if (firstName != null && !firstName.trim().isEmpty()) {
            html += "<div class='field'><strong>First Name:</strong> " + firstName + "</div>";
        }
        if (lastName != null && !lastName.trim().isEmpty()) {
            html += "<div class='field'><strong>Last Name:</strong> " + lastName + "</div>";
        }
        if (username != null && !username.trim().isEmpty()) {
            html += "<div class='field'><strong>Username:</strong> " + username + "</div>";
        }
        if (email != null && !email.trim().isEmpty()) {
            html += "<div class='field'><strong>E-mail:</strong> " + email + "</div>";
        }
        // Password không hiển thị vì lý do bảo mật
        if (password != null && !password.trim().isEmpty()) {
            html += "<div class='field'><strong>Password:</strong> [Hidden for security]</div>";
        }
        if (facebook != null && !facebook.trim().isEmpty()) {
            html += "<div class='field'><strong>Facebook:</strong> " + facebook + "</div>";
        }
        if (shortBio != null && !shortBio.trim().isEmpty()) {
            html += "<div class='field'><strong>Short Bio:</strong><br>" + shortBio.replace("\n", "<br>") + "</div>";
        }

        html += "<div class='method-info'>"
                + "<h3>GET vs POST Comparison:</h3>"
                + "<strong>GET Method:</strong><br>"
                + "- Data sent in URL parameters<br>"
                + "- Visible in browser address bar<br>"
                + "- Limited data length<br>"
                + "- Can be bookmarked<br>"
                + "- Less secure for sensitive data<br><br>"
                + "<strong>POST Method:</strong><br>"
                + "- Data sent in request body<br>"
                + "- Not visible in URL<br>"
                + "- No practical data length limit<br>"
                + "- Cannot be bookmarked<br>"
                + "- More secure for sensitive data"
                + "</div>";

        html += "<div class='back-link'>"
                + "<a href='registration.html'>← Back to Registration</a>"
                + "</div>"
                + "</div>"
                + "</body>"
                + "</html>";

        out.println(html);
    }
}
