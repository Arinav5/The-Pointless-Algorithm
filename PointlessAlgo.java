public class PointlessAlgo {
        public static void main(String[] args) throws InterruptedException {
            String [] bars = {"|", "|", "|", "|", "|"};
            String l1 = "   | ";
            String l2 = "  || ";
            String l3 = " ||| ";
            String l4 = "|||| ";

            String ll1 = "  |  ";
            String ll2 = " ||  ";
            int counter = 0;
            int count = 5;
            int n = 2;
            while (n > 0){
                counter = 5 - count -1;
                for (int j = 0; j < counter; j++){
                    System.out.print(" ");
                }
                for (int i = 0; i < count; i++) {
                    System.out.print(bars[i]);
                    Thread.sleep(200);
                }
                count--;
                System.out.print("\b\b\b\b\b");
                Thread.sleep(200);
                if (count == 4){
                    System.out.print(l1);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                    System.out.print(l2);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                    System.out.print(l3);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                    System.out.print(l4);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                }
                if (count == 2){
                    System.out.print(ll1);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                    System.out.print(ll2);
                    Thread.sleep(200);
                    System.out.print("\b\b\b\b\b");
                }
                count--;
                System.out.print("\b\b\b\b\b");
                Thread.sleep(200);
                n--;
            }
            System.out.print("\b\b");
            Thread.sleep(200);
            System.out.print("  ");
            for (int i = 0; i < count; i++) {
                System.out.print(bars[i]);
                System.out.print("  ");
                Thread.sleep(200);
            }
        }

}
