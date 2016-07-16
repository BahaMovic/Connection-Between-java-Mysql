
import java.util.Arrays;

public class Stack_Queue {
	
	private String[] StackArray;
	private int StackSize;
	private int TopOfStack = -1;
	public Stack_Queue(int x){
		StackSize=x;
		StackArray = new String[StackSize];
		Arrays.fill(StackArray,"-1");
	}
	public void push(String s){
		if(TopOfStack<StackSize){
			TopOfStack++;
			StackArray[TopOfStack]= s;
		}
	}
	public void Pop(){
		if(TopOfStack >-1){
			StackArray[TopOfStack]="-1";
			TopOfStack--;
		}
	}
	public void ShowStack(){
		for(int i = 0 ; i<StackSize ; i++){
			System.out.print(StackArray[i]+" : ");
		}
		System.out.println();
	}
	public void AddMultiValues(String multi){
		String Array[] = multi.split(" ");
		for(int i =0 ; i<Array.length;i++){
			push(Array[i]);
		}
	}
	public void popAll(){
		for(int i = TopOfStack ; i>=0 ; i--){
			Pop();
		}
	}
	public static void main(String[] arga){
		Queue x = new Queue(10);
		x.Push("Bahaa");
		x.Push("Ahmed");
		x.AddMulti("Bahaa Alaa Diaa Doha Baba Mama");
		
		x.ShowQueue();
		x.Pop();
		x.ShowQueue();
		x.Push("Mostafa");
		x.ShowQueue();
	}

}
