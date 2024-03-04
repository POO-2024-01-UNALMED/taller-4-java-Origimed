package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo = 0;
    public String horario;
    public int cantidadEstudiantes;

    public Grupo(int estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(estudiantes, null, profesor, asignatura, codigo, horario);
    }

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }


    
    public Grupo(int cantidadEstudiantes,Persona[] personas, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(personas, profesor, asignatura, codigo, horario);
        this.estudiantes = new Persona[cantidadEstudiantes];
        
    }
     
    

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }


    //Grupo grupo2 = new Grupo(2, profesor2, asignatura2, 10122, "W V 8-10");
    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
