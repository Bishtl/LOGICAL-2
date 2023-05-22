/*
 
12
1234
123456
12345678
12345678910


 */


public class Solution61 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=2*i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
