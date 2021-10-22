package com.hashtable;

public class HashTableMain {
	public static void main(String[] args) {
		MyHashMap<String, Integer> hashTable = new MyHashMap();
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		// Storing given sentence in an array.
		// Converting the sentence to lower case and removing spaces.
		String[] sentenceArray = sentence.toLowerCase().split(" ");

		// Iterating over the array.
		for (String word : sentenceArray) {
			Integer count = hashTable.get(word);

			if (count == null)
				count = 1;
			else
				count = count + 1;
			hashTable.add(word, count);
		}
		System.out.println(hashTable);
	}
}