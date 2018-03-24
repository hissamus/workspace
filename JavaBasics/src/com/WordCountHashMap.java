package com;

//Read words from a file, & store words with its number of occurance in a collection Sort this in
//order of occurance and if frequency is same sort by word.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCountHashMap {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("c:\\abc.txt"))
				.useDelimiter("[^a-zA-Z]+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while (file.hasNext()) {
			String word = file.next().toLowerCase();
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(
				map.entrySet());
		System.out.println("ArrayList" + entries.toString());
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a,Map.Entry<String, Integer> b) {
				System.out.println(a.getValue()+".compareTo."+b.getValue());
				if (a.getValue().compareTo(b.getValue()) == 0) {
					int i = a.getKey().compareTo(b.getKey());
					return i;
				}
				return a.getValue().compareTo(b.getValue());
			}
		});
		for (int i = 0; i < entries.size(); i++) {
			System.out.println(entries.get(i).getKey() + " "
					+ entries.get(i).getValue());
		}
	}
}