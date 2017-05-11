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

    public String isPalindrome(String[] inputArray) {

        int length = inputArray.length;
        for (int index = 0; index < inputArray.length; index++) {
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

    public String compress(String[] num) {return "";}

    public String pack(char[] letters) {return "";}


}
