package com.example.betagrar;

public class customer {
    private String name, Phone, TypeCar,numbercar, uid,Pic;
    private boolean isCustomer;
    public customer(){}
    public customer(String Name, String Phone, String Numbercar, String typeCar, String uid ,Boolean isCustomer){
        this.name=Name;
        this.TypeCar=typeCar;
        this.numbercar=Numbercar;
        this.Phone=Phone;
        //this.Pic=Pic;
        this.uid=uid;
        this.isCustomer=isCustomer;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumbercar() {
        return numbercar;
    }

    public void setNumbercar(String numbercar) {
        this.numbercar = numbercar;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public String getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(String typeCar) {
        TypeCar = typeCar;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean getisCustomer() {
        return isCustomer;
    }
    public void setCustomer(){
        this.isCustomer=isCustomer;
    }
}