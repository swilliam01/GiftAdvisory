package com.company;

public class giftAdvisor {

    private String giftType;
    private String gender;
    private String price;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType;
    }

    public giftAdvisor() {
    }

    public giftAdvisor(String gender, String price, String giftType, String age) {
        this.giftType = giftType;
        this.gender = gender;
        this.price = price;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
