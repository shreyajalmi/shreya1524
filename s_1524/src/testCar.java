
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCar {
	Car CarMethod;
	@Before
	public void setUp() throws Exception {
		CarMethod= new Car(100);
	}

	@Test
	public void test() {
		CarMethod.getEngineCapacity(100);
		assertEquals(200,CarMethod.getCapacity());
	}

}
