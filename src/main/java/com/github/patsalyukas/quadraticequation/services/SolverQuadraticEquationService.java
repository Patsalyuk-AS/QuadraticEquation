package com.github.patsalyukas.quadraticequation.services;

import org.springframework.stereotype.Service;

@Service
public class SolverQuadraticEquationService implements SolverQuadraticEquation {

    @Override
    public String solve(double a, double b, double c) {
        if ((a == 0) && (b == 0)){
            return "Не верно введены коэффициенты!";
        }
        if (a == 0) {
            return String.format("Корень уравнения: x = %f",(-7 - c) / b);
        }
        c = c +7;
        double disc = b * b - 4 * a * c;
        if (disc < 0) {
            return "Уравнение не имеет действительных корней!";
        }
        if (disc == 0) {
            return String.format("Корень уравнения: x = %f", -b/(2 * a));
        }
        double x1 = (-b - Math.sqrt(disc)) / (2 * a);
        double x2 = (-b + Math.sqrt(disc)) / (2 * a);
        return String.format("Корени уравнения: x1 = %f, x2 = %f", x1, x2);
    }
}
