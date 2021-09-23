package updation;


import java.util.HashSet;
import java.util.Set;

public class NewTech {
      public void hashsetdemo(){
            Set<Mobile> brand = new HashSet<Mobile>();
            Mobile data1 = new Mobile ("Samsung",2,12000.5,2450);
            Mobile data2 = new Mobile ("Redmi",4,8000.5,5000);
            Mobile data3 = new Mobile ("Oppo",3,10000.5,4000);

            brand.add(data1);
            brand.add(data2);
            brand.add(data3);
            for (Mobile var : brand){
                  System.out.println("This is details of mobile configuration : "+var.getName());
                  System.out.println(var.getPrice());
                  System.out.println(var.getBattery());
                  System.out.println(var.getRam());
            }
      }
      public static void main(String[] args){
            NewTech obj = new NewTech();
            obj.hashsetdemo();
      }



}
