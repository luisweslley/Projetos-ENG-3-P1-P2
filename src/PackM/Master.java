package PackM;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
public class Master {
     public static void main(String[] args) throws InterruptedException, ExecutionException, FileNotFoundException, IOException {
       
        ExecutorService tpes =
                Executors.newCachedThreadPool();
   List<List<String>> records = new ArrayList<>();
   List<List<String>> records2 = new ArrayList<>(); 
  
	    //MATRIZ A
	    
	    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Trabalho\\p12A")))
	    {String line;
	     while ((line = br.readLine()) != null)
	    {
	    	 String[] values = line.split("\\s+");
	    	 records.add(Arrays.asList(values));
	    }
	    }
	    
	    catch (IOException e)
	    {
	    	 System.out.println("Algum erro occoreu, pfv tente novamente!");
	    }
        
	    long t1 = System.currentTimeMillis();
            
        
        Future<Double> futures[] = new Future[records.size()];
        
        double series[] = {0,0,0};
       
        for(int j = 1; j <=3;j++)
        {
       
        for (int i = 0; i < records.size(); i++) {
            futures[i] = tpes.submit(new Worker(i,j,records.get(i), null));
        }
        
        for (int i = 0; i < records.size(); i++) {
        	series[j-1] += futures[i].get();
        }
    }
       //MATRIZ B
        
	    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Trabalho\\p12B")))
	    {String line;
	     while ((line = br.readLine()) != null)
	    {
	    	 String[] values = line.split("\\s+");
	    	 records2.add(Arrays.asList(values));
	    }
	    }
	    
	    catch (IOException e)
	    {
	    	 System.out.println("Algum erro occoreu, pfv tente novamente!");
	    }
        
            
        Future<Double> futures2[] = new Future[records2.size()];
        double seriesB[] = {0,0,0};
        
        for(int j = 1; j <=3;j++)
        {
       
        for (int i = 0; i < records2.size(); i++) {
            futures2[i] = tpes.submit(new Worker(i,j,records2.get(i),null));
        }
        
        for (int i = 0; i < records2.size(); i++) {
        	seriesB[j-1] += futures2[i].get();
        }
        }
        
       
        long t2 = System.currentTimeMillis();
        
        System.out.println("Elapsed: " + (t2-t1));
        System.out.println("A quantidade de negativos na Matriz A é: " + series[0] + "\nA quantidade de positivos é: " + series[1] + "\nA quantidade igual a zero é: " + series[2]);
        System.out.println("A quantidade de negativos na Matriz B é: " + seriesB[0] + "\nA quantidade de positivos é: " + seriesB[1] + "\nA quantidade igual a zero é: " + seriesB[2]);
        tpes.shutdown();
    }
    
}

