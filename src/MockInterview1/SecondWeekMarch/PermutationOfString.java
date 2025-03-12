package MockInterview1.SecondWeekMarch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s1");
        String s = sc.nextLine();
        System.out.println("Enter the string s2");
        String ss = sc.nextLine();
        if(s.length()>ss.length()){
            System.out.println("False");
        }
        System.out.println(isPermutation(s,ss));
    }

    private static boolean isPermutation(String s, String ss) {
        int m = s.length();
        int n = ss.length();
        int left=0;
        int right=0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0; i<m; i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1); //O(m)
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        //other String iteration
        for(right=0; right<m; right++){
            map2.put(ss.charAt(right),map2.getOrDefault(ss.charAt(right),0)+1);   //O(m)
        }
        boolean areEqual = areMapEqual(map1,map2,s);     //O(m)
        if(areEqual){
            return true;
        }
        right=m;
        left=0;
        while(right<n){
            map2.put(ss.charAt(right),map2.getOrDefault(ss.charAt(right),0)+1);   //O(n)
            map2.put(ss.charAt(left),map2.getOrDefault(ss.charAt(left),0)-1);
            left++;
            if(areMapEqual(map1,map2,s)){                                //O(m)
                return true;
            }
            right++;
        }
        return false;
    }

    private static boolean areMapEqual(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2,String s1){
        System.out.println(map1);
        System.out.println(map2);
        for(int i=0;i<s1.length();i++){
            if(map2.containsKey(s1.charAt(i))){
                System.out.println(s1.charAt(i));
                if(map1.get(s1.charAt(i))!=map2.get(s1.charAt(i))){
                    return false;
                }
            } else{
                return false;
            }
        }
        return true;
    }
}

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.



Example 1:

Input: s1 = "abcc", s2 = "eidbcaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

// eidbaooo
// e
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

ab eidbaooo
1st pointer on a

 */