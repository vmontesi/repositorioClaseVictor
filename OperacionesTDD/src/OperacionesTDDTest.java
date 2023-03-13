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

}