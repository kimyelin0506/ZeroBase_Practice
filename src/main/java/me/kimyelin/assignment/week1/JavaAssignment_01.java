package me.kimyelin.assignment.week1;
/*
  김예린

  졸업시험 준비 때문에 1주차를 제때 못 들어서 아쉬웠다. 다음에는 일정을 더 잘 조율하여 꾸준히 학습할 수 있도록 노력 할 것이다.
*/
public class JavaAssignment_01 {
    public static void main(String[] args){
        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%02d x %02d = %02d   ", j, i, j*i);
            }
            System.out.println();
        }
    }
}
