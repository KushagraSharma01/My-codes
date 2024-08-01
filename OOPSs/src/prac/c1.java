package prac;
public class c1 {
	public class c2{
		static int i = 0;
		
		//constructor
		public c2()throws Exception{
			i++;
			if(i>2)
				throw new Exception("can't make more than two instances");
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//object of c1 first
		c1 obj = new c1();
		
		//first object of c2
		c2 obj1 = obj.new c2();
		
		//second object of c2
		c2 obj2 = obj.new c2();
		
		//third object of c2
		c2 obj3 = obj.new c2();
		
		System.out.println("Success");
	}

}
