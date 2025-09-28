import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

class Student
{
    int id;
    int marks;
    public Student(int id,int marks)
    {
        this.id = id;
        this.marks = marks;
    }
}

class Demo
{
    public static void main(String args[])
    {
        
        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,4,4,4);
        
        List<String> stringList = Arrays.asList("Hello", "World", "Java", "Programming", "Language");
        
        List<Student> studentList = new ArrayList();
        studentList.add(new Student(1,34));
        studentList.add(new Student(2,66));
        studentList.add(new Student(3,26));
        studentList.add(new Student(4,36));
        studentList.add(new Student(5,12));
        studentList.add(new Student(6,89));
        studentList.add(new Student(7,93));


        String s = stringList.stream().reduce("",(a,b)-> a+" "+b).trim();
        

        String y = stringList.stream().collect(Collectors.joining(" "));
        System.out.println(s);
        System.out.println(stringList.stream().collect(Collectors.joining("@")));
        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(a -> a,Collectors.counting()));

        for(Integer i: map.keySet())
        {
            if(map.get(i)>1) System.out.println(i+" "+map.get(i));
        }
        System.out.println("............................................................................");

        String inp = "Hello";

        Map<String,Long> m = Arrays.asList(inp.split("")).stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        for(int i=0;i<inp.length();i++)
        {
            String c = inp.charAt(i)+"";
            if(m.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}


// Concatenate all the strings from the list into a single string using streams
// Find the first non repeated character in string using streams
// Streams & Streams methods