class Solution {
    public int[] shortestToChar(String S, char C) {
        if (S == null) {
            return new int[0];
        }
        int[] arr = new int[S.length()];
        int k = 0;
        char[] carr = S.toCharArray();
        int pre = -1;
        for (int i = 0; i < carr.length; i++) {
            if (carr[i] == C) {
                if (pre == -1) {
                    pre = i;
                    for (int j = i; j > 0; j--) {
                        arr[i - j] = j;
                    }
                } else if (i - pre == 1) {
                    pre = i;
                } else if (i - pre == 2) {
                    pre = i;
                    arr[i - 1] = 1;
                } else if(i - pre == 3) {
                    arr[++pre] = 1;
                    arr[++pre] = 1;
                    pre++;
                } else {
                    int max = (i - pre) / 2;
                    pre++;
                    int j;
                    for (j = 1; j <= max; j++) {
                        arr[pre++] = j;
                    }
                    for (j = i - pre; j > 0; j--) {
                        arr[pre++] = j;
                    }
                }
            }
        }
        pre++;
        for(int i = 1 ; pre < carr.length ; i++) {
            arr[pre++] = i;
        }
        return arr;
    }
}