package com.tactfactory.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DivideTest {

	Divide div;
	
	@Before
	public void setUp() throws Exception {
		this.div = new Divide(10);
	}

	@Test
	public void testDivide() {
		Assert.assertNotNull(this.div);
		Assert.assertEquals(10, this.div);
	}

	@Test
	public void testMake() {
		
	}

	@Test
	public void testGetValue() {
		
	}

}
