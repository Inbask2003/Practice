// In Anonymous Inner Class we can create object for abstract class also

public class AnonymousInnerClass
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo()
        {
            public void show()
            {
                System.out.println("This Show Is Practice");
            }

        };
        obj.show();
    }
    
}

abstract class Demo
{
    public abstract void show();
}
