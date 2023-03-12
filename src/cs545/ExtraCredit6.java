package cs545;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class ExtraCredit6 {

    /**
     * 1614. Maximum Nesting Depth of the Parentheses
     * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
     */
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (char aChar : s.toCharArray()) {
            if ( aChar == '('){
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }else if ( aChar == ')'){
                depth--;
            }else{
                // Character.isDigitorLetter
                continue;
            }
        }
        return maxDepth;
    }


    /**
     * 1021. Remove Outermost Parentheses
     * https://leetcode.com/problems/remove-outermost-parentheses/
     */
    public String removeOuterParentheses(String s) {
        int opened = 0;

        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ( c == '(' && opened++ > 0){
                builder.append(c);
            }else if ( c == ')' && opened-- > 1){
                builder.append(c);
            }
        }

        return builder.toString();
    }


    /**
     * 1700. Number of Students Unable to Eat Lunch
     * https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
     */
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int student : students) {
            q.add(student);
        }

        int top = 0;
        int count = 0;
        // count keeps the track of students processed in continuous manner
        while( !q.isEmpty() && count != q.size()){
            // if student at front can eat the sandwich at top
            if( q.peek() == sandwiches[top]) {
                count = 0;

                //increment top pointer
                top++;
                q.poll();
            } else {
                //move the student to the rear
                q.add(q.poll());
                count++;
            }
        }
        return q.size();
    }


}
