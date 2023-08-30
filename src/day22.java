// Abstract class Vs Interface
/*
Whenever I have to implement a Interface we have to make the inteface method
public
 */
interface bicycle{
    int num = 90;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Horn{
    void BlowHorn();
    void light();
}


class AvonCycle implements bicycle{
    public void applyBrake(int decrement){
        System.out.println("Appling Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
}

// We can Implement two Interfaces Simultaneously
class PassionPro implements bicycle,Horn{
    public void applyBrake(int decrement){
        System.out.println("Appling Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void BlowHorn(){
        System.out.println("I am going to blow the Horn");
    }
    public void light(){
        System.out.println("The Light is On");
    }
}

public class day22 {
    public static void main(String[] args) {
    AvonCycle a = new AvonCycle();
    a.applyBrake(5);
    a.speedUp(7);
//    You can create properties in Intrefaces
    System.out.println(AvonCycle.num);



    PassionPro passionPro = new PassionPro();
    passionPro.applyBrake(1);
    passionPro.speedUp(2);
    passionPro.BlowHorn();
    passionPro.light();
//    You cannot modify the properties in Interfaces as they
//    are final
//        AvonCycle.num = 89;//java: cannot assign a value to final variable num
//        System.out.println(AvonCycle.num);
    }



}