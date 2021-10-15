
public class SeriesPrinter {
	 void printSeries(int n){

	        for(int i=1;i<=n;i++){
	            System.out.print(i+" ");
	        }
	    }

	    void printSeries( int startIndex, int endIndex){

	        for(int i=startIndex;i<=endIndex;i++){
	            System.out.print(i+" ");
	        }
	    }

	    void printSeries(int startIndex, int endIndex, int interval){

	        for(int i=startIndex;i<=endIndex;i=i+interval){
	            System.out.print(i+" ");
	        }
	    }
}






















