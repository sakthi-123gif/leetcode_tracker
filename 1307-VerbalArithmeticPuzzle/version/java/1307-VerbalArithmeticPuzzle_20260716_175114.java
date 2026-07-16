// Last updated: 7/16/2026, 5:51:14 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        ArrayList<String> list = new ArrayList<>();
4        HashMap<String, Integer> map = new HashMap<>();
5        for(int i = 0; i < words.length; i++){
6            String word = words[i];
7            map.put(word, map.getOrDefault(word, 0) + 1);
8        }
9        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
10            if(map.get(a).equals(map.get(b))){
11                return b.compareTo(a);
12            }
13            return map.get(a) - map.get(b);
14        });
15        for(String word : map.keySet()){
16            pq.offer(word);
17            if(pq.size() > k){
18                pq.poll();
19            }
20        }
21        while(!pq.isEmpty()){
22            list.add(pq.poll());
23        }
24        Collections.reverse(list);
25        return list;
26    }
27}