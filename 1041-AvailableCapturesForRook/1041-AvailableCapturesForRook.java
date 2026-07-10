// Last updated: 7/10/2026, 9:33:16 AM
class Solution {
    public int numRookCaptures(char[][] board) {
        int row=0,col=0,r=0,c=0,att=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                row=i;
                col=j;
                break;
                }
            }
        }
          r=row;
             c=col;
            while(r>=0 && board[r][c]!='B'){
                if(board[r][c]=='p'){
                    att++;
                    break;
                }
                r--;
            }

            //down
            r=row;
            c=col;
             while(r<=7 && board[r][c]!='B'){
                if(board[r][c]=='p'){
                    att++;
                    break;
                }
                r++;
            }
            //left
             r=row;
            c=col;
             while(c>=0 && board[r][c]!='B'){
                if(board[r][c]=='p'){
                    att++;
                    break;
                }
                c--;
            }

            //right
             r=row;
            c=col;
             while(c<=7 && board[r][c]!='B'){
                if(board[r][c]=='p'){
                    att++;
                    break;
                }
                c++;
            }
            return att;

    }
}