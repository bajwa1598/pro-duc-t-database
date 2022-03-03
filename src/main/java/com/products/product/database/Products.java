package com.products.product.database;

public class Products {
    private String serialNo, invoiceTime, dateOfPurchase, warrantyPeriod, brandName, productName, modelNo, buyerName, buyerAddress, buyerContactDetail, emailAddress, phoneNo;

    public Products(){
    super();
    }

    public Products(String serialNo, String invoiceTime, String dateOfPurchase, String warrantyPeriod, String brandName, String productName, String modelNo, String buyerName, String buyerAddress, String buyerContactDetail, String emailAddress, String phoneNo) {
        super();
        this.serialNo = serialNo;
        this.invoiceTime = invoiceTime;
        this.dateOfPurchase = dateOfPurchase;
        this.warrantyPeriod = warrantyPeriod;
        this.brandName = brandName;
        this.productName = productName;
        this.modelNo = modelNo;
        this.buyerName = buyerName;
        this.buyerAddress = buyerAddress;
        this.buyerContactDetail = buyerContactDetail;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerContactDetail() {
        return buyerContactDetail;
    }

    public void setBuyerContactDetail(String buyerContactDetail) {
        this.buyerContactDetail = buyerContactDetail;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
}
