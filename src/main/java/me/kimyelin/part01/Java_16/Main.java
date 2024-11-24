package me.kimyelin.part01.Java_16;// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

    // 인터페이스에 함수가 두개 이상인 경우
    public abstract int compute2(int x, int y);
}



public class Main {

    public static void main(String[] args) {

        ComputeTool cTool = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x+y;
            }
            public int compute2(int x, int y){
                return x-y;
            }
        };
        System.out.println(cTool.compute(1,2));

        // 람다식
//        ComputeTool cTool2 = (x,y) -> {return x+y;};  //사용 제한됨
//        System.out.println(cTool2.compute(1,2));

    }
}
