package string;
class leetcode1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1==null||text1.length()==0||text2==null||text2.length()==0)
            return 0;
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        StringBuilder common=new StringBuilder();
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]!=dp[i-1][j] && dp[i][j]!=dp[i][j-1])
                        common.append(text1.charAt(i-1));
                    }
                else

                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        System.out.println("最长公共子序列为："+common.toString());
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1="haswfasdeq";
        String s2="aswde";
        System.out.println("最长公共子序列长度："+longestCommonSubsequence(s1, s2));
    }
}