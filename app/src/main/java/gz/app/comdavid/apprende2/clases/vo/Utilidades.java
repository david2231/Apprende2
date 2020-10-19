package gz.app.comdavid.apprende2.clases.vo;

//Librerias
import java.util.ArrayList;
import gz.app.comdavid.apprende2.R;

//Clase que puede ser accedida desde cualquier lugar de la aplicación
public class Utilidades {
    //Se crean variables estaticas
    public static ArrayList<AvatarVo> listaAvatars=null;
    public static String usuario;
    //Guardar el objeto completo de la lista del avatar
    public static  AvatarVo avatarSeleccion=null;
    public static ArrayList<JugadorVo> listaJugadores=null;
    public static  int avatarIdSeleccion=0;
    //Variable estatica que alamacena las respuestas correctas
    public static int correctas;
    public static int puntaje;
    //Variable estatica que alamacena las respuestas incorrectas
    public static int incorrectas;



    // Metodo estatico que contiene el listado de los avatars
    public static void obtenerListaAvatars(){
        // Creación de un array de tipo lista
        listaAvatars=new ArrayList<AvatarVo>();
        // Creación de la estructura ID para el elemento, imagen asociada y el nombre
        listaAvatars.add(new AvatarVo(1,R.drawable.logofin,"Avatar1"));
        listaAvatars.add(new AvatarVo(2,R.drawable.avatar2,"Avatar2"));
        listaAvatars.add(new AvatarVo(3,R.drawable.avatar3,"Avatar3"));
        listaAvatars.add(new AvatarVo(4,R.drawable.avatar4,"Avatar4"));
        listaAvatars.add(new AvatarVo(5,R.drawable.avatar5,"Avatar5"));
        listaAvatars.add(new AvatarVo(6,R.drawable.avatar6,"Avatar6"));
        listaAvatars.add(new AvatarVo(7,R.drawable.avatar7,"Avatar7"));
        listaAvatars.add(new AvatarVo(8,R.drawable.avatar8,"Avatar8"));
        listaAvatars.add(new AvatarVo(9,R.drawable.avatar9,"Avatar9"));
        listaAvatars.add(new AvatarVo(10,R.drawable.avatar10,"Avatar10"));
        listaAvatars.add(new AvatarVo(11,R.drawable.avatar11,"Avatar11"));
        listaAvatars.add(new AvatarVo(12,R.drawable.avatar12,"Avatar12"));
        listaAvatars.add(new AvatarVo(13,R.drawable.avatar13,"Avatar13"));
        listaAvatars.add(new AvatarVo(14,R.drawable.avatar14,"Avatar14"));
        listaAvatars.add(new AvatarVo(15,R.drawable.avatar15,"Avatar15"));
        listaAvatars.add(new AvatarVo(16,R.drawable.avatar16,"Avatar16"));
        listaAvatars.add(new AvatarVo(17,R.drawable.avatar17,"Avatar17"));
        listaAvatars.add(new AvatarVo(18,R.drawable.avatar18,"Avatar18"));
        listaAvatars.add(new AvatarVo(19,R.drawable.avatar19,"Avatar19"));
        listaAvatars.add(new AvatarVo(20,R.drawable.avatar20,"Avatar20"));
        listaAvatars.add(new AvatarVo(21,R.drawable.avatar21,"Avatar21"));
        listaAvatars.add(new AvatarVo(22,R.drawable.avatar22,"Avatar22"));
        listaAvatars.add(new AvatarVo(23,R.drawable.avatar23,"Avatar23"));
        listaAvatars.add(new AvatarVo(24,R.drawable.avatar24,"Avatar24"));
        listaAvatars.add(new AvatarVo(25,R.drawable.avatar25,"Avatar25"));
        listaAvatars.add(new AvatarVo(26,R.drawable.avatar26,"Avatar26"));
        listaAvatars.add(new AvatarVo(27,R.drawable.avatar27,"Avatar27"));

        avatarSeleccion=listaAvatars.get(0);

    }
}
