package com.hashtable;

public class HashTableMain {
	public static void main(String[] args) {
		MyHashTable<String, Integer> hashTable = new MyHashTable();
		String sentence = "To be or not to be";

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