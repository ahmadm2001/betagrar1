package com.example.betagrar;

public class order {
    public String orderLocaion, time, date;
    public customer customer;
    public offerdrag offerdrag;

    public order() {
    }

    public order(String orderLocaion, String date, customer customer, offerdrag offerdrag) {

        this.orderLocaion = orderLocaion;
        this.date = date;
        this.customer = customer;
        this.offerdrag = offerdrag;
    }

    public String getorderLocaion() {
        return orderLocaion;
    }

    public void setorderLocaion(String orderLocaion) {
        this.orderLocaion = orderLocaion;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String orderLocaion) {
        this.date = date;
    }




}
