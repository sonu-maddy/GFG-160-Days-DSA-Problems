package String;

public class AddBinaryStrings {
    public String addBinary(String s1, String s2) {
        // code here
        // String ans= "";

        StringBuilder ans = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry =0;
        while(i>=0 || j>=0 || carry != 0){

            int count =carry;
            if(i>=0 ){
                if(s1.charAt(i) == '1')  count++;
                i--;
            }

            if(j>=0 ){
                if(s2.charAt(j) == '1')  count++;
                j--;
            }

            // if(count % 2 == 0){
            //     ans = '0' + ans;
            // }
            // else{
            //     ans = '1' + ans;
            // }

            ans.append(count % 2);

            carry = count /2;

        }


        // while(ans.length() > 1 && ans.charAt(i) == '0'){
        //     ans = ans.substring(1);
        // }

        String result =  ans.reverse().toString();

        int firstOneIndex = 0;
        while(firstOneIndex < result.length()-1 && result.charAt(firstOneIndex) == '0'){
            firstOneIndex++;
        }

        return result.substring(firstOneIndex);
    }
}

//Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
//Note: The input strings may contain leading zeros but the output string should not have any leading zeros.
//
//        Input: s1 = "1101", s2 = "111"
//Output: 10100
//Explanation:
//        1101
//        + 111
//        10100
//Input: s1 = "00100", s2 = "010"
//Output: 110
//Explanation:
//        100
//        +  10
//        110
//Constraints:
//        1 ≤s1.size(), s2.size()≤ 106
