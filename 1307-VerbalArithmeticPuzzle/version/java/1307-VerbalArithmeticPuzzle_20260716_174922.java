// Last updated: 7/16/2026, 5:49:22 PM
1class KthLargest {
2    private PriorityQueue<Integer> pq;
3    private int k;
4    public KthLargest(int k, int[] nums) {
5        List<Integer> list= new ArrayList<Integer>();  
6        for(int i = 0; i < Math.min(k, nums.length); ++i) list.add(nums[i]);
7        pq = new PriorityQueue<>(); pq.addAll(list);
8        this.k = k;
9        for(int i = k; i < nums.length; ++i) {
10            pq.add(nums[i]);
11            pq.poll();
12        }
13    }
14    
15    public int add(int val) {
16        pq.add(val);
17        if(pq.size() > k) pq.poll();
18        return pq.peek();
19    }
20}
21
22public class Main {
23    public static void main(String[] args) {
24        int[] nums = new int[]{4, 5, 8, 2}, stream = new int[]{3, 5, 10, 9, 4};
25        KthLargest obj = new KthLargest(3, nums);
26        for(int num : stream) System.out.print(obj.add(num) + " ");
27    }
28}