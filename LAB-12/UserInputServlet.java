import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/UserInputServlet")
public class UserInputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String color = request.getParameter("color");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello " + name + "!</h2>");
        out.println("<p>Your favorite color is " + color + ".</p>");
        out.println("<p>Thank you for sharing your preferences!</p>");
        out.println("</body></html>");
    }
}
