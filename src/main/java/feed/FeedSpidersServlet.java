package feed;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FeedSpidersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (!PermissionChecker.hasUserAccess("spiders", request)) {
            out.println("<h3>NOT Feed the spiders!</h3>");
        } else {
            out.println("<h3>Feed the spiders!</h3>");
        }

    }

}