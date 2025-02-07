

public class rainwatertrapping {
    public static int trapedwater(int barheight[]){
        int leftmax[] =  new int [barheight.length];
         leftmax[0]=barheight[0];
         for(int i=1;i<barheight.length;i++){
            leftmax[i]=Math.max(barheight[i],leftmax[i-1]);
         }
         int rightmax[]=new int[barheight.length];
         rightmax[barheight.length-1]=barheight[barheight.length-1];
         for(int i=barheight.length-2;i>=0;i--){
            rightmax[i]=Math.max(barheight[i], rightmax[i+1]);        
         }
         int trapwater=0;
         for(int i=0;i<barheight.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trapwater= trapwater+waterlevel-barheight[i];
         }
         return trapwater;
}
    public static void main(String[] args) {
        int barheight[]={4,2,0,6,3,2,5};
        int result= trapedwater(barheight);
        System.out.println("total trapped water is " +result);
    }
    
}
