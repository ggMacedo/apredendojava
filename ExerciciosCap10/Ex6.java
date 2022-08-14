public class Ex6 {
	public static void main(String[] args) {
		String a="", b="",c="",r="";
		for(int i=0; i<80; i++){
			a=a + "═";
			c+=" ";
		}
		for(int i=0; i<5;i++){
			b+="║"+c+"║\n";
		}
		r="╔"+a+"╗\n"+b+"╚"+a+"╝";
		System.out.print(r);
	}
}