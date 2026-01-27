package UD6SET1;

public class arrayDeletionManager {
    private int[] array ;
    private int useful_pos;
    private final int N = 10;


    public arrayDeletionManager(){
        this.array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = 100 + i;
        }
        int useful_pos = 10;
    }

    public void View(){
        for (int i = 0; i < N; i++) {
            System.out.println(array[i] + " | ");
        }
    }

    public void deletePosition(int position){
        int[] other = new int[N];

        if(position >= array.length || position < 0)
            return;

        for (int i = 0, k = 0; i < N; i++) {
            if(i == (position + 1)){
                this.useful_pos = this.useful_pos - 1;
                continue;
            }
            else {
                other[k++] = array[i];
            }
        }

        this.array = other;
    }

}
