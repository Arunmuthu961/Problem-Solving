class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop as long as there are digits to process or a carry remains
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            sb.append(sum % 2); // Result digit (0 or 1)
            carry = sum / 2;    // Carry for next position
        }

        // Since we appended from right to left, reverse it
        return sb.reverse().toString();
    }
}
