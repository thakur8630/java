import jdk.dynalink.beans.StaticClass;

public class Mobilephone{
    int phone_id;
    char color;
    double price;
    String brand;
    float height,width;
    void call(){
        System.out.println("call to the my friends.....");
    }
    void message(String msg){
        System.out.println("massage to my my friends"+msg);
    }
    void info(){
        System.out.println("this is the samsung mobile");
    }
}
