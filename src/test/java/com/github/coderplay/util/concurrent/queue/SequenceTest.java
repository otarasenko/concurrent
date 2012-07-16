package com.github.coderplay.util.concurrent.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceTest {
	
	@Test
	public void getTest() {
		Sequence s = new Sequence(5);
		assertEquals(5, s.get()); 		
		
	}

}
