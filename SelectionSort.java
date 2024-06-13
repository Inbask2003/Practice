public class SelectionSort
{
    public static void main(String[] args) 
    {
      int arr[] = {5,2,9,7,3,8};
      int l = arr.length;
      for(int i = 0;i < l-1;i++)
      {
        int min = i;
        for(int j = i+1;j < l;j++)
        {
          if(arr[min] > arr[j])
          {
            min = j;
          }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp; 

      }
      for(int i : arr)
      {
        System.out.println(i);
      }
    }
}