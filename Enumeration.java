public class Enumeration 
{
    public static void main(String[] args) 
    {
        Out ou = Out.bad;
        System.out.println(ou.num);
        for(Out out : Out.values())
        {
            System.out.println(out+" "+out.age);
        }
        
    }   
}

enum Out
{
   good(19),
   bad(20),
   ugly(21);

   public int age;

   public int num = 10;
   
   private Out(int age)
   {
    this.age = age;
   }
}
