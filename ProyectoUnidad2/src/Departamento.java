public class Departamento extends Trabajador{

    protected String nombreDept;
    protected int numOficina;
    private String descripcionDept;

    public Departamento(String r, String nT, int sT, String vj, String nombreDept, int numOficina) {
        super(r, nT, sT, vj);
        this.nombreDept = nombreDept;
        this.numOficina = numOficina;
    }

    public String getNombreDept() {
        return nombreDept;
    }
    public void setNombreDept(String nombreDept) {
        this.nombreDept = nombreDept;
    }

    public int getNumOficina() {
        return numOficina;
    }
    public void setNumOficina(int numOficina) {
        this.numOficina = numOficina;
    }



}
