package src.main.java.testXmiProject;

public class Basics {
    static String aPath = "weGoWhereWeWantToBe";
    final String anotherPath = "weGoWhereWeShouldBe";

    public static String getaPath() {
        return aPath;
    }

    public static void setaPath(String aPath) {
        Basics.aPath = aPath;
    }

    private String getAnotherPath() {
        return anotherPath;
    }

    protected String toProtect(){
        return "ATTACK";
    }
}
