package lesson21;

public class StringHelper {

    public boolean check(String str, int val) {
//        if (str == null) {
//            return false;
//        }
        return str.length() < val;
    }
}
