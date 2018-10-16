package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class perfectGift {

    public static void main(String[] args) {
        ArrayList<giftAdvisor> gifts = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);


        gifts.add(new giftAdvisor("Female", "High", "Jewelry","adult"));
        gifts.add(new giftAdvisor("Female", "High", "Weekend Getaway","teen"));
        gifts.add(new giftAdvisor("Female", "Low", "Selfie Stick","child"));
        gifts.add(new giftAdvisor("Female", "Low", "Wine Bottle","adult"));
        gifts.add(new giftAdvisor("Female", "Medium", "Perfume","teen"));
        gifts.add(new giftAdvisor("Female", "Medium", "Sweater","child"));
        gifts.add(new giftAdvisor("Male", "High", "Smart TV","adult"));
        gifts.add(new giftAdvisor("Male", "High", "Apple Watch","teen"));
        gifts.add(new giftAdvisor("Male", "Low", "Books","child"));
        gifts.add(new giftAdvisor("Male", "Low", "Shoes","adult"));
        gifts.add(new giftAdvisor("Male", "Medium", "Guitar","teen"));
        gifts.add(new giftAdvisor("Male", "Medium", "Playstation","child"));

        System.out.println("Enter the recipient's gender :");
        String gender = keyboard.next();

        System.out.println("Enter the price (high,medium or low) :");
        String price = keyboard.next();

        System.out.println("Enter the age");
        String age = keyboard.next();
        int giftSuggestions = 0;

        for (giftAdvisor perfectOption : gifts) {
            if (perfectOption.getGender().equalsIgnoreCase(gender) && perfectOption.getPrice().
                    equalsIgnoreCase(price) && perfectOption.getAge().equalsIgnoreCase(age)) {
                System.out.println(perfectOption.getGiftType());
                giftSuggestions++;
            }
        }
        if (giftSuggestions == 0){
            System.out.println("Get her/his a certificate");
        }

    }
}
