class a implements Runnable{
    public void run()
    {
        System.out.println("Hello I'm Thread");
    }
}
public class Implementingrunnableinterface{
    public static void main(String[]args){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}