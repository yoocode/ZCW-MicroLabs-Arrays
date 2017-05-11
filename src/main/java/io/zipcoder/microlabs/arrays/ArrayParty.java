package io.zipcoder.microlabs.arrays;


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
        return "";
    }

    //TODO Define the method lastButOne

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
