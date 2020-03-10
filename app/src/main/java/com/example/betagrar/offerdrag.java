package com.example.betagrar;

public class offerdrag {
    private String DraggingLocation, ArrivalTime, price;


    public offerdrag (){}
    public offerdrag ( String DraggingLocation, String ArrivalTime, String price) {
        this.DraggingLocation=DraggingLocation;
        this.ArrivalTime=ArrivalTime;
        this.price=price;
    }
    public String getDraggingLocation() {
        return DraggingLocation;
    }
    public void setDraggingLocation(String DraggingLocation) {
        this.DraggingLocation=DraggingLocation;
    }
    public String getArrivalTime() {
        return ArrivalTime;
    }
    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime=ArrivalTime;
    }
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price=price;
    }
}