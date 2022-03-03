package com.products.product.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductsDAO {
    private String dbUrl = "jdbc:postgresql://ec2-35-175-68-90.compute-1.amazonaws.com:5432/d50oudr5stuh4v?sslmode=require";
    private String dbUname = "tpavixpchiudcf";
    private String dbPassword = "38d9424489afe824c0374811327c6e503bba844124a3e1255e397e84be160090";
    private String dbDriver = "org.postgresql.Driver";
    
    public void loadDriver(String dbDriver) {
	try {
            Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
            e.printStackTrace();
	}
    }
    
    public Connection getConnection(){
       
    	Connection con = null;
        try {
           con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return con;
    }
    
    public String insert(Products products) {
		
	loadDriver(dbDriver);
	Connection con = getConnection();
	String result = "Data entered successfully";
	String sql = "INSERT INTO product_records (serialNo, invoiceTime, dateOfPurchase, warrantyPeriod, brandName, productName, modelNo, buyerName, buyerAddress, buyerContactDetail, emailAddress, phoneNo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, products.getSerialNo());
            ps.setString(2, products.getInvoiceTime());
            ps.setString(3, products.getDateOfPurchase());
            ps.setString(4, products.getWarrantyPeriod());
            ps.setString(5, products.getBrandName());
            ps.setString(6, products.getProductName());
            ps.setString(7, products.getModelNo());
            ps.setString(8, products.getBuyerName());
            ps.setString(9, products.getBuyerAddress());
            ps.setString(10, products.getBuyerContactDetail());
            ps.setString(11, products.getEmailAddress());
            ps.setString(12, products.getPhoneNo());
            ps.executeUpdate();
            } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "Data not entered";
            }
        return result;
    }
}