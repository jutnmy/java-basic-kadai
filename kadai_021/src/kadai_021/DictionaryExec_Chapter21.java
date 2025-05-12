package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる対象を配列で管理
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("orange");
		
		for (String fruit : fruitList) {
			dictionary.search(fruit);
		}
		
	}
}
