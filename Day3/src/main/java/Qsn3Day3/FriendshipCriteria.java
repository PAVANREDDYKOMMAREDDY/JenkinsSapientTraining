package Qsn3Day3;
public class FriendshipCriteria<T,S> implements Comparable<FriendshipCriteria>{
   private T t;
   private S s;

   public void add(T t) {
      this.t = t;
   }

   public T getT() {
      return t;
   }
   public S getS() {
	      return s;
	   }

   

public boolean FriendFinder(FriendshipCriteria that) {
	// TODO Auto-generated method stub
	if(this.t== that.t && this.s==that.s) return true;
	return false;
}

public int compareTo(FriendshipCriteria o) {
	// TODO Auto-generated method stub
	return 0;
}


}