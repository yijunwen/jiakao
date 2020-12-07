package com.wyj.jk.pojo.po;

import java.math.BigDecimal;

public class ExamPlaceCoursePrice {
    private Integer coachId;

    private Integer courseId;

    private BigDecimal price;

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}