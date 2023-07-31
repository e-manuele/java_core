public enum BaseColorEnum {
    RED,
    BLACK,
    WHITE,
    EMPTY;

    public static BaseColorEnum checksColor(String s) {
        switch (s) {
            case "Rosso":
                return BaseColorEnum.RED;
            case "Nero":
                return BaseColorEnum.BLACK;
            case "Bianco":
                return BaseColorEnum.WHITE;
            default:
                return BaseColorEnum.EMPTY;
        }

    }
}
