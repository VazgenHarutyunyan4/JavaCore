package homework.figure;

public class FigurePainterDemo {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.c = '#';
        fp.figureOne();
        System.out.println();
        fp.figureTwo();
        System.out.println();
        fp.figureThree();
        System.out.println();
        fp.figureFour();
        System.out.println();
        fp.figureFive();
        FigurePainter fp2 = new FigurePainter();
        fp2.figureOne();
    }
}
