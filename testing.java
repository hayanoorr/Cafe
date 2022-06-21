package project;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testing {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testing() {
		System.out.println("test passed");
		String cookTimesMS="burger";
		assertEquals("burger",cookTimesMS);
	}

	
		
	}
