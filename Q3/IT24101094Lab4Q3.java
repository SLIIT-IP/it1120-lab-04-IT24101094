import java.util.Scanner;
public class IT24101094Lab4Q3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.println("Enter a number:");
        int number = Scanner.nextInt();
        String result = (number>0) ?
           "positive" : 
           (number<0)?
                   "Negative":
                                   "Zero";
        System.out.println("The number is: " + number);

    }
}