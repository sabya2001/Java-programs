import java.util.Scanner;

public class wordSort {
    public static void main(String[] args) {
        Scanner inputFn = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = inputFn.nextLine();
        String[] inputStringArr = inputString.split(" ");
        for (String word : inputStringArr) {
            String[] wordArr = word.split("");
            for (int i = 1; i < wordArr.length; i++) {
                for (int j = 0; j < wordArr.length - i; j++) {
                    if ((int) wordArr[j + 1].charAt(0) < (int) wordArr[j].charAt(0)) {
                        String temp = wordArr[j];
                        wordArr[j] = wordArr[j + 1];
                        wordArr[j + 1] = temp;
                    }
                }
            }
            String OrgWord = "";
            for (String letter : wordArr) {
                OrgWord += letter;
            }
            System.out.println(OrgWord + " ");
        }
        inputFn.close();
    }
}
