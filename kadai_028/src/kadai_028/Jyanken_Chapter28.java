package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	// じゃんけんの手を配列で管理する
	HashMap<String, String> choice = new HashMap<String, String>();
	
	// 初期化ブロック
	{
	choice.put("r", "グー");
	choice.put("s", "チョキ");
	choice.put("p", "パー");
	}
	
	String myChoice = "";	// 自分の手
	String randomChoice = "";	// 相手の手
	
	int win = 0;	// 1：自分の勝ち, 2：相手の勝ち, 3：あいこ
	
	// 自分のじゃんけんの手を入力する
	public void getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.next();
			System.out.println(input);
			myChoice = input;
		}
		scanner.close();
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public void getRandom() {
		int randomNum = (int)Math.floor(Math.random() * 3);
//		System.out.println(randomNum);	// デバッグ用
		
		switch (randomNum) {
		case 0 -> randomChoice = "r";
		case 1 -> randomChoice = "s";
		case 2 -> randomChoice = "p";
		}
//		System.out.println(randomChoice);	// デバッグ用
	}
	
	// じゃんけんを行う
	public void playGame() {
		// 勝敗の判定
		if (myChoice.equals("r")) {	// 自分の手がグーのとき
			switch (randomChoice) {
			case "r" -> win = 3;
			case "s" -> win = 1;
			case "p" -> win = 2;
			}
		} else if (myChoice.equals("s")) {	// 自分の手がチョキのとき
			switch (randomChoice) {
			case "r" -> win = 2;
			case "s" -> win = 3;
			case "p" -> win = 1;
			}
		} else {	// 自分の手がパーのとき
			switch (randomChoice) {
			case "r" -> win = 1;
			case "s" -> win = 2;
			case "p" -> win = 3;
			}
		}
				
		System.out.println("自分の手は" + choice.get(myChoice) + ",対戦相手の手は" + choice.get(randomChoice));
		
		if (win == 1) {
			System.out.println("自分の勝ちです");
		} else if (win == 2) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("あいこです");
		}
	}
	
}
