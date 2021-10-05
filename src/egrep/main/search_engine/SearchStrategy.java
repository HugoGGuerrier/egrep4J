package egrep.main.search_engine;

import egrep.main.automaton.Automaton;
import egrep.main.exceptions.AutomatonException;
import egrep.main.exceptions.CharacterException;

/**
 * Interface used to abstract searching methods, uses the strategy design pattern
 *
 * @author Emilie SIAU
 * @author Hugo GUERRIER
 */
public interface SearchStrategy {
    /**
     * Get if a input string is matchig with a regex automaton
     *
     * @param automaton The automaton
     * @param input The input string
     * @return True if the string matches
     * @throws AutomatonException If the automaton has an error
     * @throws CharacterException If there is a non ASCII character
     */
    boolean isMatching(Automaton automaton, String input) throws AutomatonException, CharacterException;
}
