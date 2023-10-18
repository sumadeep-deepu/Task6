public class compilePoly {

    public int add(int a , int b){
        return a+b;

    }

    public int add(int a, int b, int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        compilePoly c=new compilePoly();
       int r1= c.add(2, 4);
        int r2 =c.add(2, 3, 4);
        System.out.println(r1);
        System.out.println(r2);    
    }

    
}
