package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println(Main.doubleChar("The"));
        // System.out.println(Main.countSub("o", "Hello World"));
        // System.out.println(Main.hasPostfix("d", "Hello World"));
        // System.out.println(Main.combine("abc", "xyz"));
        // System.out.println(Main.repeatEnd("Hello World", 4));
        // System.out.println(Main.remove("l", "Hello World"));
        // System.out.println(Main.factorial(5));
        // System.out.println(Main.bunnyEars(4));
        // System.out.println(Main.fib(5));
        // System.out.println(Main.sumOfDigits(123));
        // System.out.println(Main.countDigitOccurance(676, 7, 0));
        // System.out.println(Main.sumOfDigits(225, 0));
        // System.out.println(Main.raise(3, 2, 1));
        // System.out.println(Main.fact(3));
        // System.out.println(Main.countChar(0, 0, 'x', "abxcdx"));
        // System.out.println(Main.countSubRecursive("l", "Hello World")); 
        // System.out.println(Main.removeSub("x", "abc"));
        // char[] vowels = {'a', 'e', 'i', 'o', 'u' };
        //System.out.println(Main.removeSub("ll", "Hello World"));
        // int[] arr = {3, 4, 8};
        // System.out.println(Main.groupSum(0, arr, 10));
        //System.out.println(Main.splitArray(arr, 0, 0, 0));
        // int[][] grid = {{1,2,3},{4,5,6},{7,8,9},{10, 11, 12},{13, 14, 15}};
        // int[] pattern = {7,8,9};
        //System.out.println(Main.palindroneIndex("abbcbb", 0));
        // Main.removeCharAndPrint("Hello World");
        // System.out.println(Main.gridSearch(grid, pattern));
        // Main.fizzBuzzR(1);
        // System.out.println(Main.scoresIncreasing(arr));
        // System.out.println(Main.scoresClumps(arr));
        // System.out.println(Main.scoresAverage(arr));
        // System.out.println(Main.hasOne(1));
        // System.out.println(Main.dividesItself(128));
        
    }
    
    public static String doubleChar(String s) {
        StringBuilder builder = new StringBuilder();
        for(char c : s.toCharArray()) {
            builder.append(c);
            builder.append(c);
        }
        return builder.toString();
    }
    public static int countSub(String sub, String s) {
        int count = 0;
        int j = 0;
        int k = 0;
        for(int i=0; i < s.length(); i++) {
            j = i;
            k = 0;
            while(j < s.length() && s.charAt(j) == sub.charAt(k)) {
                if(k == (sub.length() - 1)) {
                    count++; // end of substring
                    break;
                }
                j++;
                k++;
            }
        }
        return count;
    }
    public static boolean hasPostfix(String post, String s) {
        int j = 0;
        int k = 0;
        for(int i=0; i < s.length(); i++) {
            j = i;
            k = 0;
            while(j < s.length() && s.charAt(j) == post.charAt(k)) {
                if((k == (post.length() - 1)) && (j == (s.length() - 1))) {
                    return true;
                }
                else if(k == (post.length() - 1)) {
                    break;
                }
                j++;
                k++;
            }
        }
        return false;
    }    
    public static String combine(String s1, String s2) {
        String smaller = null;
        String larger = null;
        int i = 0;
        
        if(s1.length() < s2.length()) {
            smaller = s1;
            larger = s2;
        }
        else {
            smaller = s2;
            larger = s1;
        }

        StringBuilder builder = new StringBuilder();
        
        for(i=0; i < smaller.length(); i++) {
            builder.append(smaller.charAt(i));
            builder.append(larger.charAt(i));
        }

        while(i < larger.length()) {
            builder.append(larger.charAt(i));
            i++;
        }
        return builder.toString();
    }    
    public static String repeatEnd(String s, int n) {
        StringBuilder builder = new StringBuilder();
        if(n > s.length() - 1) {
            return null;
        }
        for(int i = s.length() - n; i < s.length(); i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }    
    public static String remove(String r, String s) {
        StringBuilder builder = new StringBuilder();
        int j = 0;
        int k = 0;
        for(int i=0; i < s.length(); i++) {
            j = i;
            k = 0;
            while(j < s.length() && s.charAt(j) == r.charAt(k)) {
                if(k == (r.length() - 1)) {
                    i = j + 1;
                    break;
                }
                j++;
                k++;
            }
            if(i < s.length()) {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }    
    public static int factorial(int n) {
        if(n < 2)
            return 1;
        int result = factorial(n - 1) * n;
        return result;
    }    
    public static int bunnyEars(int n) {
        if(n == 0)
            return 0;
        int result = bunnyEars(n - 1) + 2;
        return result;
    }    
    public static int fib(int n) {
        if(n <= 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }    
    public static int getLength(int n) {
        int length = (int)(Math.log10(n)+1);
        return length;
    }  
    public static int countDigitOccurance(int n, int digit, int count) {
        if(n < 1)
            return count;
        if(n % 10 == digit)
            count += 1;
        n = n/10;
        return countDigitOccurance(n, digit, count);
    }    
    public static int sumOfDigits(int n, int sum) {
        if(n < 1)
            return sum;
        sum += n % 10;
        n = n/10;
        return sumOfDigits(n, sum);
    }    
    public static int raise(int n, int pow, int result) {
        if(pow < 1)
            return result;
        result *= n;
        return raise(n, pow - 1, result);
    }    
    public static int fact(int n) {
        if(n <= 1)
            return 1;
        int result = fact(n - 1) * n;
        return result;
    }    
    public static int countChar(int indx, int result, char c, String s) {
        if(indx >= s.length())
            return result;
        if(s.charAt(indx) == c)
            result += 1;
        return countChar(indx + 1, result, c, s);
    }    
    public static int countSubRecursive(String sub, String s) {
        if(s.length() > 1) {
            if(s.indexOf(sub) > -1) {
                return 1 + countSubRecursive(sub, s.substring(s.indexOf(sub) + sub.length()));
            }
            else { return countSubRecursive(sub, s.substring(1)); }
        }
        return 0;
    }    
    public static String removeSub(String sub, String s) {
        if(s.length() > 1) {
            if(s.indexOf(sub) > -1) {
                String tmp = s.substring(0, s.indexOf(sub)) + s.substring(s.indexOf(sub) + sub.length());
                return removeSub(sub, tmp);
            }
        }
        return s;
    }   
    public static boolean groupSum(int start, int[] nums, int target) {
        System.out.println("start " + start);
        System.out.println("target " + target + "\n");
        
        if (start >= nums.length) {
            return (target == 0);
        }

        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        return false;
    }   
    public static boolean splitArray(int[] nums, int indx, int leftSum, int rightSum) {
        if(indx >= nums.length) { return leftSum == rightSum; }
        return splitArray(nums, indx + 1, leftSum + nums[indx], rightSum) || splitArray(nums, indx + 1, leftSum, rightSum + nums[indx]);
    }   
    public static String reverse(String s) {
        String result = "";
        int i = s.length() - 1;
        while(i >= 0) {
            result += s.charAt(i);
            i--;
        }
        return result;
    }
    public static int palindroneIndex(String s, int indx) {
        if(indx < s.length()) {
            String test = s.substring(0, indx) + s.substring(indx + 1);
            if(test.equals(Main.reverse(test))) { 
                return indx; 
            }
            return palindroneIndex(s, indx + 1);
        }
        return indx;
    }  
    public static boolean gridSearch(int[][] grid, int[] pattern) {
        for(int i = 0; i < grid.length; i++) {
            for(int k = 0; k < grid[0].length; k++) {
                int row = i;
                int col = k;
                int cell = grid[i][col];
                int x = 0;
                while((col < grid[0].length) && (cell == pattern[x])) {
                    if(col == pattern.length - 1) {
                        return true;
                    }
                    col++;
                    x++;
                }
            }
        }
        return false;
    }
    public static void fizzBuzz() {
        for(int i=1; i <= 100; i++) {
            String result = i + ": ";
            if((i % 3 == 0) && (i % 5 == 0))
                result += "Fizz Buzz ";
            else if(i % 3 == 0)
                result += "Fizz";
            else if (i % 5 == 0)
                result += "Buzz";
            System.out.println(result);
            
        }
    } 
    public static void fizzBuzzR(int n) {
        if(n <= 100) {
            String result = n + ": ";
            if((n % 3 == 0) && (n % 5 == 0))
                result += "Fizz Buzz ";
            else if(n % 3 == 0)
                result += "Fizz";
            else if (n % 5 == 0)
                result += "Buzz";
            System.out.println(result);
            fizzBuzzR(n + 1);
        }
        return;
    } 
    public static boolean scoresIncreasing(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            if(i == 0) { continue; }
            else {
                if(nums[i] < nums[i - 1]) {
                    return false;
                }
            }
                        
        }
        return true;
    } 
    public static boolean scoresClumps(int[] nums) {
        int k = 0;
        boolean flag = false;
        for(int i=0; i < nums.length; i++) {
            flag = false;
            k = i;
            if(i == 0)
                continue;
            int diff = Math.abs(nums[i] - nums[i - 1]);
            while(k < nums.length && diff <= 2) {
                if(k == nums.length - 1) {
                    flag = true;
                }
                k++;
            }
        }
        return flag;
    }
    public static int scoresAverage(int[] nums) {
        int middle = nums.length / 2;
        int end = nums.length;
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle, end);
        return (average(left) + average(right)) / 2;
    }   
    public static int average(int[] nums) {
        int sum = 0;
        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum/(nums.length);
    }
    public static int wordsCount(String[] strs, int len) {
        int count = 0;
        for(String s : strs) {
            if(s.length() == len)
                count += 1;
        }
        return count;
    }
    public static boolean hasOne(int n) {
        if(n <= 0)
            return false;
        if(n % 10 == 1)
            return true;
        n = n/10;
        return hasOne(n);
    }   
    public static boolean dividesItself(int num) {
        int n = num;
        while(n > 0) {
            if(n % 10 == 0)
                return false;
            if(num % (n % 10) != 0) {
                return false;
            }
            n = n/10;
        }
        return true;
    }
}
