public class Larger{
    /* The equivalent of def in Java is (roughly) public static
     *
     * Functions need declared types as well, 
     * it detemrines what type the function returns
     * Functions can only return one thing
     * Must declar types of the parameters
     */
    public static int larger(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        return y;
    }

    public static void main(String[] args)
    {
        System.out.println(larger(5, 10));
    }
}
