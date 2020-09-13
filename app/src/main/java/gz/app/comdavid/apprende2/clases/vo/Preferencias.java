package gz.app.comdavid.apprende2.clases.vo;

import android.content.SharedPreferences;
import android.content.Context;
import android.widget.Toast;

public class Preferencias {
    public static final String AVATAR_ID="avatarId";
    public static int avatarId;

    public static void asignarPreferenciasJugador(SharedPreferences preferences, Context applicationContext){
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(AVATAR_ID,""+avatarId);
        editor.commit();
        obtenerPreferencias(preferences,applicationContext);
    }
    public static void obtenerPreferencias(SharedPreferences preferences, Context applicationContext) {

        avatarId=Integer.parseInt(preferences.getString(AVATAR_ID,"1"));




        // Toast.makeText(applicationContext,""+cad,Toast.LENGTH_SHORT).show();

    }
}
