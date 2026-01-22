import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String args[]) {                               
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a temperaturein in celsius :");
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("The temperature in fahrenheit is:"+fahrenheit);
        sc.close();

    }
}
// ANOTHER METHOD WITHOUT SCANNER                                  // FORMULA fahrenheight to celsius=(fahrenheit-32)*5/9;
//    double celsius=23.55;
//    double fahrenheit=(celsius*9/5)+32;
//    System.out.println("celsius to fahrenheit is:"+fahrenheit);


