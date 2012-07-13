package com.github.coderplay.util.concurrent.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleThreadedClaimStrategyTest2 {
	
	@Test
	public void getBufferSize() {
		SingleThreadedClaimStrategy stcs = new SingleThreadedClaimStrategy2(5);
		assertEquals(5, stcs.getBufferSize()); 
	}

}
