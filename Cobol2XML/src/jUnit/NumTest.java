package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import parse.tokens.Num;
import java.util.ArrayList;

class NumTest {

	@Test
	void test() {
		Num num = new Num();
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = num.randomExpansion(maxDepth,  depth);
		assertFalse( arrayList.isEmpty() );
	}

}
