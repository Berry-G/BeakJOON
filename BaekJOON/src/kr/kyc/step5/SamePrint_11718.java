package kr.kyc.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SamePrint_11718 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] sentence;
		 while ((sentence = br.readLine()) != null) {
	            if (sentence.length() == 0) {
	                break;
	            }
	            StringTokenizer st = new StringTokenizer(sentence);
	            int A = Integer.parseInt(st.nextToken());
	            int B = Integer.parseInt(st.nextToken());
	            String result = Integer.toString(A + B) + "\n";
	            bw.write(result);
	        }
	        bw.close();
	    }
	}
}
