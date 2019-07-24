
//imports scanner
import java.util.Scanner;

class Shoesinventory extends Inventory2{
//Declares variables that will be used.
int num;
int array;


}


class Inventory2{
  public static void main(String args[]){

//This line is to read input
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of shoes that will be put in storage(1-10) ");
int num=sc.nextInt();

//declare array
int array[]=new int[num];

System.out.println("Enter quantity: ");

for(int i=0;i<array.length;i++){
  array[i]=sc.nextInt();
}

//Prints out the numbers that are added to inventory.
System.out.println("These have been added to the inventory");
//prints array that user types.
printarray(array);

sc.close();

}
public static void printarray(int arr[]){

  int a=arr.length;

  for(int i=0;i<a;i++){
    System.out.print(arr[i] + " ");
  }
}



}
