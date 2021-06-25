import java.util.*;
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        List<Integer> list=new ArrayList<>();
        boolean negative=false;
        for(int i=0;i<s.length();i++)
        {
            if(i==0 && s.charAt(0)=='-' )
            {
                negative=true;
                continue;
            }   
             if(i==0 && s.charAt(0)=='+' )
            {
                continue;
            } 
            if(s.charAt(i)=='1' || s.charAt(i)=='2'|| s.charAt(i)=='3' || s.charAt(i)=='4'|| s.charAt(i)=='5' || s.charAt(i)=='6' ||s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9' || s.charAt(i)=='0')
            {
                list.add(Character.getNumericValue(s.charAt(i)));
            }
            else
            {
                 break;
            }    
        }
        long sum=0;
        int k=list.size()-1;
        for(int i=0;i<list.size();i++)
        {
            sum=sum+(list.get(i)*Long.valueOf((int)Math.pow(10,k)));
            k--;
        }
        if(negative)
            sum=sum*(-1);
        if(sum>Integer.MAX_VALUE)
            sum=Integer.MAX_VALUE;
        if(sum<Integer.MIN_VALUE)
            sum=Integer.MIN_VALUE;
        int h=Math.toIntExact(sum);
        return h;
        
    }
}
