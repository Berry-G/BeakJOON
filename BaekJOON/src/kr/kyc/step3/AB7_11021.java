package kr.kyc.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AB7_11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++)
		{
			//st : 띄어쓰기로도 입력 구분 가능
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			String result = "Case #" + (i+1) + ": " + Integer.toString(A+B) + "\n";
			bw.write(result);
		}
		bw.close();
	}
}
