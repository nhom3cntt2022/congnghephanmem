package quanlycasi;
import java.util.ArrayList;
import java.util.List;
/** 
*
* lop nay dung de quan ly ca si
* 
*/
public class Singer implements Subject {
	
	  List<Observer> followers;
	  String latestSong;
	 
		/** 
		 *
		 * khoi tao lop ca si. 
		 *
		 * 
		 * 
		 */
	  //khoi tao lop ca si
	    public Singer() { 

	        followers = new ArrayList<>();
	    }
	    
	    @Override

	/** 
	 *
	 * It is a constructor. 
	 *
	 * @param addObserver them Observe vao danh sach followers
	 * 
	 */
	    
	    // them doi tuong nguoi theo doi vao lop ca si 
	    public void addObserver(Observer observer) { 

	        followers.add(observer);
	    }
	    
	    @Override

	/** 
	 *
	 * It is a constructor. 
	 *
	 * @param removeObserver - xoa observer khoi danh sach followers
	 */
	    //xoa mot nguoi theo doi khoi lop ca si
	    public void removeObserver(Observer observer) { 

	        followers.remove(observer);
	    }
	    
	    @Override

	/** 
	 *
	 * It is a constructor. 
	 *
	 * @param notifyObservers thong bao bai hat moi cua ca si
	 */
	    //thong bao bai hat moi nhat cua ca si - cap nhat cho lop follower nguoi theo doi
	    public void notifyObservers(String songName) { 

	        latestSong = songName;
	        for (Observer follower : followers) {
	            follower.update(songName);
	        }
	    }
	    

	/** 
	 *
	 * tra ve bai hat moi nhat cua ca si 
	 * 
	 */
	    //tra ve bai hat moi nhat cua ca si
	    public String getLatestSong() { 

	        return latestSong;
	    }
	    

	/** 
	 *
	 * hien thi ten bai hat duoc hat boi ca si
	 *
	 * 
	 */
	    // ham hien bai dat moi nhat, va goi ham thong bao
	    public void sing(String songName) { 

	        System.out.println("Singer is singing " + songName);
	        notifyObservers(songName);
	    }
	    
	   
}
