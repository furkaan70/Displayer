package com.example.furkan.displayer;

public class Students {
    private String btAddress;
    private String stuName;
    private String time;
    private String stuSurname;
    //private String stuNo;


    public Students() {
    }

    public Students(String btAddress, String stuName, String stuNo, String stuSurname,String time) {
        this.btAddress = btAddress;
        this.stuName = stuName;
        this.time = time;
        this.stuSurname = stuSurname;
        //this.stuNo = stuNo;

    }

    public String getBtAddress() {
        return btAddress;
    }

    public void setBtAddress(String btAddress) {
        this.btAddress = btAddress;
    }

    public String getStuName() {
        return stuName;
    }

   /* public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
*/
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStuSurname() {
        return stuSurname;
    }

    public void setStuSurname(String stuSurname) {
        this.stuSurname = stuSurname;
    }


}
