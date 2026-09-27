class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> groups = new HashMap<>();

        for(String word : strs){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String keyword = new String(letters);

            if(!groups.containsKey(keyword)){
                groups.put(keyword, new ArrayList<>());
            }

            groups.get(keyword).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
