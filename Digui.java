public class Digui{
	public static void main(String[] args){
        Digui dg  = new Digui();
		int i = dg.digui(100);
		System.out.println(i);
	}
	public int digui(int x){
		if(x == 1){
			return 1;
		}
		return x + digui(x-1);
	}
}