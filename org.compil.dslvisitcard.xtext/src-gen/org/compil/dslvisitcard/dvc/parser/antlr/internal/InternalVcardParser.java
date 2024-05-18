package org.compil.dslvisitcard.dvc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.compil.dslvisitcard.dvc.services.VcardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVcardParser extends AbstractInternalAntlrParser {
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

        public InternalVcardParser(TokenStream input, VcardGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VcardGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVcard.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVcard.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalVcard.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVcard.g:71:1: ruleModel returns [EObject current=null] : ( (lv_cards_0_0= ruleCard ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_cards_0_0 = null;



        	enterRule();

        try {
            // InternalVcard.g:77:2: ( ( (lv_cards_0_0= ruleCard ) )* )
            // InternalVcard.g:78:2: ( (lv_cards_0_0= ruleCard ) )*
            {
            // InternalVcard.g:78:2: ( (lv_cards_0_0= ruleCard ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVcard.g:79:3: (lv_cards_0_0= ruleCard )
            	    {
            	    // InternalVcard.g:79:3: (lv_cards_0_0= ruleCard )
            	    // InternalVcard.g:80:4: lv_cards_0_0= ruleCard
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCardsCardParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_cards_0_0=ruleCard();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"cards",
            	    					lv_cards_0_0,
            	    					"org.compil.dslvisitcard.dvc.Vcard.Card");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCard"
    // InternalVcard.g:100:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // InternalVcard.g:100:45: (iv_ruleCard= ruleCard EOF )
            // InternalVcard.g:101:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalVcard.g:107:1: ruleCard returns [EObject current=null] : (otherlv_0= 'Card' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Title:' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'Company:' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'Email:' ( (lv_email_9_0= RULE_STRING ) ) otherlv_10= 'Phone:' ( (lv_phone_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_company_7_0=null;
        Token otherlv_8=null;
        Token lv_email_9_0=null;
        Token otherlv_10=null;
        Token lv_phone_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalVcard.g:113:2: ( (otherlv_0= 'Card' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Title:' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'Company:' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'Email:' ( (lv_email_9_0= RULE_STRING ) ) otherlv_10= 'Phone:' ( (lv_phone_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalVcard.g:114:2: (otherlv_0= 'Card' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Title:' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'Company:' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'Email:' ( (lv_email_9_0= RULE_STRING ) ) otherlv_10= 'Phone:' ( (lv_phone_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalVcard.g:114:2: (otherlv_0= 'Card' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Title:' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'Company:' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'Email:' ( (lv_email_9_0= RULE_STRING ) ) otherlv_10= 'Phone:' ( (lv_phone_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalVcard.g:115:3: otherlv_0= 'Card' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Title:' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'Company:' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'Email:' ( (lv_email_9_0= RULE_STRING ) ) otherlv_10= 'Phone:' ( (lv_phone_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCardAccess().getCardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCardAccess().getNameKeyword_2());
            		
            // InternalVcard.g:127:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVcard.g:128:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVcard.g:128:4: (lv_name_3_0= RULE_STRING )
            // InternalVcard.g:129:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCardAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCardAccess().getTitleKeyword_4());
            		
            // InternalVcard.g:149:3: ( (lv_title_5_0= RULE_STRING ) )
            // InternalVcard.g:150:4: (lv_title_5_0= RULE_STRING )
            {
            // InternalVcard.g:150:4: (lv_title_5_0= RULE_STRING )
            // InternalVcard.g:151:5: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_5_0, grammarAccess.getCardAccess().getTitleSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCardAccess().getCompanyKeyword_6());
            		
            // InternalVcard.g:171:3: ( (lv_company_7_0= RULE_STRING ) )
            // InternalVcard.g:172:4: (lv_company_7_0= RULE_STRING )
            {
            // InternalVcard.g:172:4: (lv_company_7_0= RULE_STRING )
            // InternalVcard.g:173:5: lv_company_7_0= RULE_STRING
            {
            lv_company_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_company_7_0, grammarAccess.getCardAccess().getCompanySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCardAccess().getEmailKeyword_8());
            		
            // InternalVcard.g:193:3: ( (lv_email_9_0= RULE_STRING ) )
            // InternalVcard.g:194:4: (lv_email_9_0= RULE_STRING )
            {
            // InternalVcard.g:194:4: (lv_email_9_0= RULE_STRING )
            // InternalVcard.g:195:5: lv_email_9_0= RULE_STRING
            {
            lv_email_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_email_9_0, grammarAccess.getCardAccess().getEmailSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getCardAccess().getPhoneKeyword_10());
            		
            // InternalVcard.g:215:3: ( (lv_phone_11_0= RULE_STRING ) )
            // InternalVcard.g:216:4: (lv_phone_11_0= RULE_STRING )
            {
            // InternalVcard.g:216:4: (lv_phone_11_0= RULE_STRING )
            // InternalVcard.g:217:5: lv_phone_11_0= RULE_STRING
            {
            lv_phone_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_phone_11_0, grammarAccess.getCardAccess().getPhoneSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phone",
            						lv_phone_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCard"

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