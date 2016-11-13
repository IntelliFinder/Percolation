import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
    parent=new private int[];   // parent[i] = parent of i
    size=new private int[];
	count=new private int; 
	docu=new private int[];
   WeightedQuickUnionUF uf= new WeightedQuickUnionUF;//n=sites percolated to first row; n+1= sites percolated to last row
   public Percolation(int n){
  	this.size=size;
	this.parent=parent;
        this.uf=WeightedQuickUnionUF(n+2);
	this.docu=docul;
	this.count=count;;
      
      //use of imported packages

   }                // create n-by-n GRID, with all sites blocked, +two nodes
   public void open(int row, int col) {
     if(!isOpen)
     	{//4 union ops sependent on isOpen false
	   uf.union(n*(row-1)+column-1, n*(row)+column-1);
	   uf.union(n*(row-1)+column-1,n*(row-1)+column);
	   uf.union(n*(row-1)+column-1,n*(row-1)+column-2);
	   uf.union(n*(row-1)+column-1, n*(row-2)+column)-1;
     	docu[n*(row-1)+column-1]=1;}
	   //documentation
     if(count<3){
	    for(int i in n) 
	     uf.union(n+1, n*(n-1)+i-1); //precision crucial (n+1 for the last row/n for first row)
	     uf.union(n, i-1);
     } //initialize 1st and last sites with n previous
   }      // open site (row, col) if it is not open already
   public boolean isOpen(int row, int col) {
   if(docu[n*(row-1)+column-1]!=1)
	   return false; 
	   else 
	   	return true;//connection to adjacent spaces x
	   //separate array of documentation{{
   } 
	// is site (row, col) open?
	//prevents "reopening" already opened spaces
   public boolean isFull(int row, int col){
      return uf.connected(n, ((n*(row-1))+col-1));//if has path to top row-check
   //consider square shape to recursively recognize bordering sites
   }  // is site (row, col) full?
    /* does the system percolate? 
    Create an alias for the bottom and top rows so connected to single site*/
   public boolean percolates(Percolation p) {
      if(!p.uf.connected(n, n+1)){
        return true;
      }	else return false;

   }
   public static void main(String[] args){//not completed
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
