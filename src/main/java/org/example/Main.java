package org.example;

import org.example.chocolates.Chocolate;
import org.example.chocolates.Chocolate1;
import org.example.chocolates.Chocolate2;
import org.example.chocolates.Chocolate3;
import org.example.gift.Gift;
import org.example.otherSweets.Sweets;
import org.example.otherSweets.Sweets1;
import org.example.otherSweets.Sweets2;
import org.example.otherSweets.Sweets3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);

        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Chocolate1("Chocolate1",40,20);
        Chocolate chocolate2=new Chocolate2("Chocolate2",60,20);
        Chocolate chocolate3=new Chocolate3("Chocolate3",160,50);

        System.out.println("Getting Sweets....");
        Sweets sweets1=new Sweets1("Sweets1",100,200);
        Sweets sweets2=new Sweets2("Sweets2",200,100);
        Sweets sweets3=new Sweets3("Sweets3",140,200);

        System.out.println("Giving child,gift consisting chocolates and sweets....");
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3);

        System.out.println("Sorting items in gift according to price");
        gift.sort();

        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());

        System.out.println("Enter '1' to get all chocolates : ");
        System.out.println("Enter '2' to get all sweets : ");
        System.out.println("Enter '3' to get most expensive chocolate and sweets : ");
        choice=io.nextInt();

        if(choice == 1){
            ArrayList<Chocolate> arrayList=gift.getChocolates();
            for (Chocolate c:arrayList) {
                System.out.println(c.toString());
            }
        }
        else if(choice == 2){
            ArrayList<Sweets> arrayList=gift.getSweets();
            for (Sweets s:arrayList){
                System.out.println(s.toString());
            }
        }
        else if(choice == 3){
            System.out.println("Most Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
            System.out.println("Most Expensive Sweet : "+mostExpensive(gift.getSweets()));
        }
    }

    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}
