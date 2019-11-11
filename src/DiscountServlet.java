import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Product Description");
        float price = Float.parseFloat(request.getParameter("List Price"));
        float percent = Float.parseFloat(request.getParameter("Discount Percent"));
        float amount = price * percent * 0.1f / 100f;
        float DiscountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description : " + description + "</h1>");
        writer.println("<h1>List Price : " + price + "</h1>");
        writer.println("<h1>Discount Percent : " + percent + "</h1>");
        writer.println("<h1>Discount Amount : " + amount + "</h1>");
        writer.println("<h1>Discount Price : " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
