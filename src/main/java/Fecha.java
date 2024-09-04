
public class Fecha {

    private int anio;
    private int mes;
    private int dia;

    // CONSTRUCTORES 
    public Fecha(int anio, int mes, int dia) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    // METODOS GETS Y SETS
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 0) {
            this.dia = 1;
        } else if (this.mes == 2) {
            if ((this.anio % 4) == 0) {
                if (dia > 29) {
                    this.dia = 29;
                } else {
                    this.dia = dia;
                }
            }
        } else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
            if ((this.anio % 4) == 0) {
                if (dia > 31) {
                    this.dia = 31;
                } else {
                    this.dia = dia;
                }
            }
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 12) {
            this.mes = 12;
        } else if (mes < 0) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio < 2024 ? 2024 : anio;
    }

    // Salida 02/02/2025
    @Override
    public String toString() {
        return (this.dia < 10 ? "0" + this.dia : String.valueOf(this.dia)) + "/"
                + (this.mes < 10 ? "0" + this.mes : String.valueOf(this.mes)) + "/"
                + String.valueOf(this.anio);

    }

}
