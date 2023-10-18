public class objectLife {
    String name="sumadeep";

    public void introduce(){
        System.out.println("My name is "+name);
    }

    public static void main(String[] args) {
        objectLife p1=new objectLife();
        p1.introduce();
    
        p1=null;

        System.gc();

        //p1.introduce();
    
    }

    
}

