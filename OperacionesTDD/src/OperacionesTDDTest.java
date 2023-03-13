import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @org.junit.jupiter.api.Test
    public void testSumar() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(0, operacionesTDD.suma(""));
    }
    @org.junit.jupiter.api.Test
    public void testSumarUno() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(1, operacionesTDD.suma("1"));
    }
    @org.junit.jupiter.api.Test
    public void testSumarDos() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(3, operacionesTDD.suma("1,2"));
    }
    @org.junit.jupiter.api.Test
    public void testSumarTres() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(-1, operacionesTDD.suma("1,1,2, "));
    }
    @org.junit.jupiter.api.Test
    public void testSumarNoNumerosNegativos() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(-1, operacionesTDD.suma("1,1,2,-1"));
    }
    @org.junit.jupiter.api.Test
    public void testSumarNoNumerosMayoresDeMil() {
        OperacionesTDD operacionesTDD = new OperacionesTDD();
        assertEquals(12, operacionesTDD.suma("1,11,2222"));
    }

}