package examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class CalculatorServlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();

        String sP1 = request.getParameter("p1");
        int iP1 = Integer.parseInt(sP1);

        String sP2 = request.getParameter("p2");
        int iP2 = Integer.parseInt(sP2);

        String sProcess = request.getParameter("process");
        
        int result = 0; 
        if (PROCESS_ADD.equals(sProcess)) {
            result = doAdd(iP1, iP2);
        } else if (PROCESS_SUB.equals(sProcess)) {
            result = doSub(iP1, iP2);
        } else if (PROCESS_MUL.equals(sProcess)) {
            result = doMul(iP1, iP2);
        } else if (PROCESS_DIV.equals(sProcess)) {
            result = doDiv(iP1, iP2);
        }

        response.setContentType("text/html");

        out.println("<html><body>");
        
        out.println("<h2>Calculator</h2>");
        out.println("Result: " + result);
        
        // back button
        out.println("<FORM><INPUT Type=\"button\" VALUE=\"Back\" onClick=\"history.go(-1);return true;\"></FORM>");
        
        out.println("</body></html>");
	}
    
    private int doAdd(int iP1, int iP2) 
    {
        return iP1 + iP2;
    }

    private int doSub(int iP1, int iP2) 
    {
        return iP1 - iP2;
    }

    private int doMul(int iP1, int iP2) 
    {
        return iP1 * iP2;
    }

    private int doDiv(int iP1, int iP2) 
    {
        return iP1 / iP2;
    }

    private final static String PROCESS_ADD = "+";
    private final static String PROCESS_SUB = "-";
    private final static String PROCESS_MUL = "*";
    private final static String PROCESS_DIV = "/";
    
}
