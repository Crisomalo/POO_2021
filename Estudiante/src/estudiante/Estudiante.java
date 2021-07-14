package estudiante;

public class Estudiante {

    public static void main(String[] args) {

        Alumno estudiante = new Alumno();
        estudiante.setNombre("Bryan");
        estudiante.setApellido("Romero");
        estudiante.setGenero("Masculino");
        estudiante.setEdad(22);
        estudiante.setIdentidad(123456789);
        estudiante.setCodigo(12345);
        estudiante.setCarrera("Electronica");

        System.out.println("Datos de estudiante:\n ");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Genero: " + estudiante.getGenero());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("DNI: " + estudiante.getIdentidad());
        System.out.println("Codigo: " + estudiante.getCodigo());
        System.out.println("Carrera: " + estudiante.getCarrera());

    }

    public static class Alumno {

        //Atributos
        private String nombre;
        private String apellido;
        private String genero;
        private int edad;
        private long identidad;
        private int codigo;
        private String carrera;

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getGenero() {
            return genero;
        }

        public int getEdad() {
            return edad;
        }

        public long getIdentidad() {
            return identidad;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setIdentidad(long identidad) {
            this.identidad = identidad;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
    }

}
