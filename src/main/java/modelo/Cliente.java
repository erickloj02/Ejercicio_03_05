/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Cliente {
    private String nombre;
    private int yearNacimiento;
    private String ciudadania;
    private String direccion;
    private int codigo;

    public Cliente(String nombre, int yearNacimiento, String ciudadania, String direccion, int codigo) {
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.ciudadania = ciudadania;
        this.direccion = direccion;
        this.codigo = codigo;
    }

    public Cliente(Integer valueOf, String arg, String arg0, Integer valueOf0) {
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.ciudadania = ciudadania;
        this.direccion = direccion;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    public String verificarNacionalidad(){
        var retorno=" ";
        var tipoCiudadania=this.ciudadania.charAt(0);
        switch(tipoCiudadania)
        {
            case 'E':
            retorno="Ecuatoriano";
            break;
            case 'A':
            retorno="Argentina";
            break;
            case 'V':
            retorno="Venezolana";
            break;
            case 'P':
            retorno="Peruana";
            break;
            case 'M':
            retorno="Mexicana";
            break;
        }
        return retorno;
    }
    
    public int calcularEdad(int yearActual){    
         var retorno= 100;
         retorno= yearActual-this.yearNacimiento;
         return retorno;
    } 

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", yearNacimiento=" 
                + yearNacimiento + ", ciudadania=" + ciudadania + ", direccion=" 
                + direccion + ", codigo=" + codigo + '}';
    }
}
