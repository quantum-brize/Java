import java.util.Scanner;
import java.util.*;


class Random{
    private int num;

    public Random(int num){
        this.num = num;
    }
    public int takeUserInput(){
        return num;
    }
}

public class randomNum { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Random Number ");
        int result = sc.nextInt();

        Random rm = new Random(result);
        //generate the random number
        int min = 50;
        int max = 100;

        //Generate random int value from 50 to 100 
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int==rm.takeUserInput());
        System.out.println("the real number is "+random_int);

    }
}