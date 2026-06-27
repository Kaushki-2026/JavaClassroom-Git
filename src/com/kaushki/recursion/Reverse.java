package com.kaushki.recursion;

public class Reverse {
    static void main() {
       // System.out.println(rev(3214));
        //System.out.println(Rev(3214));
        System.out.println(rev3(3214,0));
    }
    static double rev(int n){
        if(n==0){
            return 0;
        }
       return digits(n)* (n%10) +rev(n/10);
    }
    static double digits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        double ans=(Math.pow(10,count-1));
        return ans;
        /*
    The solution can be more optimized
    here, the time complexity id O(n^2)
    It could be O(n).
     */
    }

    static int Rev(int n){
        int answer=0;
        if(n<0){
            return 0;
        }
        while(n>0){
            answer=answer*10 + (n%10);
            n=n/10;
        }
        return answer;
           /*
    Here, the time and space complexity is O(n) and more optimized than previous one because
        it run only one loop
        But the problem here is it will not work for negative integer number
     */
    }
    static int rev3(int n, int ans){
        if(n==0){
            return ans;
        }
        ans=ans*10+(n%10);

        return rev3(n/10,ans);
        /*
        "This function doesn't perform any additional computation after the recursive call.
        It simply calls the next recursive function with the updated arguments and returns
            whatever value eventually comes back."
         */
    }

}

