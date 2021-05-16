package com.arthamatic;

import org.junit.Test;

import junit.framework.Assert;

public class ArithmeticOperationsTest {
	@Test
	public void addTest() {
		ArithmeticOperations artOper = new ArithmeticOperations();
		int sum = artOper.add(13, 11);
		Assert.assertEquals(24, sum);
	}
}
