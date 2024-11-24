package me.kimyelin.part01.Java_18_2;

public class Practice3 {
    public static String solution(String input, String cmd) {
        int len = input.length();
        int idx = len;
        String[] cmds = cmd.split(" ");

        for (int i = 0; i < cmds.length; i++) {
            if(cmds[i].equals("L")){
                idx--;
                if(idx < 0){
                    idx = 0;
                }
            }else if(cmds[i].equals("D")){
                idx++;
                if(idx > len){
                    idx = len;
                }
            }else if(cmds[i].equals("B")){
                if(idx != 0){
                    input = input.substring(0,idx-1)+input.substring(idx,len);
                    idx--;
                    len = input.length();
                }
            }else if(cmds[i].equals("P")){
                input = input.substring(0,idx) + cmds[i+1] + input.substring(idx, len);
                idx++;
                len = input.length();
            }
        }
        return input;
    }


    public static void main(String[] args) {
        // test code
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
