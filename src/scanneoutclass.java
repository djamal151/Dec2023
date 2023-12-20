import java.util.Scanner;

 public class scanneoutclass {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter your first number : ");
         int number1 = scanner.nextInt();
         System.out.println("enter your sconde number");
         int number2 = scanner.nextInt();

         System.out.println("enter third number");
         int number3 = scanner.nextInt();

         if (number1 > number2 && number1 > number3) {
             System.out.println("number1 larges");
         } else if (number2 > number1 && number2 > number3) {
             System.out.println("number2 is larges ");
         } else {
             System.out.println("number3 is larges");
         }

         System.out.println("Your number is " + number1);
         System.out.println("your sconde number is " + number2);
         System.out.println("your therd number is " + number3);

         if(number1<25 && number2 >15){
             System.out.println(number1+" we are good");
         }else if(number1 >30 && number2<50) {
             System.out.println(number2 + "we are ok");
         }


     }

 }




