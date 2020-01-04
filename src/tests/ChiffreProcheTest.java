package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChiffreProcheTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		int A[] = { 5, -1, 2, 3, 0 };
		int Min = A[0];
		for (int i = 0; i < A.length; i++) {
			if (Math.abs(A[i]) < Min) {
				Min = A[i];
			}
		}
		assertEquals(-1, Min);
	}

}
