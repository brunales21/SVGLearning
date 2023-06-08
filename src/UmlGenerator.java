import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class UmlGenerator {
    public void generate(Canvas canvas) throws FileNotFoundException {
        try (PrintStream out = new PrintStream("svgFile.html")) {
            File directorio = new File("src/target");
            File[] files = directorio.listFiles();
            Class class1;
            for (File file : files) {
                try {
                    class1 = Class.forName("target." + file.getName().replace(".java", ""));
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException();
                }
                // si la clase tiene padre distinto de Object...
                if (!class1.getSuperclass().getName().equalsIgnoreCase("java.lang.Object")) {
                    Rectangle c = new Rectangle("red", new Size(300,100), class1.getSimpleName(), new Position(10, 300));
                    canvas.addElement(c);
                    Element e = canvas.getElementByName(class1.getSuperclass().getSimpleName());
                    // si existe el padre ...
                    if (e != null) {
                        canvas.addElement(new Arrow(c, (Rectangle) e));
                    // si no existe se crea
                    } else {
                        Rectangle sc = new Rectangle("blue", new Size(300,100), class1.getSuperclass().getSimpleName(), new Position(10, 10));
                        canvas.addElement(sc);
                        canvas.addElement(new Arrow(c, sc));
                    }
                // si su padre es Object y no está instanciado
                } else if (class1.getSuperclass().getName().equalsIgnoreCase("java.lang.Object") && !canvas.existsElement(class1.getSimpleName())) {
                    canvas.addElement(new Rectangle("blue", new Size(300,100), class1.getSimpleName(), new Position(10, 10)));
                }
            }
            out.println(canvas.toString());
        }
    }
}