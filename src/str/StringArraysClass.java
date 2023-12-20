package str;

public class StringArraysClass {
    public static void main(String[] args) {
        String[] countris = new String[5];
        String[] names ={"Hossain","shirin","bouzidi","mohamed","tipu"};
        String name= "shirin";

        for(int i =0; i<names.length;i++){
            //System.out.println(names[i]);
            if(names[i].equals(name)){
                System.out.println("yes present");
            }
        }

    }
}
