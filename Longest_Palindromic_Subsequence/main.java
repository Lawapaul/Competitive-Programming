class Solution {
public:
    string reverse(string s){
        string temp=s;
        int ptr=0;
        int ptr_e=s.length()-1;
        while(ptr < ptr_e){
            swap(temp[ptr++],temp[ptr_e--]);
        }
        return temp;
    }
    int longestPalindromeSubseq(string s) {
        string rev = reverse(s);
        vector<vector<int>> dp(s.length()+1,vector<int>(rev.length()+1,0));
        for(int i=1;i<=s.size();i++){
            for(int j=1;j<=rev.size();j++){
                if(s[i-1]==rev[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.size()][rev.size()];
    }
};