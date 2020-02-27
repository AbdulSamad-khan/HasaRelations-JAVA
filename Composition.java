//composite relationsip
public class Test{

    public static void main(String args[]){

        Car car = new Car("Toyota Fortnure","2020");
        car.display();

    }
}
class Car{

    public String name;
    public String Model;
    private Engine e;

    Car(String name,String Model){
        this.name = name;
        this.Model = Model;
        this.e = new Engine("Suv Engine");
    }
    public void display(){
        System.out.println(this.name + " " + this.Model + " "+this.e.engineNo);
    }

}
class Engine{
    public String engineNo;
    Engine(String engineNo){
        this.engineNo = engineNo;
    }

}
