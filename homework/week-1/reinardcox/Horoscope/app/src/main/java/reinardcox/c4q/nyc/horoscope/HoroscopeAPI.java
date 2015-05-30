package reinardcox.c4q.nyc.horoscope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;


public final class HoroscopeAPI {
    private final String url = "http://www.xiaoergeblessed.com/API/HoroscopeAPI/HoroscopeAPI.php";
    private final int id;
    private final String[][] horoscope_reading;
    private final String[] zodiac_reading;
    private final boolean isPaid;
    private final Date expiration;
    private long lastmod;

    public HoroscopeAPI(int id) throws MalformedURLException, IOException, SQLExcpetion {
        this.id = id;
        this.horoscope_reading = new String[12][6];
        this.zodiac_reading = new String[12];
        this.isPaid = false;
        this.expiration = new Date(System.currentTimeMillis());
        this.lastmod = 0L;
        this.getReading();
    }

    public final String getZodiacReading(ZodiacSign sign, ZodiacReading reading) {
        return this.zodiac_reading[sign.ordinal()];
    }

    public final String getHoroscopeReading(HoroscopeSign sign, HoroscopeReading reading) {
        return this.horoscope_reading[sign.ordinal()][reading.ordinal()];
    }

    private final void getReading() throws MalformedURLException, IOException, SQLExcpetion {
        HttpURLConnection con = (HttpURLConnection)(new URL(this.url + "?" + "id=" + this.id)).openConnection();
        con.setRequestProperty("User-Agent", "HoroscopeAPI");
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String str = "";

        int ex;
        for(ex = 0; ex < this.horoscope_reading.length; ++ex) {
            for(int j = 0; j < this.horoscope_reading[ex].length; ++j) {
                str = reader.readLine();
                if(str.contains("ERROR")) {
                    throw new SQLExcpetion(reader.readLine());
                }

                this.horoscope_reading[ex][j] = str;
            }
        }

        for(ex = 0; ex < this.zodiac_reading.length; ++ex) {
            str = reader.readLine();
            if(str.contains("ERROR")) {
                throw new SQLExcpetion(reader.readLine());
            }

            this.zodiac_reading[ex] = str;
        }

        try {
            String var7 = reader.readLine();
            this.lastmod = Long.parseLong(var7) * 1000L;
        } catch (Exception var6) {
            this.lastmod = 0L;
        }

        reader.close();
    }

    public final String getDeveloperInfo() {
        String developer = "Xiaoerge";
        String appname = "HoroscopeAPI";
        String appversion = "1.0";
        String supportemail = "horoscope@xiaoergeblessed.com";
        String website = "http://www.xiaoergeblessed.com";
        return developer + "\n" + appname + "\n" + appversion + "\n" + supportemail + "\n" + website;
    }

    public final long getLastModified() {
        return this.lastmod;
    }

    public final String getSignInfo(HoroscopeSign hsign) {
        return hsign.getInfo();
    }

    public final String getSignInfo(ZodiacSign zsign) {
        return zsign.getInfo();
    }

    public final String getSignSymbol(HoroscopeSign hsign) {
        return hsign.getSymbol();
    }
    public final String getSignSymbol(ZodiacSign zsign) {
        return zsign.getSymbol();
    }
}