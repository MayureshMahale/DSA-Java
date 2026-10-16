class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        Map<String,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(words[i],mpp.getOrDefault(words[i],0)+1);
        }
        List<String>ans=new ArrayList<>(mpp.keySet());
        Collections.sort(ans,(a,b)->{
            int freqA=mpp.get(a);
            int freqB=mpp.get(b);
            if(freqA!=freqB){
                return freqB-freqA;
            }
            return a.compareTo(b);
        });
        return ans.subList(0,k);
    }
}