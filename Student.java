package student;
public class Student { 
    private int Roll;
    private String Name;
    private void GetData(){
        Roll=9798;
        Name= "Monika";              
    }
    void Display(){
        GetData();
        System.out.println("Roll is:"+ Roll);
        System.out.println("Name is:"+ Name);     
    }
     public static void main(String[] args) {
        Student s= new Student();
        s.Display();
        
    }

   
   
    
}
