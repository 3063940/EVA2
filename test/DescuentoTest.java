import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DescuentoTest {

    @Test
    void testCalcularDescuento()  {
        assertEquals(0, Descuento.calculateDiscount(4, 150, false));
    }

    @Test
    void testDescuento180() {
        assertEquals(180, Descuento.calculateDiscount(12,600,true));
    }

    @Test
    void testDescuento45() {
        assertEquals(45.0, Descuento.calculateDiscount(7,300,false),001);
    }

    @Test
    void testDescuento150() {
        assertEquals(150, Descuento.calculateDiscount(7,600,true));
    }

    @Test
    void testDescuentoRevisandoEl30() {
        assertEquals(3000, Descuento.calculateDiscount(12,10000,true));
    }
}