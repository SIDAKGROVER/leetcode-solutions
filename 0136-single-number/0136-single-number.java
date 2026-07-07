class Solution {
    public int singleNumber(int[] arr) {
    int xor = 0;
    for (int num : arr) {
        xor ^= num;
    }
    return xor;
    }
}