package org.example.Gifts;

import org.example.Sweets.Sweets;
import org.example.SweetsTypes.Candies;
import org.example.SweetsTypes.Chocolate;

import java.util.ArrayList;

public class Gift {
    public ArrayList<Sweets> sweets = new ArrayList<>();
   /* ArrayList<Chocolate> chocolates = new ArrayList<>();
    ArrayList<Candies> candies = new ArrayList<>();*/
    double giftweight;

    public Gift(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }
    public double giftWeight() {
        for (Sweets sweets1 : sweets) {
            giftweight = giftweight + sweets1.weight;
        }
        return giftweight;
    }


}
