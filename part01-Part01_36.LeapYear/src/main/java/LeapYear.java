
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        
        //a year is a leap year if it is divisible by 4
        //however if the year is divisible by 100 then it is divisible by 100, then it is a leap year only when it is also divisible by 400
        
        int year = Integer.valueOf(scan.nextLine());
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("This is a leap year.");
                }else{
                    System.out.println("This is not a leap year.");
                }
            }else{
                System.out.println("This is a leap year.");
            }
        }else{
            System.out.println("This is not a leap year.");
        }
    }
}
