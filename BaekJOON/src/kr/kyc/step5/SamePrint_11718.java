package kr.kyc.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SamePrint_11718 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String sentence;
		while ((sentence = br.readLine()) != null) {
			if (sentence.length() == 0) {
				break;
			}
			StringTokenizer st = new StringTokenizer(sentence);
			bw.write(sentence);
		}
		bw.close();
	}
}
