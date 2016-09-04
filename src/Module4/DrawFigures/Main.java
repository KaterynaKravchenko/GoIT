package Module4.DrawFigures;

public class Main {
    static void draw (Figure figure){
        figure.drawFigure();
    }

    public static void main(String[] args) {
        Figure circle = new Circle();
        draw(circle);

        Figure square = new Square();
        draw(square);

        Triangle triangle = new Triangle();
        draw(triangle);
    }
}
