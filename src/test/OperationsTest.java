package test;

import junit.framework.TestCase;
import main.Operations;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class OperationsTest extends TestCase {
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


