public class Main {
    public static void main(String[] args) {
        int[] a = {1,213,1,23,5,6};
        int average = CalculateAverage(a);
        System.out.println(average);
        int max = CalculateMax(a);
        System.out.println(max);
    }
    public static int CalculateAverage(int[] a){
        int score = 0;
        for (int i = 0; i < a.length ; i++)
            score += a[i];
        score/=a.length;
        return score;
    }
    public static int CalculateMax(int[] values){
        int max = 0;
        int left= 0;
        for(int i = 1; i < values.length ; i++){
            if(values[i] > max)
                max = values[i];

            left+=1;
        }
        return max;
    }

    public static int CalculateMin(int[] values){
        int min = 0;
        int left= 0;
        for(int i = 1; i < values.length ; i++){
            if(values[i] < min )
        return min;
    }
}
