// Last updated: 7/13/2026, 9:32:49 PM
1class Solution {
2    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
3        //we take 5 hashmap
4        //1st hashmap for row
5        HashMap<Integer, Integer> row = new HashMap<>();
6        //2nd hashmap for column
7        HashMap<Integer, Integer> col = new HashMap<>();
8        //3rd hashmap for lower diagonal
9        HashMap<Integer, Integer> d1 = new HashMap<>();
10        //4th diagonal for upper diagonal
11        HashMap<Integer, Integer> d2 = new HashMap<>();
12        //5th diagonal for cell no meaning lamp is present at this spot
13        HashMap<Integer, Integer> cellno = new HashMap<>();
14        
15        for(int i = 0;i<lamps.length;i++){
16            //get row and column from lamps array
17            int row1 = lamps[i][0];
18            int col1 = lamps[i][1];
19            //place row in row hashmap
20            row.put(row1, row.getOrDefault(row1, 0) + 1);
21            //place column in col hashmap
22            col.put(col1, col.getOrDefault(col1, 0) + 1);
23            //place d1 dia in d1
24            d1.put((row1+col1), d1.getOrDefault((row1+col1), 0) + 1);
25            //place d2 diagonal
26            d2.put((row1-col1), d2.getOrDefault((row1-col1), 0) + 1);
27            //place cellno in cell no hashmap
28            int cell = row1*n+col1;
29            cellno.put(cell, cellno.getOrDefault(cell, 0) + 1);
30        }
31        //direction array which travels in 8 adjacent direction
32        int[][] dir = {{-1, 0},{-1, 1},{0, 1},{1, 1},{1, 0},{1, -1},{0, -1},{-1, -1}};
33        int[] ans = new int[queries.length];
34        //process all queries
35        for(int i = 0;i<queries.length;i++){
36            int row1 = queries[i][0];
37            int col1 = queries[i][1];
38            int cell = row1 * n + col1;
39            ans[i] = (row.containsKey(row1) || col.containsKey(col1) || d1.containsKey(row1 + col1) || d2.containsKey(row1-col1) || cellno.containsKey(cell))? 1:0;
40            //if query has a bulb
41            if(cellno.containsKey(cell)){
42                
43                    int val = cellno.get(cell);
44                    
45                        cellno.remove(cell);
46                    
47                    //for row 
48                    if(row.containsKey(row1)){
49                        int rowval = row.get(row1);
50                        rowval-=val;
51                        if(rowval == 0){
52                            row.remove(row1);
53                        }else{
54                            row.put(row1, rowval);
55                        }    
56                    }
57                    
58                    //for col
59                    if(col.containsKey(col1)){
60                        int colval = col.get(col1);
61                        colval-=val;
62                        if(colval == 0){
63                            col.remove(col1);
64                        }else{
65                            col.put(col1, colval);
66                        }    
67                    }
68                    
69                    //for d1
70                    if(d1.containsKey(row1+col1)){
71                        int d1val = d1.get(row1+col1);
72                        d1val-=val;
73                        if(d1val == 0){
74                            d1.remove(row1+col1);
75                        }else{
76                            row.put((row1+col1), d1val);
77                        }    
78                    }
79                    
80                    //for d2
81                    if(d2.containsKey(row1 - col1)){
82                        int d2val = d2.get(row1-col1);
83                        d2val-=val;
84                        if(d2val == 0){
85                            d2.remove(row1-col1);
86                        }else{
87                            d2.put((row1-col1), d2val);
88                        }    
89                    }
90            }
91            //moves all 8 direction and remove the illumination 
92            for(int j = 0;j<dir.length;j++){
93                int rowdash = row1 + dir[j][0];
94                int coldash = col1 + dir[j][1];
95                int cellno1 = rowdash * n + coldash;
96                if(cellno.containsKey(cellno1)){
97                    int val = cellno.get(cellno1);
98                    
99                        cellno.remove(cellno1);
100                    
101                    //for row
102                    if(row.containsKey(rowdash)){
103                        int rowval = row.get(rowdash);
104                        rowval -= val;
105                        if(rowval == 0){
106                            row.remove(rowdash);
107                        }else{
108                            row.put(rowdash, rowval);
109                        }    
110                    }
111                    
112                    //for col
113                    if(col.containsKey(coldash)){
114                        int colval = col.get(coldash);
115                        colval-=val;
116                        if(colval == 0){
117                            col.remove(coldash);
118                        }else{
119                            col.put(coldash, colval);
120                        }    
121                    }
122                    
123                    //for d1
124                    if(d1.containsKey(rowdash+coldash)){
125                        int d1val = d1.get(rowdash+coldash);
126                        d1val-=val;
127                        if(d1val == 0){
128                            d1.remove(rowdash+coldash);
129                        }else{
130                            row.put((rowdash+coldash), d1val);
131                        }    
132                    }
133                    
134                    //for d2
135                    if(d2.containsKey(rowdash - coldash)){
136                        int d2val = d2.get(rowdash-coldash);
137                        d2val-=val;
138                        if(d2val == 0){
139                            d2.remove(rowdash-coldash);
140                        }else{
141                            d2.put((rowdash-coldash), d2val);
142                        }    
143                    }
144                    
145                    
146                }
147            }
148        }
149        
150        return ans;
151    }
152}