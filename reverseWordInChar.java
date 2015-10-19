import java.util.Stack;

public class reverseWordInChar{
	public static String reverseStart(String str){
		char[] arr = str.toCharArray();
		Stack sta = new Stack();
		for(char newcha: arr){
			sta.push(newcha);
		}
		//char[] arr_new = new char[str.length()];
		//int i = 0;
		StringBuffer sb = new StringBuffer();
		while(!sta.isEmpty()){
			try{
			//compile wrong since two has different type	
			//arr_new[i++] = sta.pop();
			  sb.append(sta.pop());
			}catch(Exception e){
				System.err.println(e);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		String str = "abcdefghijklmn";
		System.out.println("the reverse word: "+reverseStart(str));
	}
}