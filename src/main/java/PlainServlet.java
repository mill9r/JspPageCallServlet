import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *   If you wan't to call this servlet, you should write this string in browser http://localhost:8080/jsp.do
 */

@WebServlet(urlPatterns = "/jsp.do")
public class PlainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //send our request to doGet method
        String msg = request.getParameter("msg");
        System.out.println(msg);
        request.setAttribute("servletMsg", msg);
        request.getRequestDispatcher("/WEB-INF/views/answer.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get a message from JSP
        //we use this parameter in out form
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);


    }
}
