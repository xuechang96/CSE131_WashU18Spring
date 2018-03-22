package mario;

public class Mario {

	public static void main(String[] args) {
		String d="#";
		for(int i=0;i<5;i++) {
			System.out.println(d);
			d=d+"#";
		}
		
		String s="#####";
		for(int i=0;i<5;i++) {
			System.out.println(s);
			s=s.substring(0,s.length()-1);
		}
		
		String b="#####";
		String a="";
		for (int i=0;i<5;i++) {
			System.out.println(a+b);
			a=a+" ";
			b=b.substring(0,b.length()-1);
		}
		
		String c="    ";
		String f="#";
		for(int i=0;i<5;i++) 
			System.out.println(c+f);
			c=c.substring(0,c.length()-1);
			f=f+"#";
			}
	}


