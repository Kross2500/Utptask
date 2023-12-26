import static java.lang.Math.sqrt;

public class Triangle extends Figure{
    double firstside;
    double secondside;
    double thirdside;
    public Triangle(double firstside, double secondside, double thirdside){
        this.firstside = firstside;
        this.secondside = secondside;
        this.thirdside = thirdside;
    }

    @Override
    public double calcSurf(){
        double p = (firstside + secondside + thirdside)/2;
        double triangleSurf = sqrt(p*(p-firstside)*(p-secondside)*(p-thirdside));
        return triangleSurf;
    }


}
