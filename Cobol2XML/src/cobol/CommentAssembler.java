package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class CommentAssembler extends Assembler {
	
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		if(t.sval() != null) {
			c.setCommentLine(t.sval().trim());
			a.setTarget(c);
		}
	}

}
