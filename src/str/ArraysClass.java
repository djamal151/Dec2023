package str;

public class ArraysClass {
    public static void main(String[] args) {
        int num1 = 8;
        System.out.println(num1);
        int[] numbers = new int[6];
        numbers[0] = 9;
        numbers[1] = 99;
        numbers[4] = 60;
        numbers[2] = 54;
        numbers[3] = 6;

//        int sum = 0;
//        System.out.println(numbers[4]);
//        for (int i = 0; i < numbers.length; i++) {
//            //  System.out.println(numbers[i]);
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);
          //addSum(numbers);
//    }
//        public static void addSum(int[] nums){
//            int  sum =0;
//            for(int i=0;i <nums.length;i++){
//                sum = sum+nums[i];
//        }
//            System.out.println("sum is "+ sum);

            int max=numbers[0];
            for( int i =0; i< numbers.length;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
        System.out.println(max);
    }
}
