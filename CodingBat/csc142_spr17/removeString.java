package csc142_spr17;

public class removeString {
	public static void main(String[] args){
		System.out.println(removeString("This is a FISH", "IS"));
	}
	
	public static String removeString(String start, String target) {
		String[] foo = start.split("\\s+");
		for(int x = 0; x < foo.length; x++) if( foo[x].toLowerCase().contains(target.toLowerCase())) 
			  foo[x] = foo[x].replace(target.toLowerCase(), "");
		StringBuilder sb = new StringBuilder();
		for(String s : foo) if(s.isEmpty()) continue; else sb.append(s + " ");
		  return sb.toString().replaceAll("\\s+$", "");
		}
}