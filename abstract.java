package Methods;

abstract class principle {
	
	abstract void welcome();
}

class teacher extends principle {

	@Override
	void welcome() {
		System.out.println("Welcome Teacher to our fort...");
		}
	}

class student1 extends principle {

	@Override
	void welcome() {
		System.out.println("Welcome Student  to our home...");
		}
	}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*teacher t1=new teacher();
   t1.welcome();
   student s1=new student();
   s1.welcome();*/
   
   principle[] p1=new principle[4]; 
   p1[0]=new teacher();
   p1[1]=new teacher();
   p1[2]=new student1();
   p1[3]=new student1();
	
   	
   for (principle v: p1) {
	   v.welcome();
	   }
   }

}
