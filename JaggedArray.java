// Jagged Array which means Each Row's has different number of columns

public class JaggedArray
{
    public static void main(String[] args) 
    {
        // Row number initialize
        int JaggedArray[][] = new int[3][];
        
        // Column number initialize
        JaggedArray[0] = new int[4];
        JaggedArray[1] = new int[3];
        JaggedArray[2] = new int[2];

        // Insert the values in jagged array
        for(int i = 0;i < JaggedArray.length;i++)
        {
            for(int j = 0;j < JaggedArray[i].length;j++)
            {
                JaggedArray[i][j] = (int)(Math.random()*10);
            }
        }

        // Display the values in jagged array 
        for(int arr[] : JaggedArray)
        {
            for(int a : arr)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
