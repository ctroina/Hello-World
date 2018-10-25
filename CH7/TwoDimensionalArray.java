package CH7;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int[][] multiply=new int[13][13];
        for(int i=1;i<multiply.length;i++){
            for(int ii=1;ii<multiply[0].length;ii++){
                multiply[i][ii]=(i)*(ii);
            }
        }
        for(int i=1;i<multiply.length;i++){
            for(int ii=1;ii<multiply[0].length;ii++){
                System.out.print(multiply[i][ii]+"\t");
            }
            System.out.println();
        }
    }
}
