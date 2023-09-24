package lec_2;

public class person_client {

	public static void main(String[] args) {
		person p=new person("kunal",24);
//		p.name="kaju";
//		p.age=23;
		p.SetName("priya");
		System.out.println(p.getAge());
		p.fun();
		person p1=new person("komal",22);
//		p1.name="raju";
//		p1.age=20;
		p1.fun();
	}
}


//name--->null->kirti->kunal->kaju
//age---->0->21->24->23
