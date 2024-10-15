package list;

public class VerticalMin {

	public static void main(String[] args) {
		
		 int[][]data = { {3, 2, 5},
                 {1, 4, 4, 8, 13},
                 {9, 1, 0, 2},
                 {0, 2, 6, 3, -1, -8}};
 //int[]rowlength = new int[data.length];
 int sum = 0;          
 int MaxColumns=0;
 

 for (int count=0; count<data.length;count++)
 {
     if(MaxColumns < data[count].length)
     {
         MaxColumns= data[count].length;  
     }
 }  

     for (int col=0; col<MaxColumns;col++)
     {
         sum=0;
         
             for (int row=0; row<data.length;row++)
             {                
                 if (col<data[row].length)
                 {
                     sum = sum + data[row][col];                        
                 }
                 
             }
         
         System.out.println("Sum for Column number "+(col+1) +" is: "+sum);
     }
   
	}

}
