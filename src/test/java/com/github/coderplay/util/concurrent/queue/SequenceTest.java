package com.github.coderplay.util.concurrent.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceTest {
	
	@Test
	public void getTest() {
		Sequence s = new Sequence(5);
		assertEquals(5, s.get()); 				
	}
	
	@Test
	public void setTest() {
		Sequence s = new Sequence(5);
		s.set(3);
		assertEquals(3, s.get()); 				
	}	

}
