// Last updated: 7/12/2026, 9:13:04 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String []st=startTime.split(":");
4        String []end=endTime.split(":");
5
6        int n=Integer.parseInt(st[0])*3600+ Integer.parseInt(st[1])*60+Integer.parseInt(st[2]);
7
8        int m=Integer.parseInt(end[0])*3600+ Integer.parseInt(end[1])*60+Integer.parseInt(end[2]);
9
10        return m-n;
11    }
12}