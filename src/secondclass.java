public class secondclass {


    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 60;
        int num3 = 320;
        //      int num4 = num3+num1+2;

        int grade = 60;
        if (grade > 90 && grade <= 100) {
            System.out.println("grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("grade is B");
        } else if (grade>=70 && grade<=79) {
            System.out.println("grade is C");
        } else if (grade >= 60 && grade <= 96) {
            System.out.println("grade is D");

        } else {
            System.out.println("grade is ");
        }

    }
}