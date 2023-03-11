package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;

class TestCobolClass {

	@Test
	void test() {
		Cobol c = new Cobol();
		c.setYearDateWritten(2023);
		assertEquals(c.getYearDateWritten(),2023);
	}

}
