package com.bean;
public class Carseries {
    private Integer seriesId;//车系编号
    private String seriesName;//汽车车系表
    private Integer brandId;//品牌编号
    public Carseries() {
        super();
    }
    public Carseries(Integer seriesId,String seriesName,Integer brandId) {
        super();
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.brandId = brandId;
    }
    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

}
