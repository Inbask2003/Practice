// Find the target value or greatest value among the smaller value of target

public class FloorNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,9,14,16,18,21};
        int key = 15;
        int value = floorNumber(arr,key);
        System.out.println("Ceil Number : "+value);
        
    }

    public static int floorNumber(int arr[],int key)
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
       
        return arr[j];
    }
    
}
