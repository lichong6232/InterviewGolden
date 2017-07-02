package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chongli on 2017/7/2.
 */
public class Exchange {

    public static void main(String args[]){
        Exchange exchange = new Exchange();
        int penny[] = new int[]{3,4,7};
       /* exchange.countWays1(penny,3,33);
        System.out.println(exchange.count);*/
        int count = exchange.countWays(penny, 3, 33);
        System.out.println(count);

    }


    //方法一：暴力搜索法
    int count = 0;
    public void countWays1(int[] penny, int n, int aim) {
        // write code here
        int countWay = 0;

        List<Integer> pennyList = new ArrayList<Integer>();
        for (int p : penny){
            pennyList.add(p);
        }
        getWay(pennyList,aim);
    }
    public void getWay(List<Integer> list,int aim){

        if (!list.isEmpty()){
            int temp = list.remove(0);
            int i=0;
            while (i<= aim){
                if (aim-i == 0){
                    count += 1;
                    break;
                }
                getWay(list,aim-i);
                i+=temp;
            }
            list.add(0,temp);

        }

    }

    //方法二：动态规划方法
    public int countWays(int[] penny, int n, int aim) {
        // write code here

        int dp[][] = new int[n][aim+1];
        for (int i=0;i<=aim;i++){
            if (i%penny[0]==0){
                dp[0][i]=1;
            }
        }
        for (int i=1;i<n;i++){
            dp[i][0]=1;
            for (int j=1;j<=aim;j++){
                if (j<penny[i]){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-penny[i]];
                }
            }
        }
        return dp[n-1][aim];
    }
}
