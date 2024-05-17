// Interface only have abstract methods. Inteface Variables are static & final implicitly

public class Interface implements Face
{
    public static void main(String[] args) 
    {
        Interface obj = new Interface();
        obj.show();   
        System.out.println(Face.a);
    }

    public void show()
    {
        System.out.println("Hello");
    }
    
}

interface Face
{
    int a = 10;
    public abstract void show();

}
