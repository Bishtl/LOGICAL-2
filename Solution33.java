// HCF and Lcm of two number;
public class Solution33 {
    
    public static void main(String[] args) {
        int a = 36;
        int b = 20;
        int result=0;
        int LCM = 0;
        //HCF (GCD)

       for(int i = 1;i<a;i++){
        if(a%i==0 && b%i==0){
            result=i;
            
        }
        
       }
       LCM = a*b/result;
       System.out.println("LCm is "+LCM);
       System.out.println("HCF is "+result);
      
    }
}
