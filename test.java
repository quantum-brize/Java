class MyThreadRunnable1 implements Runnable{
    public float num = 2.0f;
    MyThreadRunnable1(String name){
        System.out.println(name+" is my name.");

    }
    MyThreadRunnable1(Runnable r){
        System.out.println(r);
    }


    @Override
    public void run(){
        System.out.println(num+" it 's Thread run Method");
    }
}

class MyThread extends Thread{
    MyThread(int num){
        System.out.println(num+ " is the number of o/p");
    }

    @Override
    public void run(){
        
    }

}

public class test {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1("arijit");
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyThread m = new MyThread(6969);
        m.start();
       
    }
}
