public class Matematik {
    public Matematik() {
    }

    public void SquareSurf(double side){
        if (side < 0){
            System.out.println("Сторона квадрата должна быть неотрицательной. Невозможно вычислить площадь квадрата с текущим значением стороны квадрата.");
        } else {
            Square square1 = new Square(side);
            System.out.println("Площадь квадрата со стороной " + square1.side + ": " + square1.calcSurf());
        }
    }

    public void CircleSurf(double radius){
        if (radius < 0) {
            System.out.println("Радиус круга должен быть неотрицательным. Невозможно вычислить площадь круга с текущим значением радиуса круга.");
        } else {
            Circle circle1 = new Circle(radius);
            System.out.println("Площадь круга с радиусом " + circle1.radius + ": " + circle1.calcSurf());
        }
    }

    public void TriangleSurf(double firstside, double secondside, double thirdside){
        if ((firstside > secondside+thirdside) | (secondside > firstside+thirdside) | (thirdside > firstside+secondside)) {
            System.out.println("Значение сторон не удовлетворяют неравенству треугольника. Каждая сторона треугольника должна быть меньше суммы двух других. Невозможно вычислить площадь треугольника с текущими значениями сторон треугольника.");
        } else {
            Triangle triangle1 = new Triangle(firstside, secondside, thirdside);
            System.out.println("Площадь треугольника со сторонами " + triangle1.firstside + " " + triangle1.secondside + " " + triangle1.thirdside + ": " + triangle1.calcSurf());
        }
    }
}