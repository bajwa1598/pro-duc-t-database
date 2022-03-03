package com.products.product.database;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
    public Login() {
        super();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String un = request.getParameter("email");
        String pw = request.getParameter("password");
        response.setContentType("text/html");
        
        String U1 = "Admin";
        String P1 = "Admin321@";
        
        String U2 = "owner";
        String P2 = "Owner";
        
        if(pw.equals(P1) && un.equals(U1)){
            RequestDispatcher rd = request.getRequestDispatcher("addProduct.html");
            rd.forward(request, response);
        } else if(pw.equals(P2) && un.equals(U2)){
            RequestDispatcher rd = request.getRequestDispatcher("addProduct.html");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("Alogin.jsp");
            rd.include(request, response);
        }
        out.close();
    }
}
