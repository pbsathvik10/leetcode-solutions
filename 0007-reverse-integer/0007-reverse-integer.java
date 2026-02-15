class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){
            int r=temp%10;
            if(rev>Integer.MAX_VALUE/10
            || rev==Integer.MAX_VALUE/10 && r>7) return 0;

            if(rev<Integer.MIN_VALUE/10
            || rev==Integer.MAX_VALUE/10 && r<-8) return 0;
            rev=rev*10+r;
            temp/=10;
        }
       
        return rev;
    }
}