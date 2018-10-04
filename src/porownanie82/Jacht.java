package porownanie82;

import java.util.Objects;

public class Jacht {
    private String typJachtu;
    private double dlugsc;

    public Jacht(String typJachtu, double dlugsc) {
        this.typJachtu = typJachtu;
        this.dlugsc = dlugsc;
    }

    public String getTypJachtu() {
        return typJachtu;
    }

    public void setTypJachtu(String typJachtu) {
        this.typJachtu = typJachtu;
    }

    public double getDlugsc() {
        return dlugsc;
    }

    public void setDlugsc(double dlugsc) {
        this.dlugsc = dlugsc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jacht jacht = (Jacht) o;
        return Double.compare(jacht.dlugsc, dlugsc) == 0 &&
                Objects.equals(typJachtu, jacht.typJachtu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typJachtu, dlugsc);
    }

    @Override
    public String toString() {
        return "Jacht{" +
                "typJachtu='" + typJachtu + '\'' +
                ", dlugsc=" + dlugsc +
                '}';
    }
}
