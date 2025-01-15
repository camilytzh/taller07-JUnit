package test;

import junit.framework.TestCase;
import main.Operations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest extends TestCase {



    // TESTS PARA MAKEFORMULA

    // Test para verificar operaciones con valores negativos
    @Test
    public void testSolveNegativeNumbers() {
        String formula = "30-50";
        String result = Operations.Solve(formula);
        assertEquals("30-50=-20", result);
    }

    // Test para una fórmula con número negativo y multiplicación
    @Test
    public void testSolveNegativeMultiplication() {
        String formula = "-3*5";
        String result = Operations.Solve(formula);
        assertEquals("-3*5=-15", result);
    }

    // Test para una fórmula que contiene división con decimales
    @Test
    public void testSolveDecimalDivision() {
        String formula = "10/3";
        String result = Operations.Solve(formula);
        assertEquals("10/3=3", result); // Si esperas un valor decimal puedes ajustarlo a la lógica de redondeo
    }

    
    // TESTS PARA SOLVE
    @Test
    @DisplayName("Resolver una fórmula simple de adición")
    public void testSolveSimpleAddition() {
        String formula = "50+30";
        String result = Operations.Solve(formula);
        assertEquals("50+30=80", result);
    }

    @Test
    @DisplayName("Resolver una fórmula simple de sustracción")
    public void testSolveSimpleSubtraction() {
        String formula = "10-4";
        String result = Operations.Solve(formula);
        assertEquals("10-4=6", result);
    }


    @Test
    @DisplayName("Multiplicación básica de dos números")
    public void testSimpleMultiplication() {
        String formula = "20*30";
        String result = Operations.Solve(formula);
        assertEquals("20*30=600", result);
    }

    @Test
    @DisplayName("División básica de dos números")
    public void testSimpleDivision() {
        String formula = "80/20";
        String result = Operations.Solve(formula);
        assertEquals("80/20=4", result);
    }

    @Test
    @DisplayName("Lanza ArithmeticException cuando hay división por cero")
    public void testDivisionByZeroThrowsArithmeticException() {
        String formula = "5/0";
        assertThrows(ArithmeticException.class, () -> {
            Operations.Solve(formula);
        });


    }
}







