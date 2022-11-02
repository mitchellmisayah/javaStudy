
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        
        

        if(num < 0){
            int absolutevalue = num * -1;
            System.out.println(absolutevalue);
        }else if(num >0){
            System.out.println(num);
        }
    }
}
