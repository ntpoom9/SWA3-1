
public class ObjectPassDemo {
	int a,b;
	
	 ObjectPassDemo(int i,int j){
		 a =i;
		 b=j;
	 }
	 
	 boolean equalTo(ObjectPassDemo o) {
		 return (o.a == a && o.b == b);
	 }
}
