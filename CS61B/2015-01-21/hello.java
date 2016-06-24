/* Jave files must define a class, must have same name as the file
 */
public class hello {
    public static void main(String[] args){
        System.out.println("Hello world!");

        /* Before using a variable in Java, you must declare is as having some type */
        
        /* Declared types have a nice feature, we can check all the types before a program
             even starts running */
        int x;

        x = 5;
        x = x + 10;

        System.out.println(x);

        String animal = "squirrel";

        System.out.println(animal);
    }

}
