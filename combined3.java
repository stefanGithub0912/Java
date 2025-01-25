//Write a program to count the number of distinct substrings in a string.

import java.util.HashMap;
public class combined3 {
    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();
    }
    public static int countDistinctSubstrings(String str) {
        TrieNode root = new TrieNode();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            TrieNode current = root;
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                if (!current.children.containsKey(c)) {
                    current.children.put(c, new TrieNode());
                    count++; 
                }
                current = current.children.get(c);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "ababa";
        int distinctSubstringCount = countDistinctSubstrings(input);

        System.out.println("The number of distinct substrings in \"" + input + "\" is: " + distinctSubstringCount);
    }
	}
