import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class PercolationStats extends Percolation{
   private int n; private int trials;
   public PercolationStats(int n, int trials){
      if(n<=0||trials<=0) throw java.lang.IllegalArgumentException;
      n=this.n;
      trials=this.trials;
   }    // perform trials independent experiments on an n-by-n grid
   
   public double mean() {return edu.princeton.cs.algs4.StdStats.mean(a);}                   // sample mean of percolation threshold
   public double stddev() {return edu.princeton.cs.algs4.StdStats.stddev(a);}      // sample standard deviation of percolation threshold
   public double confidenceLo(){return mean()-((1.96*stddev())/ sqrt(trials));}                  // low  endpoint of 95% confidence interval
   public double confidenceHi(){return mean()+((1.96*stddev())/ sqrt(trials));}                  // high endpoint of 95% confidence interval

   public static void main(int n, int T){
   
   private int []a= new int [T];
   for(int i : T){
      Percolation p=new Percolation(n); //declare percolation variable(according to command-line arguments)
      private int count;
      while(!percolates){
         open(edu.princeton.cs.algs4.StdRandom.cauchy(n-1));
         count=p.count;
         }  //perform n times using methods from previous class
         a[i]=count;
   }//count until percolation and insert into array
  
    PercolationStats ps=new PercolationStats(n, T);//declare percolation stats(according to command-line arguments)
      system.out.println(mean(a)+" "+stddev(a)+" " +confidenceLo()+" " + ConfidenceHi()));
      
   }
      
   }    
}
