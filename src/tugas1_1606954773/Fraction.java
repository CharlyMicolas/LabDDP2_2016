package tugas1_1606954773;

/**
 * Created by Charly on 21/09/2016.
 *
 * Class ini membuat Object Pecahan yang selalu digunakan saat melakukan operasi pecahan
 */
public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Menampilkan Pecahan
     *
     * @return
     */
    public String display() {

        String rslt = this.getNumerator() + "/" + this.getDenominator();
        return rslt;
    }

    /**
     * Membandingkan 2 buah pecahan sama atau tidak
     *
     * @param fraction
     * @return
     */
    public boolean isEquals(Fraction fraction) {
        this.simplifyFraction();
        fraction.simplifyFraction();
        return (this.numerator == fraction.numerator) && (this.denominator == fraction.denominator);
    }

     /**
     * Mencari fpb 2 bilangan integer
     * @param a
     * @param b
     * @return
     */

    public static int gcd(int a, int b) {

        int tmp;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        return b==0 ? a : gcd(b, a%b);
    }

    /**
     * Untuk menyederhakan pecahan
     */
    public void simplifyFraction() {
        int x = this.getNumerator();
        int y = this.getDenominator();

        //Mengabaikan negatif saat mencari fpb
        if (x < 0) {
            x = x * -1;
        }
        if (y < 0) {
            y = y * -1;
        }

        int fpb = this.gcd(x, y);
        this.setNumerator(this.numerator / fpb);
        this.setDenominator(this.denominator / fpb);

        // untuk meletakkan sign (-) selalu di depan
        if (this.getDenominator() < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    // Operasi aritmatika


    /***
     * Menjumlahkan pecahan dengan pecahan lain
     *
     * @param fraction
     * @return
     */
    public Fraction add(Fraction fraction) {
        int nume = 1;
        int mult = 1;

        if (this.denominator != 0 && fraction.denominator != 0) {
            if (this.denominator == fraction.denominator) {
                mult = this.denominator;
                nume = this.numerator + fraction.numerator;
            } else {
                mult = this.getDenominator() * fraction.getDenominator();
                nume = (mult / this.denominator * this.numerator) + (mult / fraction.denominator * fraction.numerator);
            }
            this.setNumerator(nume);
            this.setDenominator(mult);
        } else {
            System.out.println("Fraction is not valid");
        }

        this.simplifyFraction();
        return this;
    }

    /**
     * Menjumlahkan 2 buah pecahan
     *
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction add(Fraction fraction1, Fraction fraction2) {
        Fraction hasilOperasi = new Fraction();
        if (fraction1.getDenominator() != 0 && fraction2.getDenominator() != 0) {
            if (fraction1.getDenominator() == fraction2.getDenominator()) {
                hasilOperasi.setDenominator(fraction2.getDenominator());
                hasilOperasi.setNumerator(fraction1.getNumerator() + fraction2.getNumerator());
            } else {
                hasilOperasi.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
                hasilOperasi.setNumerator((hasilOperasi.getDenominator() / fraction1.getDenominator() * fraction1.getNumerator()) + (hasilOperasi.getDenominator() / fraction2.getDenominator() * fraction2.getNumerator()));
            }
        } else {
            System.out.println("Fraction is not valid");
        }

        hasilOperasi.simplifyFraction();

        return hasilOperasi;
    }

    /**
     * Mengurangkan pecahan dengan pecahan lain
     *
     * @param fraction
     * @return
     */
    public Fraction subt(Fraction fraction) {
        int nume = 1;
        int mult = 1;

        if (this.denominator != 0 && fraction.denominator != 0) {


            if (this.denominator == fraction.denominator) {
                mult = this.denominator;
                nume = this.numerator - fraction.numerator;
                System.out.println("Lewat1");
            } else {
                mult = this.getDenominator() * fraction.getDenominator();
                nume = (mult / this.denominator * this.numerator) - (mult / fraction.denominator * fraction.numerator);
                System.out.println("Lewat2");
            }
            this.setNumerator(nume);
            this.setDenominator(mult);
        } else {
            System.out.println("Fraction is not valid");
        }

        this.simplifyFraction();
        return this;
    }

    /**
     * Mengurangkan 2 buah pecahan
     *
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction subt(Fraction fraction1, Fraction fraction2) {
        Fraction hasilOperasi = new Fraction();
        if (fraction1.getDenominator() != 0 && fraction2.getDenominator() != 0) {
            if (fraction1.getDenominator() == fraction2.getDenominator()) {
                hasilOperasi.setDenominator(fraction2.getDenominator());
                hasilOperasi.setNumerator(fraction1.getNumerator() - fraction2.getNumerator());

            } else {
                hasilOperasi.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
                hasilOperasi.setNumerator((hasilOperasi.getDenominator() / fraction1.getDenominator() * fraction1.getNumerator()) - (hasilOperasi.getDenominator() / fraction2.getDenominator() * fraction2.getNumerator()));

            }
        } else {
            System.out.println("Fraction is not valid");
        }

        hasilOperasi.simplifyFraction();

        return hasilOperasi;
    }

    /**
     * Mengalikan pecahan dengan pecahan lain
     *
     * @param fraction
     * @return
     */
    public Fraction times(Fraction fraction) {

        int nume = 1;
        int deno = 1;
        if (this.denominator != 0 && fraction.denominator != 0) {
            nume = this.numerator * fraction.numerator;
            deno = this.denominator * fraction.denominator;
            this.setNumerator(nume);
            this.setDenominator(deno);
        } else {
            System.out.println("Fraction is not valid");
        }

        this.simplifyFraction();
        return this;
    }

    /**
     * Mengalikan 2 buah pecahan
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction times(Fraction fraction1, Fraction fraction2) {

        Fraction hasilOperasi = new Fraction();
        if (fraction1.getDenominator() != 0 && fraction2.getDenominator() != 0) {
            hasilOperasi.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
            hasilOperasi.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        } else {
            System.out.println("Fraction is not valid");
        }

        hasilOperasi.simplifyFraction();
        return hasilOperasi;
    }

    /**
     * Membagikan pecahan dengan pecahan lain
     *
     * @param fraction
     * @return
     */
    public Fraction divide(Fraction fraction) {

        int nume = 1;
        int deno = 1;
        if (this.denominator != 0 && fraction.denominator != 0) {
            nume = this.numerator * fraction.denominator;
            deno = this.denominator * fraction.numerator;
            this.setNumerator(nume);
            this.setDenominator(deno);
        } else {
            System.out.println("Fraction is not valid");
        }

        this.simplifyFraction();
        return this;
    }

    /**
     * Membagi 2 buah pecahan
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction divide(Fraction fraction1, Fraction fraction2) {

        Fraction hasilOperasi = new Fraction();
        if (fraction1.getDenominator() != 0 && fraction2.getDenominator() != 0) {
            hasilOperasi.setNumerator(fraction1.getNumerator()*fraction2.getDenominator());
            hasilOperasi.setDenominator(fraction1.getDenominator()*fraction2.getNumerator());
        } else {
            System.out.println("Fraction is not valid");
        }
        hasilOperasi.simplifyFraction();
        return hasilOperasi;
    }

}
