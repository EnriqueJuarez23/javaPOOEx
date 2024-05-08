public class Password {
// declaracion de las variables
    private final static int LONG_DEF=8;
    private int longitud, tamaño;
    private String contraseña;
    // metodos getters & setters
    public static int getLONGDEF() {
        return LONG_DEF;
    }
    public int getLongitud() {
        return longitud;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getContraseña() {
        return contraseña;
    }
    /*metodo que contiene una sentencia de control, que hace validaciones hacia 
    numeros, letras mayusculas y minusculas*/
    public String generarPassword(){
        String password="";
        for(int i=0; i<longitud; i++){
            int eleccion=((int)Math.floor(Math.random()*3+1));
            if(eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                password+=numeros;
            }
        }return password;
    }
    // metodo que hace que la contraseña sea fuerte
public boolean esFuerte(){
    int cuentanumeros=0;
    int cuentaminusculas=0;
    int cuentamayusculas=0;
    for(int i=0; i<contraseña.length(); i++){
        if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
            cuentaminusculas+=1;
        }else{
            if(contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                cuentamayusculas+=1;
            }else{
                cuentanumeros+=1;
            }
        }
    }
    // sentencia de control que evalua el valor de los datos ingresados
    if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2) {
        return true;
    }else{
        return false;
    }
}
// metodos constructores
public Password(){
    this(LONG_DEF);
}
public Password(int longitud) {
    this.longitud=longitud;
    contraseña=generarPassword();
}
}


