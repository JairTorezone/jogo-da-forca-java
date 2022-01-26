package br.com.torezone.jogoforca.game;

import br.com.torezone.jogoforca.core.Dictionary;
import br.com.torezone.jogoforca.core.Word;

public class Game {

	public void start() {
		
		Dictionary d1 = Dictionary.getInstance();
		Dictionary d2 = Dictionary.getInstance();
		System.out.println(d1);
		System.out.println(d2);
		
		Word w = d1.nextWord();
		System.out.println(w.getOriginalWord());
		
	}
}
