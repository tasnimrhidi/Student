
package Inheritance;


 public class Result extends Student {
     float Mark;
     void GetData(){
         Roll=9798;
         Name="MOnika";
         Mark=90.99f;
         
     }
     void Display(){
         System.out.println("Roll is:"+Roll);
          System.out.println("Name is:"+Name);
           System.out.println("Mark is:"+Mark);
     }
    
}
