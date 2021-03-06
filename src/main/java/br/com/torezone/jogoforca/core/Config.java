package br.com.torezone.jogoforca.core;

import java.io.IOException;
import java.util.Properties;

public class Config {

	public static Properties  properties = new Properties();
	
	static {
		try {
			properties.load(Config.class.getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String get(String name) {
		return properties.getProperty(name);
	}
}
