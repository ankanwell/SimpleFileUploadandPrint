package servletpack;
import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
public class ShowFileContent extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.setContentType("text/plain");
            PrintWriter out = response.getWriter();
            BufferedReader brd = request.getReader();
            String begn,head,file,text="";
            int clen,cntr;
            begn = brd.readLine();
            head = brd.readLine();
            out.println("\nCONTENT OF THE FILE");
            out.println("--------------------");
            text = brd.readLine();
            while(text != null)
            {
                out.println(text);
                text = brd.readLine();
            }
            
            out.println("\n\nDocument Content shown Successfully\n\n");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
