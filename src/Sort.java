public class Sort {
    int[] unsorted;
    int[] sorting;
    static final int BUBBLE_SORT=1;
    static final int SELECTION_SORT=2;
    int count=0;
    int sort_type;
    public Sort(int[] unsorted, int sort_type){
        this.unsorted=unsorted;
        this.sorting=unsorted;
        this.sort_type=sort_type;
    }

    public int[] selectionSort(){
        int l=-1;
        int loc=0;
        for(int i=count;i<unsorted.length;i++){
            if(l==-1 || l>unsorted[i]){
                l=unsorted[i];
                loc=i;
            }
        }
        System.out.println(l);
        int temp=sorting[count];
        sorting[count]=l;
        sorting[loc]=temp;
        int arr[]=new int[unsorted.length];
        for(int i=0;i<unsorted.length;i++){
            if(i<=count){
                arr[i]=sorting[i];
            }
            else{
                arr[i]=unsorted[i];
            }
        }
        count++;
        return arr;

    }

    public int[] bubbleSort(){
        if (count<=sorting.length) {
            int min = 0;
            int minloc = 0;
            for (int i = sorting.length - count - 1; i >= 0; i--) {
                if (sorting[i] < min || min == 0) {
                    min = sorting[i];
                    minloc = i;
                }
            }
            int temp = sorting[sorting.length - count - 1];
            for (int i = sorting.length - count; i > minloc; i--) {
                int omg = sorting[i - 1];
                sorting[i - 1] = temp;
                temp = omg;
            }
            sorting[sorting.length - count - 1] = min;
            count++;
        }
        if(count>=sorting.length){
            int temp=sorting[count-sorting.length];
            sorting[count-sorting.length]=sorting[2*sorting.length-count-1];
            sorting[2*sorting.length-count-1]=temp;
            count++;
        }
        return sorting;

    }

    public boolean checkSort(int[] arr){
        boolean out=true;
        for(int i=0; i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                out=false;
            }
        }
        return out;
    }

    public int[] sort(){
        switch(sort_type){
            case BUBBLE_SORT:
                return bubbleSort();

            case SELECTION_SORT:
                return selectionSort();

            default:
                System.out.println("an error occoured");

        }
        return null;
    }

}
