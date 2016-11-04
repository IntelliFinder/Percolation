import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
   
   public Percolation(int n){
      this.parent=new private int[];   // parent[i] = parent of i
      this.size=new private int[];
      this.count=new private int; 
      this.uf=new WeightedQuickUnionUF(n+2);

      
      //use of imported packages

   }                // create n-by-n GRID, with all sites blocked, +two nodes
   public void open(int row, int col) {
      // 4 union ops
      // use of array(not matrix) for comparison of adjacent sites on matrix
      //dependent on isOpen=true
      //loop dependent on isFull=false for efficiency
      //initialize 1st and last sites with n previous
   }      // open site (row, col) if it is not open already
   public boolean isOpen(int row, int col)  // is site (row, col) open?
   public boolean isFull(int row, int col){
      !p.uf.WeightedQuickUnionUF.connected(1, (row)*(col+1))//if has path to top row-check
   //consider square shape to recursively recognize bordering sites
   }  // is site (row, col) full?
    /* does the system percolate? 
    Create an alias for the bottom and top rows so connected to single site*/
   public boolean percolates(Percolation p) {
      if(!p.uf.WeightedQuickUnionUF.connected(1, n)){//not sure if correct call
     
         
      }

   }
   public static void main(String[] args){
   Percolation p= new Percolation(StdRandom);//check call for StdRandom
   boolean pc=percolates(p);
   while(!pc){
      //open sites recursively
         //use of StdRandom
      //check isFull recursive
      pc=perculates(p);//call again
   }
      
      int count=p.count;//amount of opened sites to get perculation
   }   // test client (optionPercolational)
}
