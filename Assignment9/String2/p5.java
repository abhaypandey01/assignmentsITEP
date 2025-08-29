class Sequence{
	private String str;
	
	public Sequence(){}

	public Sequence(String str){
		this.str = str;
	}

	public int equalOrNot(String str2){
		int sum = 0;
		int sum2 = 0;
		char ch[] = str.toCharArray();
		char ch2[] = str2.toCharArray();

		if(str2.isEmpty() || str.length() != str2.length()) return Integer.MIN_VALUE;
		
		for(int i = 0; i < str.length(); i++){
			sum+= ch[i];
			sum2+=ch2[i];
		}
		return sum - sum2;
	}
}

class Test{
	public static void main(String args[]){
		Sequence seq = new Sequence("Hellos");
		int result = seq.equalOrNot("");
		System.out.println(result);
	}
}