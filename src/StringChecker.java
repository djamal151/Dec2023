//
//        ////////////////////////////////answer N1
//     public class StringComparator {
//         public static void main(String[] args) {
//               String str1 = "hello";
//               String str2 = "world";
//                boolean result = areEqualLength(str1, str2);
//                   System.out.println("The strings have equal length: " + result);
//    }
//       public static boolean areEqualLength(String str1, String str2) {
//           if (str1.length() == str2.length()) {
//            return true;
//           }
//            return false;
//    }
//}
//////////////////////////////////////////////////////////
//       ///////////////////////////////// Answer N2
//    public class ArraySumCalculator {
//    public static void main(String[] args) {
//           int[] numbers = {5, 12, 7, 15, 8, 3};
//            int sum = 0;
//             for (int number : numbers) {
//                 if (number > 10 && number % 2 != 0) {
//                    sum += number;
//            }
//        }
//               System.out.println("Sum of odd numbers greater than 10: " + sum);
//    }
//}
/////////////////////////////Answer  N4
//
//        public class ArrayFront9 {
//                public static void main(String[] args) {
//                        int[] myArray = {1, 9, 6, 3, 9};
//                        boolean result = arrayFront9(myArray);
//                        System.out.println(result);
//                }
//                public static boolean arrayFront9(int[] nums) {
//                        int end = Math.min(nums.length, 4);
//                        for (int i = 0; i < end; i++) {
//                                if (nums[i] == 9) {
//                                        return true;
//                                }
//                        }
//                        return false;
//                }
//        }
//        /////////////////////////////////////////N3
//
//         public class StringComparator {
//                 public static void main(String[] args) {
//                         String s1 = "hello";
//                      String s2 = "happy";
//
//                         boolean result = sameFirstAndLast( s1, s2);
//                         System.out.println("Are the first and last characters equal? " + result);
//                 }
//                public static boolean sameFirstAndLast(String s1, String s2) {
//                        if (s1 != null && s2 != null && s1.length() > 0 && s2.length() > 0) {
//                                char first1 = s1.charAt(0);
//                                char last1 = s1.charAt(s1.length() - 1);
//                                char first2 = s2.charAt(0);
//                                char last2 = s2.charAt(s2.length() - 1);
//                                return first1 == first2 && last1 == last2;
//                        }
//                        return false;
//                }
//        }
   public class StringChecker {
       public static boolean checkFirstAndLastCharacters(String str1, String str2) {
        // Check if both strings are empty
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }

        // Check if both strings have at least one character
        if (!str1.isEmpty() && !str2.isEmpty()) {
            // Get the first and last characters of each string
            char firstChar1 = str1.charAt(0);
            char lastChar1 = str1.charAt(str1.length() - 1);
            char firstChar2 = str2.charAt(0);
            char lastChar2 = str2.charAt(str2.length() - 1);

            // Compare the first and last characters
            return firstChar1 == firstChar2 && lastChar1 == lastChar2;
        }

        // If either string is empty, return false
        return false;
    }

    public static void main(String[] args) {
        String str1 = "welld";
        String str2 = "world";

        boolean result = checkFirstAndLastCharacters(str1, str2);
        System.out.println(result); // Output: true
    }
}