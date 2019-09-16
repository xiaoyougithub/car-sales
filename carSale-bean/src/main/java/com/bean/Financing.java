package com.bean;
public class Financing {
    private Integer financingId;//财务编号
    private Integer companyId;//公司编号
    private Double financingMoney;//涉及金额
    private Integer saleId;//销售编号
    private Integer repertoryId;//库存编号 
    private java.util.Date financingTime;//生成时间
    private Object financingType;//财务状态（1：收入，2：支出）
    public Financing() {
        super();
    }
    public Financing(Integer financingId,Integer companyId,Double financingMoney,Integer saleId,Integer repertoryId,java.util.Date financingTime,Object financingType) {
        super();
        this.financingId = financingId;
        this.companyId = companyId;
        this.financingMoney = financingMoney;
        this.saleId = saleId;
        this.repertoryId = repertoryId;
        this.financingTime = financingTime;
        this.financingType = financingType;
    }
    public Integer getFinancingId() {
        return this.financingId;
    }

    public void setFinancingId(Integer financingId) {
        this.financingId = financingId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getFinancingMoney() {
        return this.financingMoney;
    }

    public void setFinancingMoney(Double financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Integer getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getRepertoryId() {
        return this.repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public java.util.Date getFinancingTime() {
        return this.financingTime;
    }

    public void setFinancingTime(java.util.Date financingTime) {
        this.financingTime = financingTime;
    }

    public Object getFinancingType() {
        return this.financingType;
    }

    public void setFinancingType(Object financingType) {
        this.financingType = financingType;
    }

}
