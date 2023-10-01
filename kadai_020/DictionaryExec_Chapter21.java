package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		String[] word = {"apple","banana","grape","orange"};
		
		for(int i = 0; i < 4; i++) {
			dictionary.dictionary(word[i]);
		}
	}

}
