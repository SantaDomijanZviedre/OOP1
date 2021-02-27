package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Officer one = new Officer("Ivo", "Domijan", 1011, "Borongaj", 105);
        Officer two = new Officer("Linda", "Domijan", 1012, "Ravnice", 25);
        Officer three = new Officer("Vigo", "Domijan", 1013, "4thFloor", 3);
        Officer four = new Officer("John", "Smith", 1014, "London", 40);

        System.out.println("There are the following Officers in the database: ");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        Officer[] District99 = new Officer[] {
                one, two, three, four
        };

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for(int i = 0; i < District99.length; i++) {
            if(District99[i].calculatedLevel() == 1)
                counter1++;
            else if(District99[i].calculatedLevel() > 1)
                counter2++;
            if(District99[i].getName().equals("John"))
                counter3++;
        }
        System.out.println(counter1 > 1 ? "There are " + counter1 + " officers with Level 1 in District99." :
                "There is " + counter1 + " officer with Level 1 in District99.");
        System.out.println(counter2 > 1 ? "There are " + counter2 +
                " officers with the level that is larger than 1 in District99." :
                "There is " + counter2 + " officer with the Level that is larger than 1 in District99.");
        System.out.println(counter3 >= 1 ? "There " + (counter3 == 1 ? "is " + counter3 + " officer " :
                "are " + counter3 + " officers ") + "with name 'John' in District99." :
                ("There are no officers with name 'John' in District99."));
   }
}

