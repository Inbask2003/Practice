public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        Child child = new Child();
        child.ride();
    }
}

class Parent
{
    public void ride()
    {
        System.out.println("Parent Ride");
    }
}

class Child extends Parent
{
    public void ride()
    {
        System.out.println("Child Ride");
    }
}
