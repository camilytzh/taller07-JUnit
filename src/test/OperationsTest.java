package test;

import junit.framework.TestCase;
import main.Operations;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class OperationsTest extends TestCase {

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
        String formula = "-30*50";
        String result = Operations.Solve(formula);
        assertEquals("-30*50=-1500", result);
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
    @DisplayName("Test para MakeFormula() generando una fórmula válida")
    public void testMakeFormulaValid() {
        String formula = Operations.MakeFormula();
        // Verificamos que la fórmula no esté vacía y siga el formato de una operación matemática
        assertNotNull(formula);
        assertTrue(formula.matches("\\d+[\\+\\-\\*/]\\d+([\\+\\-\\*/]\\d+)*"));
    }
    @Test
    @DisplayName("Test para verificar que la fórmula contiene números válidos")
    public void testMakeFormulaNumbers() {
        String formula = Operations.MakeFormula();
        // Verificamos que la fórmula contenga números y operadores válidos
        assertTrue(formula.matches(".*\\d+.*")); // La fórmula debe contener al menos un número
    }
    @Test
    @DisplayName("Test para verificar que la fórmula contiene operadores válidos")
    public void testMakeFormulaOperators() {
        String formula = Operations.MakeFormula();
        // Verificamos que la fórmula contiene al menos un operador
        assertTrue(formula.matches(".*[\\+\\-\\*/].*")); // La fórmula debe contener al menos un operador
    }
}


