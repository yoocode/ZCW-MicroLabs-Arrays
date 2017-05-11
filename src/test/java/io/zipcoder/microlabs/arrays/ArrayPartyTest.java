package io.zipcoder.microlabs.arrays;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastButOneTest(){
        //:given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Tomatoes";

        //:when
        String actual = arrayParty.lastButOne(breakfast);
        //:then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest(){
        //:given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";
        //:when
        String actual = arrayParty.reverse(breakfast);

        //:then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPalindromeTest(){
        //:given
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTrue";
        String expected1 = "*** Output ***\nFalse";

        //:when
        String actual = arrayParty.isPalindrome(palindromic);
        String actual1 = arrayParty.isPalindrome(breakfast);

        //:then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void compressTest(){
        //:given
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected = "compress(nums)\n*** Output ***\n" +
                "1\n3\n2\n1\n4";

        //:when
        String actual = arrayParty.compress(nums);

        //:then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packTest(){
        //:given
        ArrayParty arrayParty = new ArrayParty();
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c',
                'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};
        String expected = "pack(nums)\n*** Output ***\naaaa, b, cc, aa, d, eeee";

        //:when
        String actual = arrayParty.pack(letters);
        //:then
        Assert.assertEquals(expected, actual);

    }

}
