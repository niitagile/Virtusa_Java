package ForkJoin;

import java.io.*;  
import java.util.concurrent.RecursiveTask;  
import java.util.concurrent.ForkJoinPool;  
  
class SearchWork extends RecursiveTask<Integer>   
{  
  
// member variables  
int arr[];  
int s, e;  
int searchEle;  
  
// Constructor for initialising the member variables   
public SearchWork(int arr[], int s, int e, int searchEle)  
{  
      
this.arr = arr;  
this.s = s;  
this.e = e;  
this.searchEle = searchEle;  
}  
  
@Override  
protected Integer compute()  
{  
  
// Returns the frequency computed by countFreq  
return countFreq();  
}  
  
// A method to return the count of   
// number of times the searched element has occurred  
private Integer countFreq()  
{  
  
// At the beginning,   
// the c is set to 0  
int c = 0;  
  
// iterating using the for loop  
for (int j = s; j <= e; j++)   
{  
  
// if element is present in array  
if (arr[j] == searchEle)   
{  
  
    // Increment the c by 1  
    c = c + 1;  
}  
}  
// return the number of times the searched element  
// has occurred  
return c;  
}  
}  
public class ForkJoinExample   
{  
  
// main  method  
public static void main(String argvs[])  
{  
  
// Custom input array elements  
int arr[] = { 50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99 };  
  
// the element that is to   
// be searched in the arr  
int searchEle = 50;  
  
// assinging values to the   
// starting and ending indices  
int s = 0;  
int e = arr.length - 1;  
  
// Creating an object of the ForkJoinPool class  
ForkJoinPool fjp = ForkJoinPool.commonPool();  
  
// Now creating an object of the SearchWork class  
SearchWork sw = new SearchWork(arr, s, e, searchEle);  
  
// submitting the task to the ForkJoinPool  
int freq = fjp.invoke(sw);  
  
// printing the result  
System.out.println("The number " + searchEle + " is found " + freq + " times. ");  
}  
}  