package com.company;
import java.util.regex.*;
// Responsible Drinking Kata
public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "1 beer, 3 vines";
        String pattern = "(\\d)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        int result = 0;
        while (m.find()) {
            result += Integer.parseInt(m.group(0));
        }
        System.out.println(result);
    }
}
