import java.util.Scanner;

     public class djamal1 {
         int number1;
         int number2;
         int number3;
//    answer number 01
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("enter number1");
//        int number1 = reader.nextInt();
//        System.out.println("enter number2");
//        int number2 = reader.nextInt();
//        if (number1 >= number2) {
//            System.out.println(" number1 is maximum ");
//        } else {
//            System.out.println("number2 is maximum ");
//        }
//           //anser number 2
//
//        System.out.println("enter number3");
//        int number3 = reader.nextInt();
//        if (number1 >= number2 && number1 >= number3) {
//            System.out.println(" number1 maximum");
//        } else if (number2 > number1 && number2 >= number3) {
//            System.out.println("number2 maximum");
//        } else {
//            System.out.println("number3 maximum");
//        }


///////////////////////////////////////////////////////////////
//         answer number 3

         //        public static void main(String[] args) {
//            Scanner reader= new Scanner(System.in);
//            System.out.println("entre number ");
//            int number= reader.nextInt();
//            if(number<0){
//                System.out.println("wather a number negative ");
//            } else if(number>0){
//                System.out.println("wather a number positive");
//            }else{
//                System.out.println("wather a zero");
//            }
//}
/////////////////////////////////////////////////////////////////////////////////////////////////
//            // answer number 4
//
//        public static void main(String[] args) {
//
//               Scanner reader= new Scanner(System.in);
//                 System.out.println("enter number");
//                 int number= reader.nextInt();
//               if (number % 5 == 0 && number % 11 == 0) {
//                   System.out.println("number is  divisible bay 5 and 11");
//               } else {
//                   System.out.println("number is not divisible bay 5 and 11");
//               }
//           }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                //answer number 5
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Ener your number ");
//             int number1 = scanner.nextInt();
//             if (number1 % 2 == 0) {
//                 System.out.println(number1 + " is even number");
//             } else {
//                 System.out.println(number1 + " is an odd number");
//             }
//         }
         //9. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
          public static void main(String[] args) {

             double salary = 7000;
             int years = 6;
             double bonus = 0;

             if (years > 5) {
                 bonus = salary * 0.05;
             }
             System.out.println(bonus);

           ///11. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
             int totaleClass = 65;
             int totalAtt = 55;

             double percentage = (double) (totalAtt * .75);
             if (totalAtt > percentage) {
                 System.out.println(" He can attend " + percentage);

             } else {
                 System.out.println(" he cant " + percentage);
             }

         }
     }
