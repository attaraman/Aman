package test;

public class StringEqualsOperation {
	public static void main(String[] args) {
		String st="te,st1";
		String st1="test1";
		String st3=st1;
		String st4= new String("test1");
		
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st3==st1);
		System.out.println(st4==st1);
		System.out.println(st4.equals(st1));
		st.concat("abc");
		st.replace("t", "");
		System.out.println(st.replace("t", "a"));
		String[] arr= st.split(",");
		System.out.println(arr);
	    	
	}
}
