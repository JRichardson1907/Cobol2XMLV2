package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import cobol.CobolParser;
import parse.Parser;
import parse.tokens.Literal;
import parse.tokens.Tokenizer;
import parse.tokens.TokenAssembly;
import parse.Assembly;


class ProgramIDTest {

	@Test
	void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("program-id.  base.");
		
		Assembly input = new TokenAssembly(t);
		Assembly output = p.bestMatch(input);
		
		ArrayList<Parser> programID = new ArrayList<Parser>();
		Literal literal = new Literal("program-id. base.");
		String sr = literal.unvisitedString(programID);
		
		assertEquals(sr, "program-id. base.");
	}

}
