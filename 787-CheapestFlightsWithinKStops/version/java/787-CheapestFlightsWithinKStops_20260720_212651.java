// Last updated: 7/20/2026, 9:26:51 PM
1class Pair{
2    int first;
3    int second;
4    public Pair(int first,int second){
5        this.first = first;
6        this.second = second;
7    }
8}
9class Tuple {
10    int first, second, third; 
11    Tuple(int first, int second, int third) {
12        this.first = first; 
13        this.second = second;
14        this.third = third; 
15    }
16}
17class Solution {
18    public int findCheapestPrice(int n,int flights[][],int src,int dst,int K) {
19
20        // Create the adjacency list to depict airports and flights in
21        // the form of a graph.
22        ArrayList<ArrayList<Pair>> adj = new ArrayList<>(); 
23        for(int i = 0;i<n;i++) {
24            adj.add(new ArrayList<>()); 
25        }
26        int m = flights.length; 
27        for(int i = 0;i<m;i++) {
28            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2])); 
29        }
30        
31        // Create a queue which stores the node and their distances from the
32        // source in the form of {stops, {node, dist}} with ‘stops’ indicating 
33        // the no. of nodes between src and current node.
34        Queue<Tuple> q = new LinkedList<>(); 
35        
36        q.add(new Tuple(0, src, 0));
37
38        // Distance array to store the updated distances from the source. 
39        int[] dist = new int[n]; 
40        for(int i = 0;i<n;i++) {
41            dist[i] = (int)(1e9); 
42        }
43        dist[src] = 0; 
44
45        // Iterate through the graph using a queue like in Dijkstra with 
46        // popping out the element with min stops first.
47        while(!q.isEmpty()) {
48            Tuple it = q.peek(); 
49            q.remove(); 
50            int stops = it.first; 
51            int node = it.second; 
52            int cost = it.third; 
53            
54            // We stop the process as soon as the limit for the stops reaches.
55            if(stops > K) continue; 
56            for(Pair iter: adj.get(node)) {
57                int adjNode = iter.first; 
58                int edW = iter.second; 
59                
60                // We only update the queue if the new calculated dist is
61                // less than the prev and the stops are also within limits.
62                if (cost + edW < dist[adjNode] && stops <= K) {
63                    dist[adjNode] = cost + edW; 
64                    q.add(new Tuple(stops + 1, adjNode, cost + edW)); 
65                }
66            }
67        }
68        // If the destination node is unreachable return ‘-1’
69        // else return the calculated dist from src to dst.
70        if(dist[dst] == (int)(1e9)) return -1; 
71        return dist[dst]; 
72    }
73}