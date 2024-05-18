package org.compil.dslvisitcard.dvc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.compil.dslvisitcard.dvc.services.VcardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVcardParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Card'", "'{'", "'Name:'", "'Title:'", "'Company:'", "'Email:'", "'Phone:'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalVcardParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVcardParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVcardParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVcard.g"; }


    	private VcardGrammarAccess grammarAccess;

    	public void setGrammarAccess(VcardGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalVcard.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalVcard.g:54:1: ( ruleModel EOF )
            // InternalVcard.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVcard.g:62:1: ruleModel : ( ( rule__Model__CardsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:66:2: ( ( ( rule__Model__CardsAssignment )* ) )
            // InternalVcard.g:67:2: ( ( rule__Model__CardsAssignment )* )
            {
            // InternalVcard.g:67:2: ( ( rule__Model__CardsAssignment )* )
            // InternalVcard.g:68:3: ( rule__Model__CardsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCardsAssignment()); 
            // InternalVcard.g:69:3: ( rule__Model__CardsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVcard.g:69:4: rule__Model__CardsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CardsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCardsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCard"
    // InternalVcard.g:78:1: entryRuleCard : ruleCard EOF ;
    public final void entryRuleCard() throws RecognitionException {
        try {
            // InternalVcard.g:79:1: ( ruleCard EOF )
            // InternalVcard.g:80:1: ruleCard EOF
            {
             before(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalVcard.g:87:1: ruleCard : ( ( rule__Card__Group__0 ) ) ;
    public final void ruleCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:91:2: ( ( ( rule__Card__Group__0 ) ) )
            // InternalVcard.g:92:2: ( ( rule__Card__Group__0 ) )
            {
            // InternalVcard.g:92:2: ( ( rule__Card__Group__0 ) )
            // InternalVcard.g:93:3: ( rule__Card__Group__0 )
            {
             before(grammarAccess.getCardAccess().getGroup()); 
            // InternalVcard.g:94:3: ( rule__Card__Group__0 )
            // InternalVcard.g:94:4: rule__Card__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "rule__Card__Group__0"
    // InternalVcard.g:102:1: rule__Card__Group__0 : rule__Card__Group__0__Impl rule__Card__Group__1 ;
    public final void rule__Card__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:106:1: ( rule__Card__Group__0__Impl rule__Card__Group__1 )
            // InternalVcard.g:107:2: rule__Card__Group__0__Impl rule__Card__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Card__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0"


    // $ANTLR start "rule__Card__Group__0__Impl"
    // InternalVcard.g:114:1: rule__Card__Group__0__Impl : ( 'Card' ) ;
    public final void rule__Card__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:118:1: ( ( 'Card' ) )
            // InternalVcard.g:119:1: ( 'Card' )
            {
            // InternalVcard.g:119:1: ( 'Card' )
            // InternalVcard.g:120:2: 'Card'
            {
             before(grammarAccess.getCardAccess().getCardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0__Impl"


    // $ANTLR start "rule__Card__Group__1"
    // InternalVcard.g:129:1: rule__Card__Group__1 : rule__Card__Group__1__Impl rule__Card__Group__2 ;
    public final void rule__Card__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:133:1: ( rule__Card__Group__1__Impl rule__Card__Group__2 )
            // InternalVcard.g:134:2: rule__Card__Group__1__Impl rule__Card__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Card__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1"


    // $ANTLR start "rule__Card__Group__1__Impl"
    // InternalVcard.g:141:1: rule__Card__Group__1__Impl : ( '{' ) ;
    public final void rule__Card__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:145:1: ( ( '{' ) )
            // InternalVcard.g:146:1: ( '{' )
            {
            // InternalVcard.g:146:1: ( '{' )
            // InternalVcard.g:147:2: '{'
            {
             before(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1__Impl"


    // $ANTLR start "rule__Card__Group__2"
    // InternalVcard.g:156:1: rule__Card__Group__2 : rule__Card__Group__2__Impl rule__Card__Group__3 ;
    public final void rule__Card__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:160:1: ( rule__Card__Group__2__Impl rule__Card__Group__3 )
            // InternalVcard.g:161:2: rule__Card__Group__2__Impl rule__Card__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2"


    // $ANTLR start "rule__Card__Group__2__Impl"
    // InternalVcard.g:168:1: rule__Card__Group__2__Impl : ( 'Name:' ) ;
    public final void rule__Card__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:172:1: ( ( 'Name:' ) )
            // InternalVcard.g:173:1: ( 'Name:' )
            {
            // InternalVcard.g:173:1: ( 'Name:' )
            // InternalVcard.g:174:2: 'Name:'
            {
             before(grammarAccess.getCardAccess().getNameKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2__Impl"


    // $ANTLR start "rule__Card__Group__3"
    // InternalVcard.g:183:1: rule__Card__Group__3 : rule__Card__Group__3__Impl rule__Card__Group__4 ;
    public final void rule__Card__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:187:1: ( rule__Card__Group__3__Impl rule__Card__Group__4 )
            // InternalVcard.g:188:2: rule__Card__Group__3__Impl rule__Card__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Card__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3"


    // $ANTLR start "rule__Card__Group__3__Impl"
    // InternalVcard.g:195:1: rule__Card__Group__3__Impl : ( ( rule__Card__NameAssignment_3 ) ) ;
    public final void rule__Card__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:199:1: ( ( ( rule__Card__NameAssignment_3 ) ) )
            // InternalVcard.g:200:1: ( ( rule__Card__NameAssignment_3 ) )
            {
            // InternalVcard.g:200:1: ( ( rule__Card__NameAssignment_3 ) )
            // InternalVcard.g:201:2: ( rule__Card__NameAssignment_3 )
            {
             before(grammarAccess.getCardAccess().getNameAssignment_3()); 
            // InternalVcard.g:202:2: ( rule__Card__NameAssignment_3 )
            // InternalVcard.g:202:3: rule__Card__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Card__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3__Impl"


    // $ANTLR start "rule__Card__Group__4"
    // InternalVcard.g:210:1: rule__Card__Group__4 : rule__Card__Group__4__Impl rule__Card__Group__5 ;
    public final void rule__Card__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:214:1: ( rule__Card__Group__4__Impl rule__Card__Group__5 )
            // InternalVcard.g:215:2: rule__Card__Group__4__Impl rule__Card__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4"


    // $ANTLR start "rule__Card__Group__4__Impl"
    // InternalVcard.g:222:1: rule__Card__Group__4__Impl : ( 'Title:' ) ;
    public final void rule__Card__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:226:1: ( ( 'Title:' ) )
            // InternalVcard.g:227:1: ( 'Title:' )
            {
            // InternalVcard.g:227:1: ( 'Title:' )
            // InternalVcard.g:228:2: 'Title:'
            {
             before(grammarAccess.getCardAccess().getTitleKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getTitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4__Impl"


    // $ANTLR start "rule__Card__Group__5"
    // InternalVcard.g:237:1: rule__Card__Group__5 : rule__Card__Group__5__Impl rule__Card__Group__6 ;
    public final void rule__Card__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:241:1: ( rule__Card__Group__5__Impl rule__Card__Group__6 )
            // InternalVcard.g:242:2: rule__Card__Group__5__Impl rule__Card__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Card__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5"


    // $ANTLR start "rule__Card__Group__5__Impl"
    // InternalVcard.g:249:1: rule__Card__Group__5__Impl : ( ( rule__Card__TitleAssignment_5 ) ) ;
    public final void rule__Card__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:253:1: ( ( ( rule__Card__TitleAssignment_5 ) ) )
            // InternalVcard.g:254:1: ( ( rule__Card__TitleAssignment_5 ) )
            {
            // InternalVcard.g:254:1: ( ( rule__Card__TitleAssignment_5 ) )
            // InternalVcard.g:255:2: ( rule__Card__TitleAssignment_5 )
            {
             before(grammarAccess.getCardAccess().getTitleAssignment_5()); 
            // InternalVcard.g:256:2: ( rule__Card__TitleAssignment_5 )
            // InternalVcard.g:256:3: rule__Card__TitleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Card__TitleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5__Impl"


    // $ANTLR start "rule__Card__Group__6"
    // InternalVcard.g:264:1: rule__Card__Group__6 : rule__Card__Group__6__Impl rule__Card__Group__7 ;
    public final void rule__Card__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:268:1: ( rule__Card__Group__6__Impl rule__Card__Group__7 )
            // InternalVcard.g:269:2: rule__Card__Group__6__Impl rule__Card__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__6"


    // $ANTLR start "rule__Card__Group__6__Impl"
    // InternalVcard.g:276:1: rule__Card__Group__6__Impl : ( 'Company:' ) ;
    public final void rule__Card__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:280:1: ( ( 'Company:' ) )
            // InternalVcard.g:281:1: ( 'Company:' )
            {
            // InternalVcard.g:281:1: ( 'Company:' )
            // InternalVcard.g:282:2: 'Company:'
            {
             before(grammarAccess.getCardAccess().getCompanyKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCompanyKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__6__Impl"


    // $ANTLR start "rule__Card__Group__7"
    // InternalVcard.g:291:1: rule__Card__Group__7 : rule__Card__Group__7__Impl rule__Card__Group__8 ;
    public final void rule__Card__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:295:1: ( rule__Card__Group__7__Impl rule__Card__Group__8 )
            // InternalVcard.g:296:2: rule__Card__Group__7__Impl rule__Card__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Card__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__7"


    // $ANTLR start "rule__Card__Group__7__Impl"
    // InternalVcard.g:303:1: rule__Card__Group__7__Impl : ( ( rule__Card__CompanyAssignment_7 ) ) ;
    public final void rule__Card__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:307:1: ( ( ( rule__Card__CompanyAssignment_7 ) ) )
            // InternalVcard.g:308:1: ( ( rule__Card__CompanyAssignment_7 ) )
            {
            // InternalVcard.g:308:1: ( ( rule__Card__CompanyAssignment_7 ) )
            // InternalVcard.g:309:2: ( rule__Card__CompanyAssignment_7 )
            {
             before(grammarAccess.getCardAccess().getCompanyAssignment_7()); 
            // InternalVcard.g:310:2: ( rule__Card__CompanyAssignment_7 )
            // InternalVcard.g:310:3: rule__Card__CompanyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Card__CompanyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getCompanyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__7__Impl"


    // $ANTLR start "rule__Card__Group__8"
    // InternalVcard.g:318:1: rule__Card__Group__8 : rule__Card__Group__8__Impl rule__Card__Group__9 ;
    public final void rule__Card__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:322:1: ( rule__Card__Group__8__Impl rule__Card__Group__9 )
            // InternalVcard.g:323:2: rule__Card__Group__8__Impl rule__Card__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__8"


    // $ANTLR start "rule__Card__Group__8__Impl"
    // InternalVcard.g:330:1: rule__Card__Group__8__Impl : ( 'Email:' ) ;
    public final void rule__Card__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:334:1: ( ( 'Email:' ) )
            // InternalVcard.g:335:1: ( 'Email:' )
            {
            // InternalVcard.g:335:1: ( 'Email:' )
            // InternalVcard.g:336:2: 'Email:'
            {
             before(grammarAccess.getCardAccess().getEmailKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getEmailKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__8__Impl"


    // $ANTLR start "rule__Card__Group__9"
    // InternalVcard.g:345:1: rule__Card__Group__9 : rule__Card__Group__9__Impl rule__Card__Group__10 ;
    public final void rule__Card__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:349:1: ( rule__Card__Group__9__Impl rule__Card__Group__10 )
            // InternalVcard.g:350:2: rule__Card__Group__9__Impl rule__Card__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Card__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__9"


    // $ANTLR start "rule__Card__Group__9__Impl"
    // InternalVcard.g:357:1: rule__Card__Group__9__Impl : ( ( rule__Card__EmailAssignment_9 ) ) ;
    public final void rule__Card__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:361:1: ( ( ( rule__Card__EmailAssignment_9 ) ) )
            // InternalVcard.g:362:1: ( ( rule__Card__EmailAssignment_9 ) )
            {
            // InternalVcard.g:362:1: ( ( rule__Card__EmailAssignment_9 ) )
            // InternalVcard.g:363:2: ( rule__Card__EmailAssignment_9 )
            {
             before(grammarAccess.getCardAccess().getEmailAssignment_9()); 
            // InternalVcard.g:364:2: ( rule__Card__EmailAssignment_9 )
            // InternalVcard.g:364:3: rule__Card__EmailAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Card__EmailAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getEmailAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__9__Impl"


    // $ANTLR start "rule__Card__Group__10"
    // InternalVcard.g:372:1: rule__Card__Group__10 : rule__Card__Group__10__Impl rule__Card__Group__11 ;
    public final void rule__Card__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:376:1: ( rule__Card__Group__10__Impl rule__Card__Group__11 )
            // InternalVcard.g:377:2: rule__Card__Group__10__Impl rule__Card__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__10"


    // $ANTLR start "rule__Card__Group__10__Impl"
    // InternalVcard.g:384:1: rule__Card__Group__10__Impl : ( 'Phone:' ) ;
    public final void rule__Card__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:388:1: ( ( 'Phone:' ) )
            // InternalVcard.g:389:1: ( 'Phone:' )
            {
            // InternalVcard.g:389:1: ( 'Phone:' )
            // InternalVcard.g:390:2: 'Phone:'
            {
             before(grammarAccess.getCardAccess().getPhoneKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getPhoneKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__10__Impl"


    // $ANTLR start "rule__Card__Group__11"
    // InternalVcard.g:399:1: rule__Card__Group__11 : rule__Card__Group__11__Impl rule__Card__Group__12 ;
    public final void rule__Card__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:403:1: ( rule__Card__Group__11__Impl rule__Card__Group__12 )
            // InternalVcard.g:404:2: rule__Card__Group__11__Impl rule__Card__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Card__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__11"


    // $ANTLR start "rule__Card__Group__11__Impl"
    // InternalVcard.g:411:1: rule__Card__Group__11__Impl : ( ( rule__Card__PhoneAssignment_11 ) ) ;
    public final void rule__Card__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:415:1: ( ( ( rule__Card__PhoneAssignment_11 ) ) )
            // InternalVcard.g:416:1: ( ( rule__Card__PhoneAssignment_11 ) )
            {
            // InternalVcard.g:416:1: ( ( rule__Card__PhoneAssignment_11 ) )
            // InternalVcard.g:417:2: ( rule__Card__PhoneAssignment_11 )
            {
             before(grammarAccess.getCardAccess().getPhoneAssignment_11()); 
            // InternalVcard.g:418:2: ( rule__Card__PhoneAssignment_11 )
            // InternalVcard.g:418:3: rule__Card__PhoneAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Card__PhoneAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getPhoneAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__11__Impl"


    // $ANTLR start "rule__Card__Group__12"
    // InternalVcard.g:426:1: rule__Card__Group__12 : rule__Card__Group__12__Impl ;
    public final void rule__Card__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:430:1: ( rule__Card__Group__12__Impl )
            // InternalVcard.g:431:2: rule__Card__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__12"


    // $ANTLR start "rule__Card__Group__12__Impl"
    // InternalVcard.g:437:1: rule__Card__Group__12__Impl : ( '}' ) ;
    public final void rule__Card__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:441:1: ( ( '}' ) )
            // InternalVcard.g:442:1: ( '}' )
            {
            // InternalVcard.g:442:1: ( '}' )
            // InternalVcard.g:443:2: '}'
            {
             before(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__12__Impl"


    // $ANTLR start "rule__Model__CardsAssignment"
    // InternalVcard.g:453:1: rule__Model__CardsAssignment : ( ruleCard ) ;
    public final void rule__Model__CardsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:457:1: ( ( ruleCard ) )
            // InternalVcard.g:458:2: ( ruleCard )
            {
            // InternalVcard.g:458:2: ( ruleCard )
            // InternalVcard.g:459:3: ruleCard
            {
             before(grammarAccess.getModelAccess().getCardsCardParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCardsCardParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CardsAssignment"


    // $ANTLR start "rule__Card__NameAssignment_3"
    // InternalVcard.g:468:1: rule__Card__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Card__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:472:1: ( ( RULE_STRING ) )
            // InternalVcard.g:473:2: ( RULE_STRING )
            {
            // InternalVcard.g:473:2: ( RULE_STRING )
            // InternalVcard.g:474:3: RULE_STRING
            {
             before(grammarAccess.getCardAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__NameAssignment_3"


    // $ANTLR start "rule__Card__TitleAssignment_5"
    // InternalVcard.g:483:1: rule__Card__TitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Card__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:487:1: ( ( RULE_STRING ) )
            // InternalVcard.g:488:2: ( RULE_STRING )
            {
            // InternalVcard.g:488:2: ( RULE_STRING )
            // InternalVcard.g:489:3: RULE_STRING
            {
             before(grammarAccess.getCardAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getTitleSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__TitleAssignment_5"


    // $ANTLR start "rule__Card__CompanyAssignment_7"
    // InternalVcard.g:498:1: rule__Card__CompanyAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Card__CompanyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:502:1: ( ( RULE_STRING ) )
            // InternalVcard.g:503:2: ( RULE_STRING )
            {
            // InternalVcard.g:503:2: ( RULE_STRING )
            // InternalVcard.g:504:3: RULE_STRING
            {
             before(grammarAccess.getCardAccess().getCompanySTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCompanySTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__CompanyAssignment_7"


    // $ANTLR start "rule__Card__EmailAssignment_9"
    // InternalVcard.g:513:1: rule__Card__EmailAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Card__EmailAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:517:1: ( ( RULE_STRING ) )
            // InternalVcard.g:518:2: ( RULE_STRING )
            {
            // InternalVcard.g:518:2: ( RULE_STRING )
            // InternalVcard.g:519:3: RULE_STRING
            {
             before(grammarAccess.getCardAccess().getEmailSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getEmailSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__EmailAssignment_9"


    // $ANTLR start "rule__Card__PhoneAssignment_11"
    // InternalVcard.g:528:1: rule__Card__PhoneAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Card__PhoneAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcard.g:532:1: ( ( RULE_STRING ) )
            // InternalVcard.g:533:2: ( RULE_STRING )
            {
            // InternalVcard.g:533:2: ( RULE_STRING )
            // InternalVcard.g:534:3: RULE_STRING
            {
             before(grammarAccess.getCardAccess().getPhoneSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getPhoneSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__PhoneAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});

}