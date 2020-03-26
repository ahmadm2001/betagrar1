package com.example.betagrar;

public class customer {
    private String FullName, NumberCar,TypeCar,Pic,Phone,uid;

    public customer(String name, String s, String email, String Fullname, String phone, String uid){}
    public customer(String s1, String name1, String s, String name) {
        this.FullName=FullName;
        this.NumberCar=NumberCar;
        this.TypeCar=TypeCar;
        this.Phone=Phone;
        this.uid=uid;
    }



    public String getName() {
        return FullName;
    }

    public void setName(String name) {
        this.FullName=FullName;
    }
    public String getPhone() {
        return Phone;
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
        TypeCar = numberCar;
    }
    public String getCarType(){
        return TypeCar;
    }

    public void setTypeCar(String TypeCar) {
        TypeCar = TypeCar;
    }
}
