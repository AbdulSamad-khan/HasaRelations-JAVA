import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){

        Person obj = new Person();
        Address obj1 = new Address("77 Asif colony Manghphir road,karachi");
        obj.Associate(obj1);
        obj.displayAddress();

        // In this program arrayList is not included..

        List<String> obj2 = new ArrayList(100);
        for(int i = 0;i<200;i++){
            obj2.add("this is one!");
            System.out.println(obj2.get(i) + i);
        }


    }
}
 class Person{

    //Reference variable of Address
    public Address address;

    public void Associate(Address add){
        this.address=add;
    }

    public void displayAddress(){
         this.address.display();
    }
}
 class Address{
     public String Address;
     Address(String Address){
         this.Address = Address;
     }
  public void display(){
      System.out.println(this.Address);
  }
}
