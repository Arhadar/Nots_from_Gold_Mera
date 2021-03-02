import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // библиотека MATH, метод abs
        Scanner sc = new Scanner(System.in);
        int a;
        double c;
        for(;;){
            System.out.println("Введите число:");
            a = sc.nextInt();
           // c=a/(1+(2^(1/2)));
              c=a/(1+sqrt(2));



            System.out.println("число исходное = " + a );
            System.out.println("ближайшая отметка = " + c);
        }

    }
}
