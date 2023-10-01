package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void dictionary(final String word) {
		HashMap<String,String> dictionaryEnglish= new HashMap<String,String>();
		
		dictionaryEnglish.put("apple", "りんご");
		dictionaryEnglish.put("peach", "桃");
		dictionaryEnglish.put("banana", "バナナ");
		dictionaryEnglish.put("lemon", "レモン");
		dictionaryEnglish.put("pear", "梨");
		dictionaryEnglish.put("kiwi", "キウイ");
		dictionaryEnglish.put("strawberry", "いちご");
		dictionaryEnglish.put("grape", "ぶどう");
		dictionaryEnglish.put("muscat", "マスカット");
		dictionaryEnglish.put("cherry", "さくらんぼ");
		
		if(dictionaryEnglish.containsKey(word)) {
       	 System.out.println(word + "の意味は" + dictionaryEnglish.get(word));
        }else {
       	 System.out.println(word + "は辞書に存在しません");
        }
	}

}
