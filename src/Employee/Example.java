package Employee;
import java.util.ArrayList;
import java.util.List;
public class Example {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Jon", 22, 1001)); 
      studentlist.add(new Student("Steve", 19, 1003)); 
      studentlist.add(new Student("Kevin", 23, 1005)); 
      studentlist.add(new Student("Ron", 20, 1010)); 
      studentlist.add(new Student("Lucy", 18, 1111));
      System.out.println("Before Sorting the student data:"); 
      //java 8 forEach for printing the list 
      studentlist.forEach((s)->System.out.println(s));
      System.out.println("After Sorting the student data by Age:"); 
      //Lambda expression for sorting by age 
      studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge());
      //java 8 forEach for printing the list
     // System.out.println(studentlist);
      studentlist.forEach((s)->System.out.println(s));        
      System.out.println("After Sorting the student data by Name:"); 
      //Lambda expression for sorting the list by student name       
      studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
      studentlist.forEach((s)->System.out.println(s));        
      System.out.println("After Sorting the student data by Id:");        
      //Lambda expression for sorting the list by student id 
      studentlist.sort((Student s1, Student s2)->s1.getId()-s2.getId()); 
      studentlist.forEach((s)->System.out.println(s)); 
      System.out.println("----Descnding Order By Name------");
      studentlist.sort((Student s1, Student s2)->s2.getName().compareTo(s1.getName()));
     studentlist.forEach(System.out::println);
     System.out.println("----Descnding Order By Id-----");
     studentlist.sort((Student s1,Student s2)->s2.getId()-s1.getId());
     studentlist.forEach(System.out::println);
     System.out.println("----Descending Order By Age-----");
     studentlist.sort((Student s1, Student s2)->s2.getAge()-s1.getAge());
     studentlist.forEach(System.out::println);
   }
}