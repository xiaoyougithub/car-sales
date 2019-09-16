package com.bean;
public class Carorder {
    private Integer orderId;//订单编号
    private Object orderType;//订单状态（1：未审核、2：已审核）
    private Integer companyId;//公司编号
    private Double orderTotalPrice;//订单总价
    private Integer orderNum;//车辆数量
    private Integer carId;//汽车编号
    public Carorder() {
        super();
    }
    public Carorder(Integer orderId,Object orderType,Integer companyId,Double orderTotalPrice,Integer orderNum,Integer carId) {
        super();
        this.orderId = orderId;
        this.orderType = orderType;
        this.companyId = companyId;
        this.orderTotalPrice = orderTotalPrice;
        this.orderNum = orderNum;
        this.carId = carId;
    }
    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Object getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Object orderType) {
        this.orderType = orderType;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getOrderTotalPrice() {
        return this.orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

}
