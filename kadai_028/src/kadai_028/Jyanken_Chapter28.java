package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
//	final String rock = "r";	// グー
//	final String scissors = "s";	// チョキ
//	final String paper = "p";	// パー
	// マップ
	
	String myChoice = "";	// 自分の手
	String randomChoice = "";	// 相手の手
	int win = 0;	// 1：自分の勝ち, 2：相手の勝ち, 3：あいこ
	
	// 自分のじゃんけんの手を入力する
	public void getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while (!myChoice.equals(rock) && !myChoice.equals(scissors) && !myChoice.equals(paper)) {
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
		case 0 -> randomChoice = rock;
		case 1 -> randomChoice = scissors;
		case 2 -> randomChoice = paper;
		}
		System.out.println(randomChoice);	// デバッグ用
	}
	
	// じゃんけんを行う
	public void playGame() {
		// 勝敗の判定
		if (myChoice.equals(rock)) {	// 自分の手がグーのとき
			switch (randomChoice) {
			case rock -> win = 3;
			case scissors -> win = 1;
			case paper -> win = 2;
			}
		} else if (myChoice.equals(scissors)) {	// 自分の手がチョキのとき
			switch (randomChoice) {
			case rock -> win = 2;
			case scissors -> win = 3;
			case paper -> win = 1;
			}
		} else {	// 自分の手がパーのとき
			switch (randomChoice) {
			case rock -> win = 1;
			case scissors -> win = 2;
			case paper -> win = 3;
			}
		}
		
		
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + randomChoice);
		
		if (win == 1) {
			System.out.println("自分の勝ちです");
		} else if (win == 2) {
			System.out.println("相手の勝ちです");
		} else {
			System.out.println("あいこです");
		}
	}
	
}
