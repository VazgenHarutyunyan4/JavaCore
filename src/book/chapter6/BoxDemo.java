package book.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.debth = 10;
        mybox.height = 20;
        mybox.width = 30;


        vol = mybox.debth* mybox.height* mybox.width;
        System.out.println(vol);
    }


}
