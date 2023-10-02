package kadai_024;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

public String getMyChoice() {
	
	System.out.println("自分のじゃんけんの手を入力しましょう");
	System.out.println("グーはrockのrを入力しましょう");
	System.out.println("チョキはscissorsのsを入力しましょう");
	System.out.println("パーはpaperのpを入力しましょう");
	
	Scanner scanner = new Scanner(System.in);
	
	String input= scanner.next();
	
	while(true){
		if( (input.equals("r")) || (input.equals("s")) || (input.equals("p")) ){
			return input;
		}else{
			System.out.println("入力した値が違いますのでもう一度入力してください");
			input = scanner.next();
		}
	}
};

public String getRandom() {
	String[] random = {"r","s","p"};
	int randomHand = (int) Math.floor(Math.random()*2);	
	return random[randomHand];
};

public void playGame(String myHand,String yourHand) {
	
	HashMap<String,String> handMap = new HashMap<String,String>();
	
	handMap.put("r","グー");
	handMap.put("s","チョキ");
	handMap.put("p","パー");
	
	System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(yourHand));
	
	if(myHand.equals(yourHand)) {
		System.out.println("あいこです");
	}else if((myHand.equals("r") ) && (yourHand.equals("s" )) ){
		System.out.println("自分の勝ちです");
	}else if((myHand.equals("r") ) && (yourHand.equals("p") )){
		System.out.println("自分の負けです");
	}else if((myHand.equals("s") ) && (yourHand.equals("r" ))){
		System.out.println("自分の負けです");
	}else if((myHand.equals("s") ) && (yourHand.equals("p") )){
		System.out.println("自分の勝ちです");
	}else if((myHand.equals("p") ) && (yourHand.equals("r") )){
		System.out.println("自分の勝ちです");
	}else if((myHand.equals("p") ) && (yourHand.equals("s") )){
		System.out.println("自分の負けです");
	}
	
};

}
