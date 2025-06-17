public class GCD {
    public static void main(String[] args) {
        int n1=6;
        int n2=2;
        int hcf=gcd(n1,n2);
        int lcm=lcm(n1,n2,hcf);
        System.out.println(hcf);
        System.out.println(lcm);

    }
    static int gcd(int n1,int n2){
        if(n1==0){
            return n2;
        }
        return gcd(n2%n1,n1);
    }
    static int lcm(int n1,int n2,int hcf){
        return (n1*n2)/hcf;
    }
}
