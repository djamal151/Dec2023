import java.util.Scanner;

public class Person {
    String name ;
    int age;
    public static void main(String[] args) {

         Scanner reader = new Scanner(System.in);

        System.out.println("enter number of person ");
        int numberofPersons = reader.nextInt();
        Person[] list = new Person[numberofPersons];
        for( int index = 0; index < list.length; index ++){
            Person person = new Person();
            System.out.println(" enter name person "+ (index + 1));
            person.name = reader.next();

            System.out.println(" enter age person "+ (index + 1));
            person.age = reader.nextInt();
            list[index] =person;
        }
           for (Person person : list) {

            System.out.println(person.name + " " + person.age);
        }



    }



}
