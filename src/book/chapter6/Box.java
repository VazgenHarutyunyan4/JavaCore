package book.chapter6;

class Box {
    double width;
    double height;
    double debth;

    Box() {
        width = 10;
        height = 10;
        debth = 10;
    }

    //void volume() {
    // System.out.println("Volume is");
    // System.out.println(width * height * debth);
    // }


    double volume() {

        return width * height * debth;

    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        debth = d;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        debth = d;


    }
}