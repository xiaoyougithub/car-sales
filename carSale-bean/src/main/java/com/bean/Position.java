package com.bean;
public class Position {
    private Integer positionId;//职务编号
    private String positionName;//鑱屽姟鍚嶇О锛堢粡鐞嗐€佹搷浣滃憳銆侀攢鍞憳锛?
    private String positionLevel;//鑱屽姟绛夌骇锛?锛氱粡鐞嗐€?锛氭搷浣滃憳銆?锛氶攢鍞憳锛?
    public Position() {
        super();
    }
    public Position(Integer positionId,String positionName,String positionLevel) {
        super();
        this.positionId = positionId;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
    }
    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionLevel() {
        return this.positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

}
