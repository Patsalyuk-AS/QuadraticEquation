package com.github.patsalyukas.quadraticequation.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class SolverQuadraticEquationServiceTest {

    private SolverQuadraticEquation solverQuadraticEquation = new SolverQuadraticEquationService();

    @Test
    void solve() {
        assertEquals("Не верно введены коэффициенты!", solverQuadraticEquation.solve(0, 0, 0));
        assertEquals("Не верно введены коэффициенты!", solverQuadraticEquation.solve(0, 0, 2));
        assertEquals("Уравнение не имеет действительных корней!", solverQuadraticEquation.solve(1, 0, 2));
        assertEquals("Уравнение не имеет действительных корней!", solverQuadraticEquation.solve(10, 1, 2));
        assertEquals("Корень уравнения: x = -1,000", solverQuadraticEquation.solve(1, 2, -6));
        assertEquals("Корень уравнения: x = 3,000", solverQuadraticEquation.solve(0, 1, -10));
        assertEquals("Корень уравнения: x = -6,000", solverQuadraticEquation.solve(1, 12, 29));
        assertEquals("Корни уравнения: x1 = -2,000, x2 = 2,000", solverQuadraticEquation.solve(1, 0, -11));
        assertEquals("Корни уравнения: x1 = -1,000, x2 = 3,000", solverQuadraticEquation.solve(1, -2, -10));
        assertEquals("Корни уравнения: x1 = 3,000, x2 = -5,000", solverQuadraticEquation.solve(-1, -2, 8));
        assertEquals("Корни уравнения: x1 = -9,000, x2 = 0,000", solverQuadraticEquation.solve(1, 9, -7));
    }
}