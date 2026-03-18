public class Main {
    public static void main(String[] args) {
        int[] a = {1,213,1,23,5,6};
        int average = CalculateAverage(a);
        System.out.println(average);
    }
    public static int CalculateAverage(int[] a){
        int score = 0;
        for (int i = 0; i < a.length ; i++)
            score += a[i];
        score/=a.length;
        return score;
    }
}
