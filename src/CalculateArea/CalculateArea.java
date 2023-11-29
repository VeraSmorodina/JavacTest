package CalculateArea;
import CalculateSin.CalculateSin;

public class CalculateArea {
    public static double S(Double a, Double b, double angle) {
        double v = CalculateSin.c(angle);
        return (a * b / 2) * v;
    }
}
