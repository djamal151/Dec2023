package testagain;

public class testClass {
    public static void main(String[] args) {
        double lenght= 9.2;
        double widht =8.9;

      findRectangLeArea(lenght,widht);
      double area =printAreaOfCircle(3.14);
      boolean isTrue = isASquare(lenght,widht);
        System.out.println(" is trun");
    }
    public static void findRectangLeArea(double lenght, double width){
        double area = lenght * width;
        System.out.println("Area is "+area);
    }
    public static double printAreaOfCircle( double radius){
        double area =3.14* radius*radius;
        System.out.println("Circle  area is "+area);
        return area;
    }
         public static boolean isASquare(double lenght, double widht){
        //return lenght == widht;
         if(lenght==widht) {
             return true;
         }
        else {
            return false;}

         }










}
