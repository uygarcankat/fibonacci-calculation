import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int number= input.nextInt();
        int previous =-1;
        int next = 1;
        int new_1, new_2 =0;
        int i=0;

        do {
            new_1 = previous + next;
            previous = next;
            next = new_1 ;
            i++;

            System.out.println(new_1);

        }
            while(i<=number);
    }
}
