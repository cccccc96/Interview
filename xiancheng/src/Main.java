class ParityPrinter {
    private int max=100;
    private int number = 1;

    private boolean odd = true;

    public synchronized void printOdd(){
        while(number<100){
            while (!odd){
                try {
                    wait();
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName()+":"+number);
            number++;
            odd = false;
            notify();
        }
    }
    public synchronized void printEven(){
        while(number<100){
            while (odd){
                try {
                    wait();
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName()+":"+number);
            number++;
            odd = true;
//            notify();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ParityPrinter printer = new ParityPrinter(); // 创建两个线程，分别传入不同的 Runnable 对象
        Thread t1 = new Thread(printer::printOdd); Thread t2 = new Thread(printer::printEven);
// 启动两个线程
        t1.start();
        t2.start();
    }
}