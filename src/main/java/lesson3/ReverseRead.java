package lesson3;

public class ReverseRead {

    public String ReadReverseBySymbol(String str){
        char[] arr = str.toCharArray();
        String tempStr = "";
        for (int i = 0; i < arr.length; i++) {
            tempStr += arr[arr.length - 1 - i];
        }
        return tempStr;
    }

    public String ReadReverseByWord(String str){
        String tempStr = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            tempStr += arr[arr.length - 1 - i] + " ";
        }
        return tempStr;
    }


}
