/*
 
a
ab
abc
abcd
abcde

 */

public class Solution63 {
    public static void main(String[] args) {
        for(char i='a';i<='e';i++){
            for(char j = 'a';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
