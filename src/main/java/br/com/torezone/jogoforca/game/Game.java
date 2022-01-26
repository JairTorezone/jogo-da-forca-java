package br.com.torezone.jogoforca.game;

import br.com.torezone.jogoforca.core.Word;

public class Game {

	public void start() {
		
		Word word = new Word("Casa");
		word.hasChar('a');
		word.hasChar('c');
		word.hasChar('s');
		System.out.println(word.discovered());
		System.out.println(word);
	}
}
