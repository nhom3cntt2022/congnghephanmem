package quanlycasi;
import java.util.ArrayList;
import java.util.List;
/**
  * lop Follower nguoi dang ky hien thuc tu Observer
 */
public class Follower implements Observer {
	/** *
	  * 
	  *
	  * 
	  * @param name  the name ten nguoi theo doi
	  */
String name;    

	 
//khoi tao lop Follower nguoi theo doi voi 1 tham so la ten nguoi theo doi
public Follower(String name1) { 

	         this.name = name1;
}
	     
	     

	 /** 
	  *
	  * update in ten nguoi theo doi va bai hat
	  *
	  *  
	  */
// hien thi ten nguoi theo doi va bai hat
 public void update(String songName) { 
	 
	         System.out.println(name + " is listening to " + songName);
 }

}
