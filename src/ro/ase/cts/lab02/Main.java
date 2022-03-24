package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.IdentifierValueException;
import ro.ase.cts.lab02.exceptions.InvalidPriceValue;
import ro.ase.cts.lab02.exceptions.StringMinLen;

import java.util.ArrayList;

//magazin online
public class Main {

    public static void main(String[] args) {
        // write your code here

        try{
            Product p1 = new Product(1, "Laptop", 3000,"lalalalal");
            Product p2 = new Product(2, "Telefon", -2500,"lalala");
            Product p3 = new Product(3, "TV", 2700,"lala");


            p1.applyPercentageDiscount(10);
            p3.increasePriceAmount(2000);

            System.out.println(p1);
            System.out.println(p3);

            if(p1.getName().length() < 5) {
                throw new StringMinLen();
            }

            if(p2.getPrice() < 0) {
                throw new InvalidPriceValue();
            }

            if(p1.getId() < 0) {
                throw new IdentifierValueException();
            }


        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}







