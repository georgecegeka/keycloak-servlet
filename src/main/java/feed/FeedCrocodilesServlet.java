package feed;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FeedCrocodilesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (!PermissionChecker.hasUserAccess("crocodiles", request)) {
            out.println("<h3>NOT Feed the crocodiles!</h3>");
        } else {
            out.println("<h3>Feed the crocodiles!</h3>");
        }

    }

}