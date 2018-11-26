package strings;

public class Essay {

	String name;
	String essay;
	
	public Essay(){
		
	}
	
	public void name(String nombre){
		name = nombre;
	}
	
	public void text(String text){
		essay = text;
	}
	
	public String findLastName(){
		int i;
		String lastNameP = "";
		for(i = 0; i < name.length(); i++){
			if(name.charAt(i) == ' '){
				lastNameP = name.substring(i+1);
				}
		}
		return lastNameP;
	}
	
	public int firstNameChar(){
		int i;
		String firstNameP = "";
		for(i = 0; i < name.length(); i++){
		if(name.charAt(i) == ' '){
			firstNameP = name.substring(0, i);
		}
		}
		
		int num = firstNameP.length();
		return num;
	}
	
	public void containsX(){
		String firstNameP = "";
		int count;
		int x = 0;
		for(count = 0; count < firstNameP.length(); count++){
			if(firstNameP.charAt(count) == 'X'){
				x++;
			}
		}
		if(x>0){
			System.out.println("Name does contain X");
		} else {
			System.out.println("Name does not contain X");
		}
	}
	
	public int essayLength(){
		int j;
		int words = 0;
		for(j = 0; j < essay.length() ; j++){
			if(essay.charAt(j) == ' '){
				words++;
			} else if(j == essay.length() - 1){
				words++;
			}
		}
		int inc = words;
		return inc;
	}
}
