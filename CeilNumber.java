// Find the target value or smallest value among the greater value of target

public class CeilNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,9,14,16,18,21};
        int key = 20;
        int value = ceilNumber(arr,key);
        System.out.println("Ceil Number : "+value);
    }

    public static int ceilNumber(int arr[],int key)
    {
        int j = arr.length-1;

        if(arr[0] > key || arr[j] < key)
        {
            return -1;
        }

        int i = 0;
        while(i <= j)
        {
            int mid = i+(j-i)/2;

            if(arr[mid] == key)
            {
                return arr[mid];
            }

            else if(arr[mid] < key)
            {
                i = mid + 1;
            }

            else
            {
                j = mid - 1;
            }
        }
       
        return arr[i];
    }
    
}
