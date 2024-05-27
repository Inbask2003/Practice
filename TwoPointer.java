// Two Pointer technique for find the n-number maximum sum

public class TwoPointer
{
    public static void main(String[] args) 
    {
        int arr[] = {12,35,71,81,114,113};
        int k = 3;
        int l = arr.length;
        int max = 0;
        for(int i = 0;i+k <= l;i++)
        {
            int sum = 0;
            for(int j = i;j< i+k;j++)
            {
                sum = sum + arr[j];
                if(sum > max)
                {
                    max = sum;
                }
            }

        }
        System.out.println(max);
    }
    
}
