public class Solution51 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 5;j>=i;j--){
               System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                if(i>=2 && k>=2){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
