/*
 
12345678
123456
1234
12

 */

public class Solution62 {
    public static void main(String[] args) {
        for(int i = 5;i>=0;i--){
            for(int j = 1;j<=i*2-2 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
