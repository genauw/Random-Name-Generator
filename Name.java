public class Name{
	
	String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		
	public String randyAlph(){
		return alph[(int)(Math.random() * alph.length)];
	}	
	
	
	public void generate(int y){
		for(int x = 0; x < y; x++){
			System.out.print(randyAlph());
		}
	}
}