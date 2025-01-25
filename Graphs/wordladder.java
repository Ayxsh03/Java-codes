package Graphs;

import java.util.*;

public class wordladder {
    static class Pair {
        String first;
        int second;
        Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> set=new HashSet<>();
        int len=wordList.size();
        for(int i=0;i<len;i++){
            set.add(wordList.get(i));
        }
        set.remove(beginWord);
        while(!q.isEmpty()){
            Pair p=q.poll();
            String word=p.first;
            int steps=p.second;

            if(word.equals(endWord)) return steps;

            for(int i=0; i< word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] replaced=word.toCharArray();
                    replaced[i]=ch;
                    String replacedWord= new String(replaced);
                    if(set.contains(replacedWord)){
                        set.remove(replacedWord);
                        q.offer(new Pair(replacedWord, steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
