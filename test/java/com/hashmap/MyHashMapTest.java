package com.hashmap;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import junit.framework.Assert;
public class MyHashMapTest 
{
    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnFrequency()
    {
        String sentence="To be or not to be";
        MyHashMap<String, Integer> myHashMap=new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word: words) {
        	Integer value=myHashMap.get(word);
        	if(value==null)
        		value=1;
        	else
        		value++;
        	myHashMap.add(word,value);
        }
        int frequency=myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2,frequency);
    }
}
