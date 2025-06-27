package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter age: ");
        int age = scanner.nextInt();
        if(age<=0){
            throw new InvalidAgeException("Your age is not valid");
        }

        if(age>=18){
            System.out.printf("Jestes pelnoletni");
        }
        else {
            System.out.printf("Nie jestes pelnoletni");
        }



    }


}
