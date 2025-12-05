import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FavoriteFoodServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        req.setCharacterEncoding("utf-8");
        
        String username = req.getParameter("name");  
        String favoritefood = req.getParameter("food");  

    
        req.setAttribute("name", username);
        req.setAttribute("food", favoritefood);

        
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("favoritefood");  
        
        dispatcher.forward(req, res);
    }
}