import java.util.Scanner;
public class IntoToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    //数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String[] number = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	    	String[] boss = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
	    	int k=n;
	    	String ans = "";
	    	if(n==0)return "zero";
	    	
	    	if(k>99999) {
	    		ans += number[k/100000]+th(k)+a(k);
	    		k=k%100000;
	    		if(k!=0) ans += " ";
	    	}
	    	if(k>999){
	    		ans += number[k/1000]+th(k);
	    		k=k%1000;
	    		if(k!=0) ans += " ";
	    	}
	    	if(k>99){
	    		ans += number[k/100]+th(k);
	    		k=k%100;
	    		if(k!=0) ans += " ";
	    	}

	    	int forBoss = k/10;
	    	int forNumber = k%10;
	        if(forNumber==0) ans += boss[forBoss];
	        else if(k>=21 && forNumber!=0) ans += boss[forBoss]+" "+number[forNumber];
	        else ans += number[k];

	        
	    	return ans;
	}
	    static String th(int k){
	    	if(k>99999) {
	    		return " hundred";
	    	}
	    	if(k>999){
	    		return " thousand";
	    	}
	    	if(k>99){
	    		return " hundred";
	    	}
	    	return "";
	    }
	    static String a(int k){
	    	if(k>999){
	    		return " thousand";
	    	}
	    	if(k>99){
	    		return " hundred";
	    	}
	    	return "";
	    }

}