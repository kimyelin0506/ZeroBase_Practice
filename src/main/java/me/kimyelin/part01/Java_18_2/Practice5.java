package me.kimyelin.part01.Java_18_2;

import java.util.Arrays;

public class Practice5 {
    public static int solution(int[] ratings) {
        int[] candies = new int[ratings.length];
        int[] copy;
        Arrays.fill(candies, 1);

        while(true){
            copy = candies.clone();
            for (int i = 0; i < ratings.length; i++) {
                if (i == 0) {
                    if (ratings[i] > ratings[i + 1]) {
                        if (candies[i] <= candies[i + 1]) {
                            candies[i] = candies[i + 1] + 1;
                        }
                    } else if (ratings[i] < ratings[i + 1]) {
                        if (candies[i] >= candies[i + 1]) {
                            candies[i + 1] = candies[i] + 1;
                        }
                    }
                } else if (i <= candies.length - 2) {
                    int past = ratings[i - 1];
                    int cur = ratings[i];
                    int next = ratings[i + 1];

                    //주변보다 클 때 -> 한 개 더줌
                    if (cur > next && cur > past) {
                        if (candies[i] <= candies[i + 1] || candies[i] <= candies[i - 1]) {
                            candies[i] = Math.max(candies[i - 1], candies[i + 1]) + 1;
                        }
                    } else if (cur > next) {
                        if (candies[i] <= candies[i + 1]) {
                            candies[i] = candies[i + 1] + 1;
                            if (candies[i] >= candies[i - 1]) {
                                candies[i-1]++;
                            }
                        }

                    } else if (cur > past) {
                        if (candies[i] <= candies[i - 1]) {
                            candies[i] = candies[i - 1] + 1;
                            if (candies[i] >= candies[i + 1]) {
                                candies[i+1]++;
                            }
                        }

                    }

                    if (cur < next && cur < past) {
                        if (candies[i] >= candies[i + 1] && candies[i] >= candies[i - 1]) {
                            candies[i + 1] = candies[i] + 1;
                            candies[i - 1] = candies[i] + 1;
                        } else if (candies[i] >= candies[i + 1]) {
                            candies[i + 1] = candies[i] + 1;
                        } else if (candies[i] >= candies[i - 1]) {
                            candies[i - 1] = candies[i] + 1;
                        }
                    } else if (cur < next) {
                        if (candies[i] >= candies[i + 1]) {
                            candies[i + 1] = candies[i] + 1;
                        }
                    } else if (cur < past) {
                        if (candies[i] >= candies[i - 1]) {
                            candies[i - 1] = candies[i] + 1;
                        }
                    }
                } else if (i == candies.length - 1) {
                    if (ratings[i] > ratings[i - 1]) {
                        if (candies[i] <= candies[i - 1]) {
                            candies[i] = candies[i - 1] + 1;
                        }
                    } else if (ratings[i] < ratings[i - 1]) {
                        if (candies[i] >= candies[i - 1]) {
                            candies[i - 1] = candies[i] + 1;
                        }
                    }
                }
            }
            boolean isSame = true;
            for (int i = 0; i < copy.length; i++) {
                if(copy[i] != candies[i]){
                    isSame = false;
                    break;
                }
            }

            if(isSame){
                break;
            }
        }

        return Arrays.stream(candies).sum();
    }

    public static void main(String[] args) {
        // Test code
        int[] ratings = {1, 2, 3};
        System.out.println(solution(ratings));

        ratings = new int[]{3, 2, 1};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 0, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 2, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 3, 5, 3, 1, 3, 5, 7, 5, 3, 1, 0};
        System.out.println(solution(ratings));
    }
}
