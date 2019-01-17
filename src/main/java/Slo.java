public class Slo extends Thread {

    private String name;
    Object lock;

    public Slo(String name) {
        this.name= name;
    }

    @Override
    public void run() {

        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(name + "运行  :  " + i);
                try {
                    sleep((int) Math.random() * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

        public static void main(String[] args) {
            Slo mTh1 = new Slo("A");
            Slo mTh2 = new Slo("B");
            mTh1.start();
            mTh2.start();
        }

}
