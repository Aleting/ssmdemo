package com.ssmdemo.bean;

public class Student {
    private Integer stId;

    private String stName;

    private String stSex;

    private String stEmail;

    private Integer teId;

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(Integer stId, String stName, String stSex, String stEmail, Integer teId) {
        this.stId = stId;
        this.stName = stName;
        this.stSex = stSex;
        this.stEmail = stEmail;
        this.teId = teId;
    }

    public Student(){

    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStSex() {
        return stSex;
    }

    public void setStSex(String stSex) {
        this.stSex = stSex == null ? null : stSex.trim();
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail == null ? null : stEmail.trim();
    }

    public Integer getTeId() {
        return teId;
    }

    public void setTeId(Integer teId) {
        this.teId = teId;
    }
}