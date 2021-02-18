package coredemo;

public class OddEven {

	public static void main(String[] args) {
		int i=1;
		System.out.println("odd\teven");
		while(i<=10) {
			if(i%2 ==1){
				
				System.out.print(i+"\t");
				
			}
			else {
				System.out.println(i);
			}
			i=i+1;
			}
		}

	}


