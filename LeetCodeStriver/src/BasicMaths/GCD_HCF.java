package BasicMaths;

public class GCD_HCF {
    static int hcf(int n1,int n2){
        int hcf=1;
        for (int i=1;i<=Math.min(n1,n2);i++){
            if((n1%i==0)&&(n2%i==0)){
                hcf=i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        System.out.println("the hcf og 9 and 12 is "+ hcf(9,12));
    }
}
