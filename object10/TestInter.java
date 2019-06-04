package code_day10;
import java.util.*;
class Singer implements Comparable<Singer>{
	String name;
	double averageScore;
	public Singer(){}
	public Singer(String name,double averageScore){
		this.name = name;
		this.averageScore = averageScore;
	}
	public int compareTo(Singer s){
		if (this.averageScore < s.averageScore) return -1;
		else if(this.averageScore > s.averageScore) return 1;
		else return 0;
	}
}
class TestSinger{
	public static void main(String[] args){
		Singer[] a = new Singer[]{
			
		}
		
	}
}