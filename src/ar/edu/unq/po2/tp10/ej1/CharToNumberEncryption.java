package ar.edu.unq.po2.tp10.ej1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharToNumberEncryption implements EncryptionStrategy {
	
	private List<Character> CHARS = new ArrayList<Character>(Arrays.asList(' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

	@Override
	public String encriptar(String rawPassword) {
		return rawPassword.toLowerCase()
						  .chars()
		  				  .mapToObj(c -> (char) c)
		  				  .map(c -> {
		  					  int index = CHARS.indexOf(c);
		  					  return index != -1? String.valueOf(index) : null;
		  				  })
		  				  .filter(s -> s != null)
	  					  .collect(Collectors.joining(","));
	}

	@Override
	public String desencriptar(String encryptedPassword) {
		return Arrays.stream(encryptedPassword.split(","))
					 .mapToInt(Integer::parseInt)
					 .mapToObj(CHARS::get)
					 .map(Object::toString)
					 .collect(Collectors.joining());
	}

}
