package com.example.betagrar;

public class Manager {
    private String Fullname, email, Pic, Phone, numberDrivinig, maxWeight;
    public Manager(String name, String email, String phone, String numberDrivinig, String maxWeight) {}
    public Manager(String Fullname, String phone, String email, String numberDrivinig, String maxWeight,String pic) {
        this.Fullname=Fullname;
        this.email=email;
        this.Pic=pic;
        this.Phone=phone;
        this.numberDrivinig=numberDrivinig;
        this.maxWeight=maxWeight;

    }

    public Manager(String name, String phone, String numberDrivinigLicense, String maxWm) {
    }


    public String getName(){
                return Fullname;
            }
            public void setName(String name) {
                this.Fullname = Fullname;
            }

            public String getPhone(){
                 return Phone;
            }
            public void setPhone(String phone) {
                this.Phone = phone;
            }

            public String getemail(){
                return email;
            }
            public void setemail(String email) {
                this.email = email;
            }

            public String getnumberDrivinig(){
                return numberDrivinig;
            }
            public void setnumberDrivinig(String numberDrivinig) {
                this.numberDrivinig = numberDrivinig;
            }

            public String getmaxWeight(){
                return maxWeight;
            }
            public void setmaxWeight(String maxWeight) {
                this.maxWeight = maxWeight;
            }

            public String getpic(){
                return Pic;
            }
            public void setpic(String pic) {
                this.Pic = pic;
            }






}

