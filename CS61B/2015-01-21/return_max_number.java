public class return_max_number
{
    // Method to find and return the max number from input array m
    public static int max(int[] m)
    {
        int max = 0;
        int length = m.length;
        int i;

        for(i=0; i<(length-1); i++)
        {
            if(m[i] > max){
                max = m[i];
            }
        }

        return max;
    }
    // Main
    public static void main(String[] args)
    {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
       System.out.println(max(numbers));
    }
}
