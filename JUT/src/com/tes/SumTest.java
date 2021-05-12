package com.tes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
	CalcSUM cal = new CalcSUM();
	int sum = cal.sum(10, 20);
	int osum = 20;

	@Test
	public void testSum() {
		assertEquals(sum, osum);
	}

}
