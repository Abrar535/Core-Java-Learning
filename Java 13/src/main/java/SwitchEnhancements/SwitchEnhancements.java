package SwitchEnhancements;

public class SwitchEnhancements {

    public static void main(String[] args)
    {
        System.out.println("New Switch Expression result:");
        executeNewSwitchExpression("M");
        executeNewSwitchExpression("TH");
        executeNewSwitchExpression("SUN");
        executeNewSwitchExpression("");
    }

    public static void executeNewSwitchExpression(String day){

        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default ->  {
                if(day.equals(""))
                    yield "Not any day";
                else
                    yield "Sunday";
            }


        };

        System.out.println(result);
    }
}

