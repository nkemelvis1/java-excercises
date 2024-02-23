package com.nkemelvis;

public class Main {
    public static void main (String [] args){
        //looping arrays

        System.out.println(" for i loop");
        //used to have access to the indexes
        String [] names = {"Nkem","Elvis","Atem","Joe"};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
    }
        System.out.println("Enhanced for loop");
        //With the enhanced for loop,we can't have access to the indexes,no control over it
        for (String name : names ){
            System.out.println(name);
        }
    }
}


/*
public class Main{
    public static void main (String[] args){
       String string1 = new String("I am fine");
        String string2 = new String("I am not fine");
        String result;

        if(string1.equals(string2)){
            result = "They are equal";
        }else {
           result = "They are two opposite statements";
        }
        System.out.println(result);

    }
}


public class Main {
    public static void main (String [] args){
        int x = 10;
        int y = 12;


        if (x == y)
            System.out.println("They are equal");
        else if (x < y)
            System.out.println( y + " is greater than " + x);


    }
}





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Scanner Class
        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello" + input );

        System.out.println("What is Your age ? ");
        int age = scanner.nextInt();
        if (age < 16 ) {
            System.out.println("You are a child ");
        } else {
            System.out.println("You are an adult ");
        }

    }
*/