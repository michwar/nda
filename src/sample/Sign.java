package sample;

/**
 * Created by Michał on 2017-11-14.
 */
public enum Sign {
    Plus("+"), Minus("-"), Comma(","), Zero("0"), One("1"), Two("2"),
    Three("3"), Four("4"), Five("5"), Six("6"), Seven("7"), Eight("8"), Nine("9");

    private String sign;

    Sign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public static Sign valueOfSign(String s) {
        for (Sign sign : values()) {
            if (sign.sign.equals(s))
                return sign;
        }
        throw new IllegalArgumentException("Incorrect sign");
    }
}
