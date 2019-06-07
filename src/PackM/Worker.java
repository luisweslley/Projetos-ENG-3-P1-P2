package PackM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Worker implements Callable<Double> {
    private int start;
    private int number;
    private  List<String> MatrizA = new ArrayList<String>();
    private  List<String> MatrizB = new ArrayList<String>();
   

    public Worker(int start,int number, List<String> MatrizA,List<String> MatrizB ) {
    	this.start = start;
        this.number = number;
        this.MatrizA = MatrizA;
        this.MatrizB = MatrizB;
    }

    public Double call() {
    	double soma = 0;
        for (int i=0;i<MatrizA.size();i++) {
        
        	
        	if (Integer.valueOf(MatrizA.get(i)) < 0 && number == 1)
        	{
        		soma++;
        		
        	}
        	if (Integer.valueOf(MatrizA.get(i)) > 0 && number == 2)
        	{
        		soma++;
        	}
        	if (Integer.valueOf(MatrizA.get(i)) == 0 && number == 3)
        	{
        		soma++;
        	}
        	
        }
        
        return soma;}   
    }



