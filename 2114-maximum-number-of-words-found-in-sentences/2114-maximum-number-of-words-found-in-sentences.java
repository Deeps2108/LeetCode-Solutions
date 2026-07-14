class Solution {
    public int wordCount(String str){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                cnt++;
            }
        }
        return cnt + 1;
    }
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++){
            int cnt = wordCount(sentences[i]);
            if(cnt > maxWords){
                maxWords = cnt;
            }
        }
        return maxWords;
    }
}