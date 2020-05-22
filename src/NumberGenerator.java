public class NumberGenerator implements Runnable{
    private int number;

    public NumberGenerator(int number){
        this.number=number;
    }

    @Override
    public void run() {
        for (int i=0;i<number;i++){
            System.out.println(i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
