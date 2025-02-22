package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }
        if (string.length() % 2 == 1) {
            return begin == end ? string : mirror;
        }
        else{
            return begin == end + 1 ? string : mirror;
        }

    }
}
