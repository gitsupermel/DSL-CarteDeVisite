/*
 * generated by Xtext 2.30.0
 */
package org.compil.dslvisitcard.dvc.parser.antlr;

import com.google.inject.Inject;
import org.compil.dslvisitcard.dvc.parser.antlr.internal.InternalVcardParser;
import org.compil.dslvisitcard.dvc.services.VcardGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class VcardParser extends AbstractAntlrParser {

	@Inject
	private VcardGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVcardParser createParser(XtextTokenStream stream) {
		return new InternalVcardParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public VcardGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VcardGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
