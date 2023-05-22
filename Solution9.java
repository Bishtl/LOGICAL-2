// Sort the givern array

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Solution9 {
    public static void main(String[] args) {
        int[] a  ={32,45,23,12,5,7};
        int temp;
       for(int i = 0 ; i<a.length;i++){
        for(int j = 0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
            }
        }
       }
       for(int i = 0; i<a.length ; i++){
        System.out.println(a[i]);
       }
    }
}
