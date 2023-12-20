package testagain;

public class StartVaribles {
    int num= 10;

    public static void main(String[] args) {
        int num1= 90;
        int num2 = num1 +10;
        int num3= num1 +num2;
        System.out.println(num3);
        num3 = num3+10;
        System.out.println(num3);

        double dNum1 =23.6;
        double dNum2 =63.7;
        double dnum3 =630.85;

        char ahr1 ='$';

        String name = "ABCD";

        if((dNum1 + dNum2) >dnum3){
            System.out.println(" yes  is bigger" );
        }else {
            System.out.println(" no  is not bigger");
        }
          int minth =1;
        switch (minth){
            case 1 : {
                System.out.println("month is january");
                break;
            }
            case 2:{
                System.out.println("month is february");
                break;
            }
            default:{
                System.out.println("no idea");
            }
        }


    }
}
