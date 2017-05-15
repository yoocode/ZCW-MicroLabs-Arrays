package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {

        StringBuilder sb = new StringBuilder();
        sb.append("*** Output ***\n");

        for (int i = 0; i < inputArray.length; i++) {
            sb.append(inputArray[i] + "\n");
        }
        return sb.toString().trim();
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
            String text = inputArray[i];
            sb.append(text + "\n");
        }
        return sb.toString().trim();
    }

    public String isPalindrome(String[] inputArray) {

        int length = inputArray.length;
        for (int index = 0; index < length; index++) {
            String start = inputArray[index];// get the element from the start
            String end = inputArray[--length];// get corresponding element from end
            // if start element is not the same as end element, the array is not
            // palindrome
            if (start != end) {
                return "*** Output ***\nFalse";
            }
            // check if elements till the middle have been compared
            if (length < index) {
                break;
            }
        }
        return "*** Output ***\nTrue";// if the control reaches here, means all the elements were same
    }

    public String compress(int[] num) {

        StringBuilder sb = new StringBuilder();
        sb.append("compress(nums)\n*** Output ***\n");

        sb.append(num[0] + "\n");
        for (int i = 1; i < num.length; i ++){
            if(num[i-1] != num[i]) sb.append(num[i] + "\n");
        }
        return sb.toString().trim();
    }

    public String pack(char[] letters) {
        StringBuilder sb = new StringBuilder();
        sb.append("pack(nums)\n*** Output ***\n");

        sb.append(letters[0]);
        for (int i = 1; i < letters.length; i++){
            if(letters[i-1] == letters[i]) sb.append(letters[i]);
            else sb.append(", " + letters[i]);
        }
        return sb.toString();
    }



}
