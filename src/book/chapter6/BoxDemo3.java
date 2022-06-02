package book.chapter6;

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.debth = 10;
        mybox1.height = 20;
        mybox1.width = 30;
                mybox1.volume();


        mybox2.debth = 3;
        mybox2.height = 6;
        mybox2.width = 9;

        mybox2.volume();

    }
}
