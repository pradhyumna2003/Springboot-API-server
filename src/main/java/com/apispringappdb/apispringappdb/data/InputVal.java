package com.apispringappdb.apispringappdb.data;



import java.util.Objects;





public class InputVal {
    
    private Double  timeVal;
   
    private String serialNo;
    
    private Integer cylinderType;
    
    private Double vldValue  ;
    
    private Double oldValue;
    
    private Double grossWeight;
    
    private Double tareWeight;
    
    private Integer vldResultFlag;
    
    private Integer oldResultFlag;
    
    private Integer grossWeightResultFlag;
    
    private Integer carousel;
    
    private Integer resultFlag;
    
    private String stDueDate;
    
    private String remark;  
    private Integer flag=0;  
    
    public void setTimeVal(Double timeVal) {
        try {
        this.timeVal = Objects.requireNonNull(timeVal);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setSerialNo(String serialNo) {
        try{
            
          String b="";
            if( serialNo.equals(b) ){
                this.flag=1;
            }else{
                this.serialNo=serialNo;
            }
        }catch(Exception e)
        {
            this.flag=1;
        }
        
    }
    
    public void setCylinderType(Integer cylinderType) {
        try {
        this.cylinderType= Objects.requireNonNull(cylinderType);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setVldValue(Double vldValue) {
        try {
        this.vldValue = Objects.requireNonNull(vldValue);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setOldValue(Double oldValue) {
        try {
        this.oldValue = Objects.requireNonNull(oldValue);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setGrossWeight(Double grossWeight) {
        try {
        this.grossWeight= Objects.requireNonNull(grossWeight);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setTareWeight(Double tareWeight) {
        try {
        this.tareWeight= Objects.requireNonNull(tareWeight);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setVldResultFlag(Integer vldResultFlag) {
        try {
        this.vldResultFlag= Objects.requireNonNull(vldResultFlag);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setOldResultFlag(Integer oldResultFlag) {
        try {
        this.oldResultFlag= Objects.requireNonNull(oldResultFlag);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setGrossWeightResultFlag(Integer grossWeightResultFlag) {
        try {
        this.grossWeightResultFlag= Objects.requireNonNull(grossWeightResultFlag);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setCarousel(Integer carousel) {
        try {
        this.carousel = Objects.requireNonNull(carousel);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setResultFlag(Integer resultFlag) {
        try {
        this.resultFlag = Objects.requireNonNull(resultFlag);
        } catch (NullPointerException e) {
        
            this.flag=1;
        }
        
    }
    
    public void setStDueDate(String stDueDate) {
        try{
            
          String b="";
            if( stDueDate.equals(b) ){
                this.flag=1;
            }else{
                this.stDueDate=stDueDate;
            }
        }catch(Exception e)
        {
            this.flag=1;
        }
        
    }
    
    public void setRemark(String remark) {
        try{
            
          String b="";
            if( remark.equals(b) ){
                this.flag=1;
            }else{
                this.remark=remark;
            }
        }catch(Exception e)
        {
            this.flag=1;
        }
    }
    
    public Double getTimeVal() {
        return this.timeVal;
    }
    
    public String getSerialNo() {
        return this.serialNo;
    }
    
    public Integer getCylinderType() {
        return this.cylinderType;
    }
    
    public Double getVldValue() {
        return this.vldValue;
    }
    
    public Double getOldValue() {
        return this.oldValue;
    }
    
    public Double getGrossWeight() {
        return this.grossWeight;
    }
    
    public Double getTareWeight() {
        return this.tareWeight;
    }
    
    public Integer getVldResultFlag() {
        return this.vldResultFlag;
    }
    
    public Integer getOldResultFlag() {
        return this.oldResultFlag;
    }
    
    public Integer getGrossWeightResultFlag() {
        return this.grossWeightResultFlag;
    }
    
    public Integer getCarousel() {
        return this.carousel;
    }
    
    public Integer getResultFlag() {
        return this.resultFlag;
    }
    
    public String getStDueDate() {
        return this.stDueDate;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
 

    
    public Integer getFlag(){
        if (serialNo == null ||serialNo.equals("") || timeVal ==null || cylinderType== null  || vldValue== null || oldValue== null || grossWeight== null || tareWeight== null || vldResultFlag== null || oldResultFlag== null || grossWeightResultFlag== null|| carousel== null|| resultFlag== null || stDueDate == null ||stDueDate.equals("") ||remark == null ||remark.equals("")  ) {
            this.flag=1;    
        }
        else{
            this.flag=0;
        }
        return this.flag;
    }
    
    
    
}
