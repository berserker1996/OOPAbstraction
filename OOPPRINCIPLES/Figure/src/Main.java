import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      Figures triangule = new Triangule(2, 2 );
      Figures square = new Square(2, 2);
      Figures circle = new Circle(3);

        List<Figures> figures = new ArrayList<>();
        figures.add(triangule);
        figures.add(square);
        figures.add(circle);

        for (Figures figure: figures) {
            System.out.println("The area of your figure is:  " + Math.round(figure.area()));
        }
    }
}