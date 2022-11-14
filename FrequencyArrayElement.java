public class FrequencyArrayElement {
    public static void main(String[] args) {
        int[] b = {10,40,10,60,40,70,50};
        for (int i = 0; i<b.length; i++) {
            int x = b[i];
            int count = 0;
            
            if(x == -1)continue;
            for (int j=0; j<b.length; j++) {
                if (b[j] == x) {
                    count++;
                    b[j] = -1;
                }
            }
            System.out.println("Frequency of " +x+ " is" +count);
        }
    }
}
