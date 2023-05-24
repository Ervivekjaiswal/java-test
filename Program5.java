public class Program5 {
    public static void main(String[] args) {
        int n=1;
        while(n<=500){
            if(n%7==0){
                int temp=n%10;
                if(temp==7){
                    System.out.println(n+" is divided by  7 and also end with 7 ");
                }
            }
            n++;
        }
    }
    
}
