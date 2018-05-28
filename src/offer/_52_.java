package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _52_ {

    public boolean isNumeric(char[] str) {
        if (str == null || str.length < 1) {
            return false;
        }
        return isNumeric(new String(str));
    }

    public static boolean isNumeric(String string) {
        if (string == null || string.length() < 1) {
            return false;
        }

        int indexOfE = -1;
        char temp;
        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            if (isValidChar(temp)) {
                if (temp == 'e' || temp == 'E') {
                    indexOfE = i;
                    break;
                }
            } else {
                return false;
            }
        }

        if (indexOfE != -1) {
            return isNumber(string, 0, indexOfE - 1, true)
                    && isNumber(string, indexOfE + 1, string.length() - 1, false);
        } else {
            return isNumber(string, 0, string.length() - 1, true);
        }
    }

    private static boolean isNumber(String string, int start, int end, boolean allowDecimal) {
        if (start > end) {
            return false;
        }

        int i = start;
        char temp = string.charAt(start);
        if (temp == '+' || temp == '-') {
            i++;
        }

        if (i > end) {
            return false;
        }

        if (allowDecimal) {
            int dotCount = 0;
            for (; i <= end; i++) {
                temp = string.charAt(i);
                if (!(Character.isDigit(temp) || (temp == '.' && i + 1 <= end && (dotCount++ == 0)))) {
                    break;
                }
            }
        } else {
            for (; i <= end && Character.isDigit(string.charAt(i)); i++) ;
        }

        if (i > end) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidChar(char c) {
        return Character.isDigit(c) || c == '.' || c == '+' || c == '-' || c == 'e' || c == 'E';
    }

}
