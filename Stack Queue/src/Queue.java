import java.util.Arrays;

public class Queue {
	private int TopOfQueue = -1;
	private String[] QueueArray ;
	private int SizeOfQueue;
	public Queue(int x){
		SizeOfQueue = x;
		QueueArray = new String[SizeOfQueue];
		Arrays.fill(QueueArray, "-1");
	}
	public void Push(String add){
		if(TopOfQueue<SizeOfQueue){
			TopOfQueue++;
			QueueArray[TopOfQueue]= add;
		}
	}
	public void Pop(){
		for(int i = 0; i< TopOfQueue ; i++){
			QueueArray[i]= QueueArray[i+1];
		}
		QueueArray[TopOfQueue] = "-1";
		TopOfQueue--;
		
	}
	public void ShowQueue(){
		for(int i=0 ; i<SizeOfQueue;i++){
			System.out.print(" : "+QueueArray[i]+" : ");
		}
		System.out.println();
	}
	public void AddMulti(String Multi){
		String[] add= Multi.split(" ");
		for(int i =0 ;i<add.length;i++){
			Push(add[i]);
		}
	}

}
