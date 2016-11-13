import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
    parent=new private int[];   // parent[i] = parent of i
    size=new private int[];
    count=new private int; 
   WeightedQuickUnionUF uf= new WeightedQuickUnionUF;//n=sites percolated to first row; n+1= sites percolated to last row
   public Percolation(int n){
  		this.size=int[n+2];
	  this.parent=int[n+2]
      this.uf=WeightedQuickUnionUF(n+2);

      
      //use of imported packages

   }                // create n-by-n GRID, with all sites blocked, +two nodes
   public void open(int row, int col) {
     if(!isOpen){//4 union ops sependent on isOpen false
	   uf.union(n*(row-1)+column, n*(row)+column);
	   uf.union(n*(row-1)+column,n*(row-1)+column+1);
	   uf.union(n*(row-1)+column,n*(row-1)+column-1);
	   uf.union(n*(row-1)+column, n*(row-2)+column);}
	   
      //initialize 1st and last sites with n previous
   }      // open site (row, col) if it is not open already
   public boolean isOpen(int row, int col) {
   if()//connection to adjacent spaces
   } 
	// is site (row, col) open?
	//prevents "reopening" already opened spaces
   public boolean isFull(int row, int col){
      uf.connected(n, ((n*(row-1))+col))//if has path to top row-check
   //consider square shape to recursively recognize bordering sites
   }  // is site (row, col) full?
    /* does the system percolate? 
    Create an alias for the bottom and top rows so connected to single site*/
   public boolean percolates(Percolation p) {
      if(!p.uf.WeightedQuickUnionUF.connected(1, n+1)){
        return true;
      }else return false;

   }
   public static void main(String[] args){
   Percolation p= new Percolation(StdRandom+1);//check call for StdRandom
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
