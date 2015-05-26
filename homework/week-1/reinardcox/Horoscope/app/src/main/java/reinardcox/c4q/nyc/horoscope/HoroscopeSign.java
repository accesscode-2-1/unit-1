package reinardcox.c4q.nyc.horoscope;

/**
 * Created by shadowslimmedia on 5/26/15.
 */

public enum HoroscopeSign {
    Aries("3/21-4/19", "♈"),
    Taurus("4/20-5/20", "♉"),
    Gemini("5/21-6/21", "♊"),
    Cancer("6/22-7/22", "♋"),
    Leo("7/23-8/22", "♌"),
    Virgo("8/23-9/22", "♍"),
    Libra("9/23-10/22", "♎"),
    Scorpio("10/23-11/21", "♏"),
    Sagittarius("11/22-12/21", "♐"),
    Capricorn("12/22-01/19", "♑"),
    Aquarius("01/20-02/18", "♒"),
    Pisces("02/19-03/20", "♓");

    private String infoh;
    private String symbol;

    private HoroscopeSign(String s, String s2) {
        this.infoh = s;
        this.symbol = s2;
    }

    protected String getInfo() {
        return this.infoh;
    }

    protected String getSymbol() {
        return this.symbol;
    }
}