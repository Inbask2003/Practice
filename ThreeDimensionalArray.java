// 3-Dimensional Array

public class ThreeDimensionalArray
{
    public static void main(String[] args) 
    {
        // Declare the 3D array
        int big[][][] = new int[3][3][3];
        
        // Inserting the values in 34D array
        for(int i = 0;i < big.length;i++)
        {
            for(int j = 0;j < big[i].length;j++)
            {
                for(int k = 0;k < big[i][j].length;k++)
                {
                    big[i][j][k] = (int)(Math.random()*10);
                }
            }
        }

        // Display the values in 3D array
        for(int i[][] : big)
        {
            for(int j[]: i)
            {
                for(int k : j)
                {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
