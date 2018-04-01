package ro.sda;
import java.util.Scanner;
public class lunaan {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("type year; ");// definesc fiecare numar cu int
        int year = scanner.nextInt();

        System.out.print("type mounth; ");
        int mounth = scanner.nextInt();// parantezele trebuie inchise dupa enumeratie
        if ((mounth == 1) || (mounth == 3) || (mounth == 5) || (mounth == 7) || (mounth == 8) || (mounth == 10) || (mounth == 12)) {//deschid acolada dupa enumeratie
            System.out.print(31);
        }
        if ((mounth == 4) || (mounth == 6) || (mounth == 9) || (mounth == 11)) {
            System.out.print(30);
        }
        if (mounth == 2) {
            //System.out.print(28);}//  mai jos formula de pe wikipedia pt an bisect
            if (year % 4 != 0) {
                System.out.println("has 28 days");
            } else if (year % 100 != 0) {
                System.out.println("has 29 days");

            } else if (year % 400 != 0) {
                System.out.println("has 28 days");

            } else {
                System.out.println("has 29 days");
            }
            /// cum inlocuiesti cu switch

            switch(mounth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: System.out.println(31);

                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
               case 2:
                   // System.out.println(28);
                    //break;
                //if (mounth == 2) {
                    //System.out.print(28);}//  mai jos formula de pe wikipedia pt an bisect
                    if (year % 4 != 0) {
                        System.out.println("has 28 days");
                    } else if (year % 100 != 0) {
                        System.out.println("has 29 days");

                    } else if (year % 400 != 0) {
                        System.out.println("has 28 days");

                    } else {
                        System.out.println("has 29 days");
                    }
                    break;
                    default:
                }
                // daca numarul citit la tastatura este par sau impar






            }

    }
}