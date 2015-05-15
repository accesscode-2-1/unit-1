package m47bell.c4q.nyc.horoscopeapp;

/**
 * Created by c4q-marbella on 5/7/15.
 * A feature where a user can enter their birthdate
 * and receive information about what their sign is.
 */
public class Signs implements Comparable {


    private String sign;


    public Signs(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType(double birthMonth, double birthDate){

    if (birthMonth==12 && birthDate >=23 && birthDate <=31 || birthMonth==01 && birthDate >=1 && birthDate <= 17  )
            return "Capricon";
    else if ((birthMonth ==  1 && birthDate >= 20 && birthDate <= 31) || (birthMonth ==  2 && birthDate >= 1 && birthDate <= 17))
       return "Aquarius";
    else if ((birthMonth ==  2 && birthDate >= 18 && birthDate <= 29) || (birthMonth ==  3 && birthDate >= 1 && birthDate <= 19))
       return "Pisces";
    else if ((birthMonth ==  3 && birthDate >= 20 && birthDate <= 31) || (birthMonth ==  4 && birthDate >= 1 && birthDate <= 19))
        return "Aries";
    else if ((birthMonth ==  4 && birthDate >= 20 && birthDate <= 30) || (birthMonth ==  5 && birthDate >= 1 && birthDate <= 20))
        return "Taurus";
    else if ((birthMonth ==  5 && birthDate >= 21 && birthDate <= 31) || (birthMonth ==  6 && birthDate >= 1 && birthDate <= 20))
       return "Gemini";
    else if ((birthMonth ==  6 && birthDate >= 21 && birthDate <= 30) || (birthMonth ==  7 && birthDate >= 1 && birthDate <= 22))
       return"Cancer";
    else if ((birthMonth ==  7 && birthDate >= 23 && birthDate <= 31) || (birthMonth ==  8 && birthDate >= 1 && birthDate <= 22))
        return "Leo";
    else if ((birthMonth ==  8 && birthDate >= 23 && birthDate <= 31) || (birthMonth ==  9 && birthDate >= 1 && birthDate <= 22))
        return  "Virgo";
    else if ((birthMonth ==  9 && birthDate >= 23 && birthDate <= 30) || (birthMonth == 10 && birthDate >= 1 && birthDate <= 22))
        return "Libra";
    else if ((birthMonth == 10 && birthDate >= 23 && birthDate <= 31) || (birthMonth == 11 && birthDate >= 1 && birthDate <= 21))
        return "Scorpio";
    else if ((birthMonth == 11 && birthDate >= 22 && birthDate <= 30) || (birthMonth == 12 && birthDate >= 1 && birthDate <= 21))
       return "Sagittarius";
    else
        return "Invalid date";
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



