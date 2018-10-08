package com.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dynasty implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String name;        //名称
    private Date startDate;     //开始时间
    private Date endDate;       //结束时间
    private Long startEmperorId;        //开始皇帝id
    private Long endEmperorId;      //结束皇帝id
    private String remark;      //备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getStartEmperorId() {
        return startEmperorId;
    }

    public void setStartEmperorId(Long startEmperorId) {
        this.startEmperorId = startEmperorId;
    }

    public Long getEndEmperorId() {
        return endEmperorId;
    }

    public void setEndEmperorId(Long endEmperorId) {
        this.endEmperorId = endEmperorId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
