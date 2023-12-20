package Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int num=5;
        int[]nums= new int[5];
        nums[0]=5;
        nums[4]=8;
        nums[1]=9;
        nums[3]=6;
        nums[4]=2;
        nums[2]=1;
        System.out.println(nums[4]);
        String[] countries = {"USA","France","Algeria","England","Belgium","Canada"};
        System.out.println(countries[5].length());
        for(int i =0; i< countries.length;i++){
//            System.out.println(i);
//            System.out.println(countries[i]);
//            System.out.println(countries[i].length());
            if(countries[i].length()>6){
                System.out.println(countries[i]);
            }



        }

    }
}
