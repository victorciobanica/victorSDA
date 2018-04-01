package ro.sda;
import java.util.Scanner;

public class exer {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("type your number");
        int par = scanner.nextInt();

        switch ( par % 2 ){
            case 0:
                System.out.println("numar" + " " + par + " " +"este par");
                break;
            case 1:
                System.out.println("numar" + " " + par + " " + "numar Impar");

        }










    }


}
