package ec.edu.epn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculatorTerminalTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumFromTerminal() {
        // Mock de Scanner para simular entrada del usuario
        Scanner scannerMock = mock(Scanner.class);

        // Simular entrada del usuario "5" y "7" cuando se llama scanner.nexDouble()
        when(scannerMock.nextInt()).thenReturn(5).thenReturn(7);

        // Reemplazar System.in con Scanner mock
        System.setIn(System.in);
        System.setIn(new java.io.InputStream() {
            public int read() {
                return scannerMock.nextInt();
            }
        });

        // Llamar al método por probar
        int result = calculator.sum(scannerMock.nextInt(), scannerMock.nextInt());

        // Verificar que el método sum() fue llamado correctamente con los valores simulados
        verify(scannerMock, times(2)).nextInt(); // Se esperan dos llamadas a nextInt()

        // Verificar que el resultado sea 12 (suma de 5 y 7)
        assertEquals(12, result);
    }

    @Test
    public void testSubtractFromTerminal() {
        Scanner scannerMock = mock(Scanner.class);

        when(scannerMock.nextInt()).thenReturn(8).thenReturn(4);

        System.setIn(System.in);
        System.setIn(new java.io.InputStream() {
            public int read() {
                return scannerMock.nextInt();
            }
        });

        int result = calculator.subtract(scannerMock.nextInt(), scannerMock.nextInt());

        verify(scannerMock, times(2)).nextInt();

        assertEquals(4, result);
    }

    @Test
    public void testMultiplyFromTerminal() {
        Scanner scannerMock = mock(Scanner.class);

        when(scannerMock.nextInt()).thenReturn(7).thenReturn(5);

        System.setIn(System.in);
        System.setIn(new java.io.InputStream() {
            public int read() {
                return scannerMock.nextInt();
            }
        });

        int result = calculator.multiply(scannerMock.nextInt(), scannerMock.nextInt());

        verify(scannerMock, times(2)).nextInt();

        assertEquals(35, result);
    }

    @Test
    public void testDivideFromTerminal() {
        Scanner scannerMock = mock(Scanner.class);

        when(scannerMock.nextInt()).thenReturn(9).thenReturn(3);

        System.setIn(System.in);
        System.setIn(new java.io.InputStream() {
            public int read() {
                return scannerMock.nextInt();
            }
        });

        double result = calculator.divide(scannerMock.nextInt(), scannerMock.nextInt());

        verify(scannerMock, times(2)).nextInt();

        assertEquals(3, result);
    }
}
