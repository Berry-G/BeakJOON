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
		
		//문장 누적을 위한 객체 생성
		StringBuilder result = new StringBuilder();
		//EOF 검사
		while ((sentence = br.readLine()) != null) {
			if (sentence.length() == 0) {
				break;
			}
			StringTokenizer st = new StringTokenizer(sentence);
			result.append(sentence).append('\n');
		}
		bw.write(result.toString());
		bw.close();
	}
}
