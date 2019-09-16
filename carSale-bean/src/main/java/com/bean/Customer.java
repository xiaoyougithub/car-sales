package com.bean;
public class Customer {
    private Integer customerId;//客户编号
    private String customerSex;//瀹㈡埛鎬у埆
    private String customerName;//瀹㈡埛濮撳悕
    private Integer companyId;//公司编号
    private String customerPhone;//瀹㈡埛鐢佃瘽
    private String customerType;//瀹㈡埛绫诲瀷锛?锛氫釜浜恒€?锛氬叕鍙革級
    private java.util.Date customerCreateTime;//创建时间
    private java.util.Date customerBirthday;//客户生日
    public Customer() {
        super();
    }
    public Customer(Integer customerId,String customerSex,String customerName,Integer companyId,String customerPhone,String customerType,java.util.Date customerCreateTime,java.util.Date customerBirthday) {
        super();
        this.customerId = customerId;
        this.customerSex = customerSex;
        this.customerName = customerName;
        this.companyId = companyId;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.customerCreateTime = customerCreateTime;
        this.customerBirthday = customerBirthday;
        this.customerId = customerId;
    }
    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public String getCustomerSex() {
        return this.customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public java.util.Date getCustomerCreateTime() {
        return this.customerCreateTime;
    }

    public void setCustomerCreateTime(java.util.Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public java.util.Date getCustomerBirthday() {
        return this.customerBirthday;
    }

    public void setCustomerBirthday(java.util.Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }
}
