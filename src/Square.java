public class Square extends Figure{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcSurf() {
        double squareSurf = side*side;
        return squareSurf;
    }
}