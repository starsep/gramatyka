//Filip Czaplicki 359081
package gramatyka;

public class RegularGrammar extends ContextFreeGrammar {
    public RegularGrammar(Terminal[] terminals, Nonterminal[] nonterminals, Production[] productions) throws Exception {
        super(terminals, nonterminals, productions);
    }

    public RegularGrammar(String terminals, String nonterminals, String[][] productions) throws Exception {
        super(Terminal.makeTerminals(terminals), Nonterminal.makeNonterminals(nonterminals), Production.makeProductions(Nonterminal.makeNonterminals(nonterminals), productions));
    }

    public RegularGrammar(ContextFreeGrammar grammar) throws Exception {
        super(grammar.terminals, grammar.nonterminals, grammar.productions);
    }

    @Override
    public boolean ifRegular() {
        return true;
    }
}
