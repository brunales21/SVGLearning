import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new UmlGenerator().generate(new Canvas(1500, 2000));
    }

    private static void showClass(String className) {

        try {
            Class clazz = Class.forName(className);
            showClass(clazz);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void showClass(Class clazz) {
        if (clazz == null) {
            return;
        }
        try {

            System.out.println("Class: " + clazz.getName());

            System.out.println("Intefaces:");
            for (Class interfaze: clazz.getInterfaces()) {
                interfaze.getName();
            }

            System.out.println("-------------------");

            showClass(clazz.getSuperclass());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main2(String[] args) throws FileNotFoundException {

        PrintStream out = new PrintStream("svgFile.html");

        Canvas canvas = new Canvas(1200, 1000);

        GeometricFigure gf = new Rectangle("blue", new Size(300,100), "bruno", new Position(10, 10));
        GeometricFigure gf2 = new Rectangle("green", new Size(200,100), "carlos", new Position(300, 500));
        GeometricFigure gf3 = new Rectangle("red", new Size(200,100), "messi", new Position(900, 500));
        GeometricFigure gf4 = new Rectangle("orange", new Size(200,100), "laura", new Position(600, 500));
        GeometricFigure gf5 = new Rectangle("pink", new Size(200,100), "montiel", new Position(450, 700));
        GeometricFigure gf6 = new Rectangle("cyan", new Size(200,100), "adriana", new Position(750, 700));

        Arrow arr = new Arrow(gf, gf2);
        Arrow arr2 = new Arrow(gf, gf3);
        Arrow arr3 = new Arrow(gf, gf4);
        Arrow arr4 = new Arrow(gf, gf5);
        Arrow arr5 = new Arrow(gf, gf6);

        canvas.addElement(gf);
        canvas.addElement(gf2);
        canvas.addElement(gf3);
        canvas.addElement(gf4);
        canvas.addElement(gf5);
        canvas.addElement(gf6);

        canvas.addElement(arr);
        canvas.addElement(arr2);
        canvas.addElement(arr3);
        canvas.addElement(arr4);
        canvas.addElement(arr5);

        out.println(canvas.toString());

    }
}
