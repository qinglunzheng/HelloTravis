
package projecte;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ProjecteTest {
    
    public ProjecteTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testSuma() {
        Projecte p = new Projecte();
        assertEquals(2+3,p.suma(2, 3));
    }
    
}
