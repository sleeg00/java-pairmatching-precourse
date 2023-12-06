package pairmatching.domain.Enum;

public enum Function {
    PAIR_MATCHING("1"),
    PAIR_SELECT("2"),
    PAIR_RESET("3"),
    PAIR_RETURN("q");

    private String name;

    Function(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
