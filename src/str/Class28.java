package str;

public class Class28 {
    public static void main(String[] args) {
//        String city = "New York";
//        String anything = "dhaka";
        /*
        System.out.println( city . length());
        System.out.println( city.contains("York"));
        String city2 ="New York";
        System.out.println(city. equals(city2));
        System.out.println(city.charAt(5));
         String name = "bouzidi ";
        System.out.println(name.charAt(3));

        String name2 = name.replace("o","z");
        System.out.println(name2);
            */
//           for(int i =0; i<anything.length();i++){
//               System.out.println(anything.charAt(i));
//           }
        String country = "bangladeshlaaa";
        System.out.println(country.contains("l"));
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'l') {
                System.out.println("l is present ");
            }
        }
        System.out.println("is present");
        System.out.println(country.indexOf('a'));
        int count=0;
        for(int i=0;i< country.length(); i++){
            if(country.charAt(i)== 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
