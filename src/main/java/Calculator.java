import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String math = request.getParameter("cal");
        if (math.matches("^[-+]?[0-9]+(\\.[0-9]+)?(([-+*/][0-9]+(\\.[0-9]+)?)|([-+*/]\\([-+]?[0-9]+(\\.[0-9]+)?)\\))*$")) {
            writer.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Reslut</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h2>Operation: " + math + "</h2>\n" +
                    "<h2 id=\"reslut\">Reslut: </h2>\n" +
                    "<br>\n" +
                    "<button type=\"button\" onclick=\"window.location.href ='http://localhost:8080/';\">\n" +
                    "    Return to Calculator\n" +
                    "</button>\n" +
                    "<script>\n" +
                    "    let reslut = eval(" + math + ");\n" +
                    "    document.getElementById(\"reslut\").innerHTML += reslut;\n" +
                    "</script>\n" +
                    "</body>\n" +
                    "</html>");
        } else {
            response.sendRedirect(request.getContextPath());
        }
    }
}
