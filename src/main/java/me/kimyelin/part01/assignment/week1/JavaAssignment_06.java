package me.kimyelin.part01.assignment.week1;

import java.util.*;
/*
    김예린
*/
public class JavaAssignment_06 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int voteCount = sc.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int candidateNum = sc.nextInt();

        String[] candidates = new String[candidateNum];
        int[] votes = new int[candidates.length];
        for (int i = 0; i < candidates.length; i++) {
            System.out.printf("%d번째 후보자이름을 입력해 주세요.", i+1);
            candidates[i] = sc.next();
        }
        System.out.println();
        simulation(voteCount, candidates, votes,1);
    }

    public static void simulation(int voteCount, String[] candidates, int[] votes, int cnt){
        if(cnt > voteCount){
            int winIdx = -1;
            int maxVote = 0;
            for(int i=0; i<votes.length; i++){
                if(maxVote < votes[i]){
                    winIdx = i;
                    maxVote = votes[i];
                }
            }
            System.out.printf("[투표결과] 당선인 : %s", candidates[winIdx]);
            return;
        }

        Random random = new Random();
        int vote = random.nextInt(votes.length)+1;
        votes[vote-1] +=1;

        int maxLen = 0;
        for (String can : candidates){
            if(maxLen < can.length()){
                maxLen = can.length();
            }
        }
        System.out.printf("[투표진행률]: %.2f, %d명투표 => %s\n", (double)cnt/voteCount*100, cnt, candidates[vote-1]);
        for (int i = 0; i < candidates.length; i++) {
            String space = " ";
            for (int j = 0; j < maxLen-candidates[i].length(); j++) {
                space += " ";
                if(j == maxLen-candidates[i].length()-1){
                    space += " ";
                }
            }
            System.out.printf("[기호:%d] %s:%s", i+1, candidates[i], space);
            System.out.printf("%.2f%%  (투표수: %d)\n", (double)votes[i]/voteCount*100, votes[i]);

        }
        System.out.println();
        cnt++;
        simulation(voteCount, candidates, votes, cnt);
    }
}
