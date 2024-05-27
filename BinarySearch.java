public class BinarySearch
{
    public static void main(String[] args) 
    {
        int arr[] = {12,23,34,45,56,67,78};
        int key = 34;
        int index = binarySearch(arr,key);
        System.out.println(index);
    }

    public static int binarySearch(int arr[],int key)
    {
        int j = arr.length-1;
        int i = 0;
        while(i <= j)
        {
            int mid = (i+j)/2;
            
            if(arr[mid] == key)
            {
                return mid;
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
        return -1;
    }
}