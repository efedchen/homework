package JustForFun;

public class IsNumeric {

    private String uncheckedSymbol;

    public IsNumeric (String uncheckedSymbol){
        this.uncheckedSymbol = uncheckedSymbol;
    }

    public static boolean IsNumericInt(String uncheckedSymbol){
        try {
            Integer.parseInt(uncheckedSymbol);
            return true;
        } catch (Exception e)
        {return false;}
    }

}
