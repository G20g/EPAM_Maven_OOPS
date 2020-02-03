package org.example;


import org.example.Gifts.Gift;
import org.example.Students.Students;
import org.example.Sweets.Sweets;
import org.example.SweetsTypes.Candies;
import org.example.SweetsTypes.Chocolate;

import javax.management.remote.SubjectDelegationPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Sweets KitKat = new Chocolate("KitKat",100,50);
        Sweets DairyMilk = new Chocolate("DairyMilk",80,100);
        Sweets Munch = new Chocolate("Munch",50,20);
        Sweets Melody = new Candies("Melody",10,5);
        Sweets Richart = new Candies("Richart",20,50);
        Sweets CoffieBite = new Candies("Coffee Bite",10,10);
        ArrayList<Sweets> sgift1 = new ArrayList<>();
        sgift1.add(Munch);
        sgift1.add(Richart);
        sgift1.add(Melody);
        sgift1.add(Melody);
        ArrayList<Sweets> sgift2 = new ArrayList<>();
        sgift2.add(CoffieBite);
        sgift2.add(DairyMilk);
        sgift2.add(Richart);
        sgift2.add(Munch);
        sgift2.add(CoffieBite);
        ArrayList<Sweets> sgift3 = new ArrayList<>();
        sgift3.add(Munch);
        sgift3.add(Richart);
        sgift3.add(KitKat);
        sgift3.add(KitKat);
        ArrayList<Sweets> sgift4 = new ArrayList<>();
        sgift4.add(DairyMilk);
        sgift4.add(DairyMilk);
        sgift4.add(Melody);
        sgift4.add(Melody);
        sgift4.add(KitKat);
        ArrayList<Sweets> sgift5 = new ArrayList<>();
        sgift5.add(KitKat);
        sgift5.add(Richart);
        sgift5.add(KitKat);
        sgift5.add(KitKat);
        /*Gift gift[] = new Gift[5];*/
        Gift gift1 = new Gift(sgift1);
        Gift gift2 = new Gift(sgift2);
        Gift gift3 = new Gift(sgift3);
        Gift gift4 = new Gift(sgift4);
        Gift gift5 = new Gift(sgift5);
        /*Students students[] = new Students[5];
        for(int i=0;i<students.length;i++) {

        }*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student1 Name:");
        Students s1 = new Students(s.nextLine(),gift1);
        System.out.println("Enter Student2 Name:");
        Students s2 = new Students(s.nextLine(),gift2);
        System.out.println("Enter Student3 Name:");
        Students s3 = new Students(s.nextLine(),gift3);
        System.out.println("Enter Student4 Name:");
        Students s4 = new Students(s.nextLine(),gift4);
        System.out.println("Enter Student5 Name:");
        Students s5 = new Students(s.nextLine(),gift5);

        s1.printGifts();
        s2.printGifts();
        s3.printGifts();
        s4.printGifts();
        s5.printGifts();

    }
}
