// Last updated: 7/10/2026, 9:33:35 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int h=letters.length-1;
         char ch=letters[0];
         while(l<=h){
            int mid=l+(h-l)/2;
            if(letters[mid]>target)
             {
                ch=letters[mid];
                h=mid-1;
             }
             else if(letters[mid]<=target)
              l=mid+1;
         }
         return ch;
    }
}