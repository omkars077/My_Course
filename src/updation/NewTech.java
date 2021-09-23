package updation;


import java.util.HashSet;
import java.util.Set;

public class NewTech {

      public void demo(){
            Set<String> sub = new HashSet<String>();
            sub.add("Economics");
            sub.add("Commerce");
            sub.add("Science");
            sub.add("Computer");
            sub.add("Medical");
            sub.add("Engineer");

            for (String var : sub){
                  System.out.println("This is details of courses : "+var);
            }
            Set <Integer> period= new HashSet();
            period.add(2);
            period.add(3);
            period.add(4);
            period.add(5);
            for (Integer var1 : period){
                  System.out.println("This is period of Courses : "+var1);

            }


      }
      public static void main(String[] args){
            NewTech obj = new NewTech();
            obj.demo();
      }
}
