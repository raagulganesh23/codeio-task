package Week2;

import java.util.zip.ZipEntry;

public class Count {
    public static void main(String[] args){
        int [] arr = {5, -3, 0, 12, -9, 0, 7};
        int positiveValue=0;
        int negativeValue=0;
        int zeroValue=0;
        for (int i:arr){
            if (i>0){
                positiveValue=positiveValue+1;
            } else if (i<0) {
                negativeValue=negativeValue+1;
            }
            else{
                zeroValue=zeroValue+1;
            }

        }
        System.out.println("No of Postive values = "+positiveValue);
        System.out.println("No of Negative values = "+negativeValue);
        System.out.println("No of Zero values = "+ zeroValue);
    }

}
