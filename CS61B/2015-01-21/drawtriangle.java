public class drawtriangle
{
    public static void main(String[] args)
    {
        int num_stars = 0;
        int star_index = 0;
        while(num_stars < 4)
        {
            // Draws a 90 degree triangle with base 4
            for(star_index=0; star_index<=num_stars; star_index++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
            num_stars++;
        }
    }
}
