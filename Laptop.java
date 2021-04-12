import java.util.*;
class Laptop {
    public void sound() {
        System.out.println("sound is ringing");
    }
}
    class Mobile extends Laptop {
        public void sound1() {
            System.out.println("this is the mobile sound...");
        }
    public static void main(String[] args){
            Laptop mylap=new Laptop();
            Laptop mymob=new Mobile();

            mylap.sound();
            mymob.sound();



    }


}