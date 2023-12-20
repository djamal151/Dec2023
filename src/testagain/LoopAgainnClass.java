package testagain;

public class LoopAgainnClass {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        for (int i = 1; i <= 5;i++ ) {
            System.out.println("****");
            System.out.println("value of i is " + (i + 1));
        }
           sum=0;
        int i=1;
        for ( i=1; i<=100; i++){
            sum=sum +i;
            if(sum>2000){
                break;
            }
        }
        System.out.println(i);
        System.out.println(sum);


    }

}
