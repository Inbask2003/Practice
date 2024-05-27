public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {23,65,98,43,18,74};
        int key = 43;
        int index = linearSearch(arr, key);
        System.out.println(index);
    }

    public static int linearSearch(int arr[],int key)
    {
        int l = arr.length;
        for(int i = 0;i < l;i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    
}
