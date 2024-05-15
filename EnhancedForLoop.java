// Enhanced For loop for a 2-dimensional array

public class EnhancedForLoop 
{
    public static void main(String[] args) 
    {
        
        int matrix[][] = {{1,2,3,4,5},{6,7,8,9,10}};
        for(int num[] : matrix)
        {
            for(int n : num)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
