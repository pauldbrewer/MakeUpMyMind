package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int doorsAtt;
        int priceAtt;
        int colorAtt;
        int mpgAtt;
        int brandAtt;

        int doors;
        int price;
        int color;
        int mpg;
        int brand;

        Scanner input = new Scanner(System.in);
        System.out.println("Doors importance from 1 to 5 ( 5 being highest ): ");
        doorsAtt = Integer.parseInt(input.next());
        System.out.println("Price importance from 1 to 5 ( 5 being highest ): ");
        priceAtt = Integer.parseInt(input.next());
        System.out.println("Color importance from 1 to 5 ( 5 being highest ): ");
        colorAtt = Integer.parseInt(input.next());
        System.out.println("MPG importance from 1 to 5 ( 5 being highest ): ");
        mpgAtt = Integer.parseInt(input.next());
        System.out.println("Brand importance from 1 to 5 ( 5 being highest ): ");
        brandAtt = Integer.parseInt(input.next());

        System.out.println("Doors Rating from 1 to 10 ( 10 being highest ): ");
        doors = Integer.parseInt(input.next());
        System.out.println("Price Rating from 1 to 10 ( 10 being highest ): ");
        price = Integer.parseInt(input.next());
        System.out.println("Color Rating from 1 to 10 ( 10 being highest ): ");
        color = Integer.parseInt(input.next());
        System.out.println("MPG Rating from 1 to 10 ( 10 being highest ): ");
        mpg = Integer.parseInt(input.next());
        System.out.println("Brand Rating from 1 to 10 ( 10 being highest ): ");
        brand = Integer.parseInt(input.next());

        int doorsTot = doorsAtt + doors;
        int priceTot = priceAtt + price;
        int colorTot = colorAtt + color;
        int mpgTot = mpgAtt + mpg;
        int brandTot = brandAtt + brand;

        int thisCarTotal = doorsTot + priceTot + colorTot + mpgTot + brandTot;
        double thisCarRating = (thisCarTotal / 65.0) * 100;

        System.out.println("Your Total score for this car is: " + thisCarRating);

	// write your code here
    }
}
