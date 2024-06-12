public class EuclideanAlgorithm 
{
    public static void main(String[] args) 
    {
        int a  = 10,b = 20;
        while(a  > 0 && b > 0)
        {
            if(a > b)
            {
                a = a % b;
            }         
            else
            {
                b = b % a;
            }
        }
        System.out.println(Math.max(a,b));
    }

}