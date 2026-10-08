package Levelnxt;

public class Namestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        String txt[] = {"Sakthi", "vettri", "hari"};

		        for (int i = 0; i < txt.length; i++) {

		            char ch[] = txt[i].toLowerCase().toCharArray();

		            
		            for (int j = 0; j < ch.length - 1; j++) {
		                for (int k = j + 1; k < ch.length; k++) {

		                    if (ch[j] > ch[k]) {
		                        char temp = ch[j];
		                        ch[j] = ch[k];
		                        ch[k] = temp;
		                    }
		                }
		            }

		            System.out.println((i + 1) + "," + new String(ch));
		        }
		    }
		
	}


