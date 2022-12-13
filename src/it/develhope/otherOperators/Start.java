package it.develhope.otherOperators;

public class Start {

    public static void main(String[] args) {

        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b ++;

        System.out.println("The number is: " + b);
        System.out.print("Is the number odd ? ");

        if (b%2 == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        int mul = b*(b+1);
        System.out.println("The result of b multiplied for b + 1 is: " + mul);
        System.out.print("Is " + mul + " a multiple of 3 ? ");

        if(mul%3==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
