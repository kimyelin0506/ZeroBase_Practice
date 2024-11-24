package me.kimyelin.part01.Java_18_2;

public class Practice4 {
    public static String solution(int[] keyLog) {
        final int BACK_SPACE = 8;
        final int SHIFT = 16;
        final int CAPS_LOCK = 20;
        final int SPACE_BAR = 32;
        final int KEY_LEFT = 37;
        final int KEY_RIGHT = 39;
        final int INSERT = 155;
        final int DELETE = 127;

        StringBuffer sb = new StringBuffer();
        int step = (int)('a'-'A');
        int curSor = 0;
        int cmdIdx = 0;
        boolean isShift = false;
        boolean isCaps = false;
        boolean isInsert = false;
        while(cmdIdx != keyLog.length){
            int cur = keyLog[cmdIdx];

            if(cur == BACK_SPACE){
                if(curSor == 0){
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor-1, curSor);
                curSor = Math.max(0, curSor-1);
            }else if(cur == SHIFT){
                isShift = true;
            }else if(cur == CAPS_LOCK){
                isCaps = !isCaps;
            }else if (cur == SPACE_BAR){
                // 공백 문자 넣기
                inputData(sb, ' ', curSor, isInsert);
                curSor++;
            } else if (cur == KEY_LEFT) {
                curSor = Math.max(0, curSor-1);
            }else if(cur == KEY_RIGHT){
                curSor = Math.min(sb.length(), curSor+1);
            }else if(cur == INSERT){
                isInsert = !isInsert;
            }else if(cur == DELETE){
                if(curSor == sb.length()){
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor, curSor+1);  //sb.delete(curSor-1, curSor);
            }else if(cur >= (int)'a' && cur <= (int)'z'){
                int data = cur;
                if(isCaps && isShift){
                    data = cur;
                }else if(isCaps || isShift){
                    data -= step;
                }
                // data insert
                inputData(sb,(char) data,curSor,isInsert);
                isShift = false;
                curSor++;
            }else if(cur >= (int)'0' && cur <= (int)'9'){

                // data insert
                if(isShift){
                    char[] specialKey = {')','!','@','#','$','%','^','&','*','('};
                    inputData(sb, specialKey[cur-'0'], curSor, isInsert);
                }else{
                    inputData(sb, (char)cur, curSor, isInsert);
                }

                isShift = false;
                curSor++;
            }
            cmdIdx++;
        }
        return sb.toString();
    }

    public static void inputData(StringBuffer sb, char data, int cursor, boolean isInsert){
        if(!isInsert){
            sb.insert(cursor,data);
        }else{
            sb.setCharAt(cursor,data);
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 104, 16, 105, 32, 20, 16, 106, 97, 118, 97};
        System.out.println(solution(keyLog));

        keyLog = new int[]{49, 51, 8, 50, 51, 53, 55, 37, 37, 127, 127, 52, 53};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 97, 98, 16, 99, 16, 100, 16, 49, 16, 50, 16, 51};
        System.out.println(solution(keyLog));
    }
}
