package com.example.betagrar;

public class customer {
    private String FullName, NumberCar, CarType,Pic,Phone,uid;

    public customer(String Fullname, String phone, String uid){}
    public customer (String FullName, String NumberCar, String CarType, String Phone) {
        this.FullName=FullName;
        this.NumberCar=NumberCar;
        this.CarType=CarType;
        this.Phone=Phone;
        this.uid=uid;
    }
    public String getName() {
        return FullName;
    }

    public void setName(String name) {
        this.FullName=FullName;
    }
    public void setPhone(String phone) {
        this.Phone=phone;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid=uid;
    }
    public String getnumbercar(){
        return NumberCar;
    }

    public void setNumberCar(String numberCar) {
        CarType = numberCar;
    }
    public String getCarType(){
        return CarType;
    }

    public void setCarType(String numberCar) {
        CarType = CarType;
    }
}
