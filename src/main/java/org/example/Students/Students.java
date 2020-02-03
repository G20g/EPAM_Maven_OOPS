package org.example.Students;

import org.example.Gifts.Gift;
import org.example.SweetsTypes.Chocolate;

import java.util.ArrayList;

public class Students {
    String sname;
    Gift gift;
    ArrayList<Chocolate> chocolates = new ArrayList<>();
    public Students(String sname, Gift gift) {
        this.sname = sname;
        this.gift = gift;
    }
    public void printGifts() {
        System.out.println(this.sname + " have ");
        System.out.println(gift.sweets + " in the gift having weight " + gift.giftWeight() + "g");
    }

}
