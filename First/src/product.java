
public class product {
 private String name;
 private Double price;
 private int count;
 public product(String name , Double price , int count){
	 this.name = name;
	 this.price = price ;
	 this.count = count;
	 
 }
 public void setName(String name){
	 this.name = name;
 }
 public void setPrice(Double price){
	 this.price = price;
 }
 public void setCount(int count){
	 this.count = count;
 }
 public String getName(){
	 return name;
 }
 public Double getPrice(){
	 return price;
 }
 public int getCount(){
	 return count;
 }
 
}
