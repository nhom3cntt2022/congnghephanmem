package quanlycasi;
/** 
*
* interface nay de quan ly cau truc Subject 
* 
*/
//tao interface Subject voi 3 phuong thuc con - cac lop ke thua se co 3 phuong thuc
public interface Subject {
	void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String songName);
}


