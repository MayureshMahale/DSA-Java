class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> mpp = new HashMap<>();
        int freq=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>it:mpp.entrySet()){
            int curfreq=it.getValue();
            if(freq==-1){
                freq=curfreq;
            }else if(freq!=curfreq){
                return false;
            }
        }
        return true;
    }
}