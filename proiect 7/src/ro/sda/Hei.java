package ro.sda;
import java.util.Scanner;


    public class Hei {

        public void main(String[] args) {
            String[] monthNames = {
                    "January",
                    "February",
                    "March",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December",
            };
            System.out.println("Imput your mounth number: ");
            Scanner scanner = new Scanner(System.in);
            int monthNumber = scanner.nextInt();
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("the month number is invalid.");
            } else {

                    String monthName = monthNames[monthNumber - 1];
                    System.out.println("The month name is: " + monthName);
                }
            }






}
