import java.util.*;
public class sumofsubar{
    public static int subarr(int numbers[]){
        int Max= Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<numbers.length;i++){
            currentsum=currentsum+numbers[i];
        
            if(Max<currentsum){
                Max=currentsum;
            }
            if(currentsum<0){
                currentsum=0;}
            
            }return Max;
    }
public static void main (String args[]){
    int numbers[]={-4,-3,-5};
    int result=subarr(numbers);
    System.out.println();
    
    


}}


// import java.util.*;
// public class sumofsubarrays{
//     public static void sumofsubarr(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i;j<numbers.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=numbers[k];
//                 }System.out.println(sum);
//             }
//         }
//     }
//     public static void main(String args[]){
//         int numbers[]={3,4,5,6};
//         sumofsubarr(numbers);

//     }

// }




// import java.util.*;
// public class Subarrays{
//     public static void subarrays(int numbers[]){
//      for(int i=0;i<numbers.length;i++){
//         for(int j=i;j<numbers.length;j++){
//         for(int k=i;k<=j;k++){
//             System.out.print(numbers[k]);
//             System.out.print(" ");
//         }System.out.println(" ");
//         }
//      }
//     }
//     public static void main(String args[]){
//         int numbers[]={3,4,5,7,8};
//         subarrays(numbers);


// }
// }

// import java.util.*;
// public class subpairs{
//     public static void subpairs(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("("+numbers[i]+","+numbers[j]+")");
//             }System.out.println(" ");
//         }
//     }
//     public static void main (String args[]){
//        int numbers[]={4,5,6,7,8,9}; 
//        subpairs(numbers);
//     }
// }
// public class Subarrays {
    
//     public static void printSubarrays(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println(); 
//             }
//         }
//     }

//     public static void main(String[] args) {
    
//         int[] arr = {5,6,8,9,3,2};
        
//         printSubarrays(arr);
//     }
// }



// import java.util.*;
// public class pairsarr{
//     public static void pairsarr(int numbers[]){
//     for(int i=0;i<numbers.length;i++){
       
//         for(int j=i+1;j<numbers.length;j++){
//             System.out.print("("+numbers[i]+", "+numbers[j]+")");
//         }System.out.println(" ");
//     }    
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//        pairsarr(numbers);
//     }
// }

// import java.util.*;
// public class reversearr{
//     public static void reverse(int numbers[]){
//         int first=0;
//         int last=numbers.length-1;
//         while(first<last){
//             int temp=numbers[last];
//           numbers[last]=numbers[first];
//             numbers[first]=temp;

//             first++;
//             last--;
//         }
//     }
// public static void main(String args[]){
// int numbers[] ={2,4,5,6,7,9,10};
// reverse(numbers);
// for(int i=0;i<=numbers.length-1;i++){
//     System.out.print(numbers[i]+" ");
// }
// }
// }
// import java.util.*;
// public class binarysearch{
//     public static int binarysearch(int numbers[],int key){
//         int start=0;
//         int last=numbers.length-1;
//         while(start<=last){
//             int mid=(start+last)/2;

//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                start= mid+1;
//             }
//             else{
//                 last=mid-1;
//             }
//         }
//         return-1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,7,8,9,21};
//         int key=21;
    
//     int mid=binarysearch(numbers,key);
//     System.out.println(mid);
// }
// }

// import java.util.*;
// public class array{
//     public static int largestval(int numbers[]){
//         int largest=Integer.MIN_VALUE;
//     for(int i=0;i<=numbers.length-1;i++){
//         if(numbers[i]>largest){
//             largest=numbers[i];
//         }
//     } 
//     return largest;
// } 
    
//     public static void main(String args[]){
//     int numbers[]={2,3,55,6,86,9,66,222,666};
//     int largest=largestval(numbers);
//     System.out.println("this is the largest value in given array"  +" "+ largest);
//     }
// }



// import java.util.*;
// public class arraysCC{
//     public static int linearSearch(int numbers[],int key){
//     for(int i=0; i<=numbers.length;i++){
//         if(numbers[i]==key){
//             return i;
//         }
//     }
        
//             return -1;
// }
    
//  public static void main (String args[]){
//     Scanner sc =new Scanner(System.in);
// int numbers[]={2,4,6,8,10,12,14};
// int key=sc.nextInt();
// int index=linearSearch(numbers,key);
// if(index > 0){
//     System.out.println("key in not found");
// }else{
//     System.out.print("key is found");
// }
// }
// }


    //     Scanner sc = new Scanner(System.in);
    //     int marks = sc.nextInt();
    // // String type = ((number%2)==0) ? "even" : "odd";
    // // System.out.println(type);
    //    String reportcard= marks >= 33 ? "pass" : "fail";
    //    System.out.println(reportcard);
    //  Scanner sc = new Scanner (System.in);
    //  int number = sc.nextInt();
    //  switch(number){
    //     case 1 : System.out.println("manish");
    //     break;
    //     case 2 : System.out.println("rahul");
    //     break;
    //     case 3 : System.out.println("zendria");
    //     break;
    //     case 4 : System.out.println("arijit");
    //     break;
    // }
    // Scanner sc = new Scanner(System.in); 
    // int range = sc.nextInt();
    // int counter = 1;
    
    // while(counter<=range){
    //     System.out.println(counter);
    //     counter++;
    // }
    // apne ko kya karna hai ki sum of n natural numbers nikalna hai 
    // jisme n apne ko n user dega 
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum=0;
    // int i =1 ;
    // while(i<=n){
    //     sum +=i;
    //     i++;
    // }
    // System.out.println(sum);
    // }
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int i =1;
    // while(i<=n){
    //     System.out.println(i);
    //     i++;
    // }
    // int i=10;
    // int n=sc.nextInt();
    // while(i>=n){
    //     System.out.println(i);
    //     i--;
    // }
    // sum of n natural numbers
    // int sum=0;
    // int i=1;
    // int n=sc.nextInt();
    // while(i<=n){
    //     sum+=i;
    //     i++;
        
    // }
    // System.out.println(sum);
//     for(int line=1;line<=4;line++){
//     System.out.println("****");
//     }manish jamle ek pro coder hai 
// int line=1;
// while(line<=4){
//     System.out.println("****");
//     line++;
// }
// 
// int n=6;
// int m=3;
// int num=1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         System.out.print(num + " ");
//         num++;
//     }
//     System.out.println("");
// }  
// 
// int n=7;
// int m=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==1||i==n||j==1||j==m||i==4)
//         {System.out.print("*");}
//         else
//             System.out.print(" ");
//     }
//     System.out.println("");
// }
// for(int i=5; i>=1;i--){
//     for(int j=1; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println(" ");
// }
// 
// for(int i=1; i<=5;i++){
//     for(int j=i;j>=1; j--){
//         System.out.print(j);
//     }System.out.println(" ");
//     }   
// for(int i=1;i<=5;i++){
//     for(int j=5;j>=1;j--){
//         System.out.print(j);
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=5;j>=i;j--){
//         System.out.print(j);
//     }System.out.println(" ");
// }
// for(int i=5;i>=1;i--){
//     for(int j=i;j<=5;j++){
//      System.out.print(j);
//     }System.out.println(" ");
// }
// for(int i=0;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }System.out.println("6");
// }
// for(int i=2;i<=6;i++){
//     for(int j=i;j<=i+4;j++){
//         System.out.print(j);
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5;j++){
//         System.out.print("*");
//     }System.out.println(" ");
// }
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i; j++){
//         System.out.print("*");
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=i;j<=5;j++){
//         System.out.print(j);
//          {System.out.print("*");   
//         }
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5;j++){
//         if(i<=j){
//             System.out.print(j);
//         }else{
//             System.out.print("*");
//         }
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5;j++){
//         if(i%2==0){
//             System.out.print("*");
//         }else{
//         System.out.print(j);
//     }
// }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
// for(int j=1;j<=5;j++){
//     if(j<=i){
//         System.out.print(i);
//     }
//     else{
//         System.out.print(j);
//     }
// }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=5;j>=i;j--){
//         System.out.print(j);
//     }System.out.println(" ");
// }
// for(int i=5;i>=1;i--){
//     for(int j=5; j>=i;j--){
//         System.out.print(j);

//     }System.out.println(" ");
// }
// for(int i=5;i>=1;i--){
//     for(int j=i;j<=5;j++){
//         System.out.print(j);
//     }System.out.println("");
// }
// for(int i=1;i<=7;i++){
//     for(int j=1;j<=i;j++){
//         if(j%2==1){
//             System.out.print("1");
//         }else
//         {System.out.print("0");
//         }
//     }System.out.println(" ");
// }
// for(int i=1;i<=7;i++){
//     for(int j=1;j<=i;j++){
//         if(j%2==1){
//             System.out.print("1");
//         }else{
//             System.out.print("0");
//         }
//     }System.out.println(" ");
// }
// for(int i=1;i<=7;i++){
//     for(int j=1;j<=i;j++){
//         if(i%2==1){
//             if(j%2==0){
//                 System.out.print("0");
//             }else{
//                 System.out.print("1");
//             }
//         }else{
//             if(j%2==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//     }System.out.println(" ");
// }
// for(int i=7;i>=1;i--){
//     for(int j=i;j>=1;j--){
//         if(j%2==0){
//             System.out.print("0");
//         }else{
//             System.out.print("1");
//         }
//     }System.out.println(" ");
// }
// for(int i=5;i>=1;i--){
//     for(int j=i;j<=5;j++){
//         System.out.print(i);
//     }System.out.println(" ");
// }
// int num=1;
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(num + " ");
//        num++;
//     }System.out.println(" ");
// }
// int a=0;
// int b=1;
// for(int i=1;i<=10;i++){
//     System.out.println(a +" ");
// int c=a+b;
// a=b;
// b=c;
// }
// int a=0;
// int b=1;
// int c=0;
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         c=a+b;
//         System.out.print(a+" ");
//         a=b;
//         b=c; 
// }System.out.println(" ");


// int count=1;
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(count);
//         count++;
//     }System.out.println(" ");
// }

// int sum=0;
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(sum);
//         sum+=i;
//     }System.out.println(" ");
// }
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5;j++){
//         if(i>=j){
//             System.out.print(i);
//         }else{
//             System.out.print(j);
//         }
//     }System.out.println(" "); 
// }





