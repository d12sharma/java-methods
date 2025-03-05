import java.util.HashSet;
import java.util.Random;

class OTPGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness
        boolean isUnique = checkUniqueOTPs(otpArray);
        System.out.println("\nAre all OTPs unique? " + isUnique);
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if all generated OTPs are unique
    public static boolean checkUniqueOTPs(int[] otpArray) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int otp : otpArray) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otpArray.length; // If size matches, all OTPs are unique
    }
}
