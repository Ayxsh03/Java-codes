package Graphs;
import java.util.*;

public class wordladder2 {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans= new ArrayList<>();
        Queue<List<String>> q= new LinkedList<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        List<String> begin = new ArrayList<>();
        begin.add(beginWord);
        q.add(begin);
        int level=0;
        List<String> usedLevel = new ArrayList<>();
        usedLevel.add(beginWord);

        while(!q.isEmpty()){
            List<String> list = q.poll();
            int len = list.size();
            if(len > level){
                level++;
                for(String s : usedLevel) set.remove(s);
            }
            String word=list.get(len-1);
            if(word.equals(endWord)){
                if(ans.size()==0) ans.add(list);
                else if(ans.get(0).size()==len) ans.add(list);
            }
            for(int i=0; i<word.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char[] replaced= word.toCharArray();
                    replaced[i]=ch;
                    String replacedString= new String(replaced);
                    if(set.contains(replacedString)){
                        list.add(replacedString);
                        List<String> temp=new ArrayList<>(list);
                        q.add(temp);
                        //remove modified word from list
                        list.remove(len-1);
                    }
                }
            }
        }
        return ans;
    }
}
