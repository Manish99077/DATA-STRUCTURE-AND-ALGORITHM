package array;

public class palindrome {
    public static boolean palindrome(int x[]){
        int first=0;
        int last=x.length-1;
        while(first<last){
            if(x[first]!=x[last]){
                return false;
            }first++;
            last--;
            
        }return true;
    }
  
    public static void main(String args[]){
   int x[]={1,2,1,};
  boolean result=palindrome(x);
  System.out.print(result);
    
    }
}
    

