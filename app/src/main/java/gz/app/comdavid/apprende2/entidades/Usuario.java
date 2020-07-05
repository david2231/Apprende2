package gz.app.comdavid.apprende2.entidades;

public class Usuario {

    private Integer documento;
    private String nombre;
    private String profesion;
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public Integer getDocumento() {
        return documento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}

