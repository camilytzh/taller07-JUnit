package test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest{

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

}
