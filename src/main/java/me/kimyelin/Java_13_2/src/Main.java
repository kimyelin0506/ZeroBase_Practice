package me.kimyelin.Java_13_2.src;// Java 프로그래밍 - 입출력_2

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt");
        String memo = "헤드라인\n";
        fw.write(memo);

        memo = "11월 19일 공부 중\n";
        fw.write(memo);

        fw.close();
//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo2.txt");
        memo = "헤드 라인2";
        pw.println(memo);  // 줄바꿈 제공

        memo = "11월 19일 공부 중\n";
        pw.println(memo);
        pw.close();
//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true);
        memo = "오늘 완전 졸림\n";
        fw2.write(memo);
        fw2.close();

        PrintWriter pw2 = new PrintWriter(
                new FileWriter("./memo2.txt", true));
        pw2.println("넘 졸린데 공부중 ㅋㅎㅋㅎ");
        pw2.close();

//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));

        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }

        br.close();



    }
}
