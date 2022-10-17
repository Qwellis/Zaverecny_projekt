public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int tel;


    public Pojisteny(String jmeno, String prijmeni, int vek, int tel) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.tel = tel;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTel() {
        return tel;
    }


}
