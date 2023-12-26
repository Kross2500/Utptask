public class Circle extends Figure{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calcSurf(){
    double circleSurf = Math.PI*radius*radius;
    return circleSurf;
    }
}
