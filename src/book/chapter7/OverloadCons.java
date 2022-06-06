package book.chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCons = new Box(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myCons.volume();
        System.out.println("Volume of myCons is " + vol);
    }
}
