package search;

public class Strings {
    public static int countRepeat(String first, String searched) {
//        return first.split(searched).length
//                - (first.endsWith(searched) ? 0: 1);

        int counter = 0;

//        int length = searched.length();
//        int index = -length;
//        while ((index = first.indexOf(searched, index + length)) != -1)
//            counter++;

        int length = first.length() - searched.length() + 1;
        char searchedCharAt0 = searched.charAt(0);
        mark:
        for (int i = 0; i < length; i++) {
            if (first.charAt(i) == searchedCharAt0) {
                for (int j = 1; j < searched.length(); j++)
                    if (first.charAt(i + j) != searched.charAt(j))
                        continue mark;
                counter++;
//                i += searched.length() - 1;
            }
        }

        return counter;
    }
}
