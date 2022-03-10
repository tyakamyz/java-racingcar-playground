package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    /* 값 입력 */
    public static String inputString() throws IOException {
        System.out.print("계산하실 문자열을 입력해 주세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return br.readLine();
    }
}
