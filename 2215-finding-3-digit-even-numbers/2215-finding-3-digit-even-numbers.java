class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) continue; // Must be even

            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int[] tempFreq = new int[10];
            tempFreq[d1]++;
            tempFreq[d2]++;
            tempFreq[d3]++;

            boolean canForm = true;
            for (int i = 0; i < 10; i++) {
                if (tempFreq[i] > freq[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                list.add(num);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
