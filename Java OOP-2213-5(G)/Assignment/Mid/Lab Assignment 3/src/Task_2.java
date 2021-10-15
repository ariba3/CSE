import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();

        SeriesPrinter series = new SeriesPrinter();
        series.printSeries(n);

        int start = input.nextInt();
        int end = input.nextInt();
        series.printSeries(start,end);

        int start1 = input.nextInt();
        int end1 = input.nextInt();
        int interval = input.nextInt();
        series.printSeries(start1,end1,interval);
        input.close();

    }
    
}


















