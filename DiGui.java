public class DiGui{
	public static void main(String[] args){
		//µ›πÈ∑Ω Ωº∆À„1+2+3+4+...+100
		DiGui di = new DiGui();
		int i = di.diGui(100);
		System.out.println(i);
		
	}
	public int diGui(int x){
		if(x == 0){
			return 0;
		}
		if(x == 1){
			return 1;
		}
		return x + diGui(x-1);
	}
}