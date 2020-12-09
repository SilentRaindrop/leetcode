package string;
class leetcode1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1==null||text1.length()==0||text2==null||text2.length()==0)
            return 0;
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        int flag[][]=new int[m+1][n+1];
        StringBuilder common=new StringBuilder();
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    flag[i][j]=0;
                    }
                else if(dp[i-1][j]>dp[i][j-1]){
                    dp[i][j]=dp[i-1][j];
                    flag[i][j]=1;
                }

                else {
                    dp[i][j]=dp[i][j-1];
                    flag[i][j]=2;
                }
            }
        System.out.println("最长公共子序列为："+createStr(flag,m,n,text1));
        return dp[m][n];
    }

    public static String createStr(int[][] flag,int i,int j,String text1 ){
        if(i==0||j==0)
            return "";
        if(flag[i][j]==0){
            return createStr(flag,i-1,j-1,text1)+text1.charAt(i-1);
        }
        else if(flag[i][j]==1)
            return createStr(flag,i-1,j,text1);
        else
            return createStr(flag,i,j-1,text1);
    }

    public static void main(String[] args) {
        String s1="accggtggagtgcgcggaagccggccgaa";
        String s2="gtcgttcggaatgccgttgctctgtaaa";
        System.out.println("最长公共子序列长度："+longestCommonSubsequence(s1, s2));
    }
}