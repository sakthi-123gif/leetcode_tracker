// Last updated: 7/16/2026, 5:52:11 PM
1class Solution {
2    static class Pair {
3        int dist; // Stores x^2 + y^2
4        int[] point;
5
6        public Pair(int dist, int[] point) {
7            this.dist = dist;
8            this.point = point;
9        }
10    }
11
12    public int[][] kClosest(int[][] points, int k) {
13        // Min-heap sorted by distance in ascending order
14        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.dist, b.dist));
15
16        for (int[] point : points) {
17            int dist = calcDistance(point[0], point[1]);
18            minHeap.offer(new Pair(dist, point));
19        }
20
21        int[][] ans = new int[k][2];
22        for (int i = 0; i < k; i++) {
23            Pair curr = minHeap.poll();
24            ans[i] = curr.point;
25        }
26
27        return ans;
28    }
29
30    private int calcDistance(int x, int y) {
31        return x * x + y * y;
32    }
33}