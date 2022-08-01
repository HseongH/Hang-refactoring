package sample04;

/**
 * Calculation
 */
public class Calculation {
    private static String TABLE = "<table>";
    private static String CTABLE = "</table>";
    private static String TH = "<th> ";
    private static String CTH = " </th>";
    private static String TR = "<tr> ";
    private static String CTR = " </tr>";
    private static String TD = "<td> ";
    private static String CTD = " </td>";

    private static String TITLE = "<TITLE> ";
    private static String CTITLE = " </TITLE>";
    private static String CONTENT = "<CONTENT> ";
    private static String CCONTENT = " </CONTENT>";
    private static String LF = "\n";

    public void calc(PrintType type) {
        for (int i = 1; i <= 9; i++) calc(i, type);
    }

    public void calc(int param, PrintType type) {
        System.out.println(getTitle(param, type));
        System.out.println(getContent(param, type));
    }

    public String getTitle(int param, PrintType type) {
        switch (type) {
            case XML:
                return TITLE + LF + getTitle(param) + LF + CTITLE;
            
            case HTML:
                return TABLE + LF + TH + LF + getTitle(param) + LF + CTH;
        
            default:
                return getTitle(param);
        }
    }

    public String getTitle(int param) {
        String result = "";
        result += "***** [" + param + "] *****";
        return result;
    }

    public String getContent(int param, PrintType type) {
        String result = "";

        switch (type) {
            case XML:
                result += CONTENT + LF + getContent(param) + LF + CCONTENT;
                break;
            
            case HTML:
                result += TR + LF + getContent(param) + CTR + LF + CTABLE;
                break;
        
            default:
                result += getContent(param);
        }

        return result;
    }

    public String getContent(int param) {
        String result = "";

        for (int i = 1; i <= 9; i++) {
            result += param + " * " + i + " = " + param * i + LF;
        }

        return result;
    }
}