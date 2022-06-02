package book.chapter6;

public class BoxDemo2 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.debth = 10;
        mybox1.height = 20;
        mybox1.width = 30;
        vol = mybox1.debth * mybox1.height * mybox1.width;
        System.out.println(vol);


        mybox2.debth = 3;
        mybox2.height = 6;
        mybox2.width = 9;


        vol = mybox2.debth * mybox2.height * mybox2.width;
        System.out.println(vol);
    }
}
