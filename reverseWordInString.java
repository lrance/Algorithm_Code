import java.util.Stack;
/*
leetCode新题，但是比较简单，直接用栈即可
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/
public class reverseWordInString{
	
	public static String reverseString(String str){
		String[] spl = new String[str.length()];
		spl = str.split("\\s+");
		Stack<String> sa = new Stack<String>();
		for(String ss : spl){
			sa.push(ss);
		}
		StringBuffer sb = new StringBuffer();
		while(!sa.isEmpty()){
			sb.append(sa.pop()).append(" ");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		String str = "this is my dog yu xiao yu";
		System.out.println("this is add: " +reverseString(str));
	}
	
	
}