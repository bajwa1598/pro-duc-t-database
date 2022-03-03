package com.products.product.database;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AddProducts extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public AddProducts() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String serialNo= request.getParameter("serial_no");
        String invoiceTime = request.getParameter("invoice_time");
        String dateOfPurchase= request.getParameter("date_of_purchase");
        String warrantyPeriod= request.getParameter("warranty_period");
	String brandName= request.getParameter("brand_name");
        String productName= request.getParameter("product_name");
        String modelNo= request.getParameter("model_no");
        String buyerName= request.getParameter("buyer_name");
        String buyerAddress= request.getParameter("buyer_address");
        String buyerContactDetail= request.getParameter("buyer_contact_detail");
        String emailAddress= request.getParameter("email_address");
        String phoneNo = request.getParameter("phone_no");
        
        Products products = new Products(serialNo, invoiceTime, dateOfPurchase, warrantyPeriod, brandName, productName, modelNo, buyerName, buyerAddress, buyerContactDetail, emailAddress, phoneNo);
        ProductsDAO productsDAO = new ProductsDAO();
        String result = productsDAO.insert(products);
//      response.getWriter().print(result);
//      response.getWriter().print("Product Details Entered Successfully");
        RequestDispatcher rd = request.getRequestDispatcher("productAdd.html");
        rd.include(request, response);
        
    }
}
