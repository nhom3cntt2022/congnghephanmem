package quanlycasi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
/** 
*
* lop nay dung de test chuc nang quan ly ca si
* Singer Test lop nay dung de quan ly ca si
*/
public class SingerTest extends TestCase {	
	//test lop Singer
public	void testSinger()
	{
				Singer sg=new Singer();
	}
	// ham nay dung de test ham  AddObserver
	void testAddObserver() {
		Singer sg=new Singer();
		Follower fl=new Follower("Nguoi theo doi 01");
		sg.addObserver(fl);		
	}
	// ham nay dung de test ham  removeObserver cua lop singer
	void testremoveObserver() { 
		Singer sg=new Singer();
		Follower fl1=new Follower("Nguoi theo doi 01");
		sg.addObserver(fl1);
		sg.removeObserver(fl1);
       
    }
	// ham nay dung de test  notifyObservers cua lop singer
	void testnotifyObservers() { 
		Singer sg=new Singer();
		sg.notifyObservers("hello ! song name");
       
    }
	//ham nay dung de test  notifyObservers cua lop singer
	void testgetLatestSong() { 
		Singer sg=new Singer();
		sg.notifyObservers("hello ! song name");
      // String str_2022=sg.getLatestSong();
      // System.out.println("hello: "+str_2022.toString());
    }	
	// ham nay dung de test ham sing cua lop Singer
	void testsing() { 
		Singer sg=new Singer();
		sg.sing("con con be be") ;   
    }
	
}
