package io.zipcoder.microlabs.arrays;


import javax.swing.*;

public class ArrayParty {

    public String printArray(String[] inputArray) {

        StringBuilder sb = new StringBuilder();

        sb.append("*** Output ***\n");

        for (int i = 0; i < inputArray.length; i++) {
            if (i > 0){
                sb.append("\n");
            }
            String item = inputArray[i];
            sb.append(item);
        }
        return sb.toString();
    }


    public String lastElement(String[] inputArray){

        StringBuilder sb = new StringBuilder();

        sb.append("*** Output ***\n");
        sb.append(inputArray[inputArray.length-1]);

        return sb.toString();
    }

    public String lastButOne(String[] inputArray) {
        StringBuilder sb = new StringBuilder();

        sb.append("*** Output ***\n");
        sb.append(inputArray[inputArray.length-2]);

        return sb.toString();
    }

    public String reverse(String[] inputArray) {

        StringBuilder sb = new StringBuilder();
        sb.append("*** Output ***\n");

        for (int i = inputArray.length-1; i >= 0; i--){
//            if (i != 0) {
//                sb.append("\n");
//            }
            String text = inputArray[i];
            if(i!= 0) sb.append(text + "\n");
        }
        sb.append(inputArray[0]);
        return sb.toString();
    }

    public String isPalindrome(String[] inputArray) {return "";}

    public String compress(String[] num) {return "";}

    public String pack(char[] letters) {return "";}


}
