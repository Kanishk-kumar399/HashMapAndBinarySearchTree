package com.hashmap;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedListHashMapTest 
{
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequency()
	{
		String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedListHashMap<String, Integer> myLinkedListHashMap=new MyLinkedListHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
        for(String word: words) {
        	Integer value=myLinkedListHashMap.get(word);
        	if(value==null)
        		value=1;
        	else
        		value++;
        	myLinkedListHashMap.add(word,value);
        }
        int frequency=myLinkedListHashMap.get("paranoid");
        System.out.println(myLinkedListHashMap);
        Assert.assertEquals(3,frequency);
	}
	@Test
	public void givenASentence_WhenAWordIsGiven_ShouldRemoveThatWordFromTheHashTable() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"
				+ " because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		MyLinkedListHashMap<String, Integer> myHashTable = new MyLinkedListHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  myHashTable.get(word);
			if(value == null)
				value = 1;
			else 
				value = value + 1;
			myHashTable.add(word, value);
		}
		String deletedWord = myHashTable.remove("avoidable");		
		Assert.assertEquals("avoidable", deletedWord);
	}
}
