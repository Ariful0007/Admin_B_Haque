package com.meass.admin_b_haque;

public class Income2 {
    String username,type,email,payment,date,time,trixid,fee;


    public Income2() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrixid() {
        return trixid;
    }

    public void setTrixid(String trixid) {
        this.trixid = trixid;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Income2(String username, String type,
                   String email, String payment, String date, String time, String trixid, String fee) {
        this.username = username;
        this.type = type;
        this.email = email;
        this.payment = payment;
        this.date = date;
        this.time = time;
        this.trixid = trixid;
        this.fee = fee;
    }
}
