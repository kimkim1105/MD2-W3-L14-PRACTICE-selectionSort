public class SelectionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        int cnt =0;
        for (int i = 0; i < list.length-1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1;j< list.length;j++){
                if (currentMin>list[j]){1
                    currentMin=list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            cnt = cnt +1;
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
    }
}
