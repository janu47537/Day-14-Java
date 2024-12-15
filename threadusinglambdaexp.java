public class threadusinglambdaexp{
    public static void main(String[]args){
        Runnable r=()->System.out.println("Iam new from java8 version");
        Thread t=new Thread(r);
        t.start();
    }
}