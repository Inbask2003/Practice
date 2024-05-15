// Main methods are overloaded but default main(String args[]) will be run first

public class MethodOverloading
{
    public static void main(String args[])
    {
       System.out.println("String Main");
       main(5);    
    }

    public static void main(int args)
    {
      System.out.println(args);
    }
}
