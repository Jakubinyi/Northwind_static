package servlet;

import dao.DatabaseNorthwind;
import org.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jakubinyi on 2017.05.24..
 */
@WebServlet("/fifth")
public class FifthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseNorthwind databaseNorthwind = new DatabaseNorthwind();

        JSONArray jsonArray = databaseNorthwind.totalAmountOfParticularProductForEachYear();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(jsonArray);
    }
}
