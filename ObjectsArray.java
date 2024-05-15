// Using Objects in an array

public class ObjectsArray 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.num = 19;
        s1.name = "Santhosh";

        s2.num = 39;
        s2.name = "Vignesh";

        s3.num = 16;
        s3.name = "Madhavan";

        Student arr[] = new Student[3];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for(Student i : arr)
        {
            System.out.println("Name : "+i.name+" "+"No : "+i.num);
        }
    }
}

class Student
{
    int num;
    String name;
}
