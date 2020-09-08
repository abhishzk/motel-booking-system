package myapp;
class Room{
 	private int numb;
 	private String type;
 	public Room(int n,String t){
 		numb=n; type=t;}
 	public String toString(){
 		return " Type : "+type + ", Room Number : "+numb;
 	}
}