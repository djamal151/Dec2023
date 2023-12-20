import org.w3c.dom.ls.LSOutput;

public class methodClass {
    public static void main(String[] args) {
      int num1 = 7;
       int num2 = 8;
       int num3 =2;
       int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("****");
        addTwoNumbers();
        addTwonumbersWithParam(8,2, 5);
        addTwonumbersWithParam(10,2,11);
          isFirstOneLarger(5,3);
    }
    public static void addTwoNumbers() {
        int num1 = 9;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println(sum);
    }
          public static void addTwonumbersWithParam(int num1, int num2, int num3){
            int sum = num1 * num2 * num3;
            System.out.println(sum);
          }
          public static  boolean  isFirstOneLarger(int num1,int num2){
            if(num1>num2)
                return true;

            else
                return false;

        }


   }








