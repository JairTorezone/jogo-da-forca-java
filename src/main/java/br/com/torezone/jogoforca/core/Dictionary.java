package br.com.torezone.jogoforca.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.torezone.jogoforca.game.GameException;
import br.com.torezone.jogoforca.utils.RandomUtils;

public class Dictionary {

	private static final String FILE_NAME = "dicionario.txt";
	private List<String> words = new ArrayList<String>();
	private static Dictionary instance;
	
	private Dictionary() {
		load();
	}
	
	public static Dictionary getInstance() {
		if(instance == null) {
			instance = new Dictionary();
		}
		return instance;
	}

	private void load() {

		try (Scanner scan = new Scanner(getClass().getResourceAsStream("/" + FILE_NAME))) {
			
			while(scan.hasNext()) {
				String word = scan.nextLine().trim();
				words.add(word);
			}
			
			if(words.size() == 0) {
				throw new GameException("A lista de palavra não pode ser vazia");
			}
		}
	}

	public Word nextWord() {
		int posicao = RandomUtils.newRandomNumber(0, words.size());
		return new Word(words.get(posicao));
		
	}
	
}
