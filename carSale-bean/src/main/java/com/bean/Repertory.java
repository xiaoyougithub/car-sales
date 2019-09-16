package com.bean;
public class Repertory {
    private Integer repertoryId;//库存编号
    private java.util.Date inTime;//入库时间
    private Integer companyId;//公司编号
    private Integer repertoryNum;//库存数量

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Double purchasePrice;//含税价格
    private Integer carId;//汽车编号
    private Company company;
    private Car car;
    public Repertory() {
        super();
    }
    public Repertory(Integer repertoryId,java.util.Date inTime,Integer companyId,Integer repertoryNum,Double purchasePrice,Integer carId) {
        super();
        this.repertoryId = repertoryId;
        this.inTime = inTime;
        this.companyId = companyId;
        this.repertoryNum = repertoryNum;
        this.purchasePrice = purchasePrice;
        this.carId = carId;
    }
    public Integer getRepertoryId() {
        return this.repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public java.util.Date getInTime() {
        return this.inTime;
    }

    public void setInTime(java.util.Date inTime) {
        this.inTime = inTime;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getRepertoryNum() {
        return this.repertoryNum;
    }

    public void setRepertoryNum(Integer repertoryNum) {
        this.repertoryNum = repertoryNum;
    }

    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

}
