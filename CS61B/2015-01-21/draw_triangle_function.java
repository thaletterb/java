public class draw_triangle_function
{
    public static void draw_triangle(int height)
    {
        int num_stars = 0;
        int star_index = 0;
        while(num_stars < height)
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
    public static void main(String[] args)
    {
        draw_triangle(5);
    }
}
