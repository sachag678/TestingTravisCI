package test;

import org.junit.Test;

import main.Calculate;

import static org.junit.Assert.assertEquals;

public class CalculateTest {

	@Test
	public void TestCalculate(){
		Calculate c = new Calculate();
		assertEquals(3,c.add(1, 2));
	}
	
	@Test
	public void TestCalculate2(){
		Calculate c = new Calculate();
		assertEquals(4,c.add(2, 2));
	}
}
