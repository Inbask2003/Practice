// Inner Class

public class InnerClass 
{
    public static void main(String[] args) 
    {
       Outer out = new Outer(); 
       Outer.Inner in = out.new Inner();
       in.inner();
       out.outer();
    }  
}

class Outer
{
    class Inner
    {
        public void inner()
        {
            System.out.println("Inner Class");
        }
    }

    public void outer()
    {
        System.out.println("Outer Class");
    }
}




