package gz.app.comdavid.apprende2;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import java.io.IOException;
import gz.app.comdavid.apprende2.ABC_Drawable.escribirinicio;

// Clase inicio
public class inicio extends AppCompatActivity {

    Button imageButton4;
    // // Se realiza el llamado al los botones
    ImageButton silbos,silencio;
    // Se realiza el llamado de los sonidos
    MediaPlayer mp2;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Se realiza el llamado a la imagen sonido activo
        silbos=(ImageButton) findViewById(R.id.imageButton4);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.imageButton5);
        // sonido inicio
        mp2= MediaPlayer.create(this,R.raw.bienvenido);
        // se inicia el sonido
        mp2.start();


        // evento que permite silenciar el avatar
        ImageButton btn=(ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad
                finish();


            }
        });

        // evento que permite abrir el modulo escribir
        ImageButton btnn2=(ImageButton) findViewById(R.id.imageButton2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), escribirinicio.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad
                finish();
            }
        });

        // evento que permite abrir la opción de ayuda
        Button credito=(Button) findViewById(R.id.button18);
        credito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),GestionActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad
                finish();
            }
        });
        // evento que permite silenciar el avatar
        ImageButton boton = (ImageButton)findViewById(R.id.imageButton4);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Try Catch que permite silenciar el avatar
                try {
                    // Detiene el sonido
                    mp2.stop();
                    mp2.prepare();
                    mp2.seekTo(0);
                    // Quita el avatar activo de pantalla
                    silbos.setVisibility(View.INVISIBLE);
                    // Muestra el avatar silenciado
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }

            }
        });

        // evento que permite volver a reproducir el sonido del avatar
        ImageButton botonsil = (ImageButton)findViewById(R.id.imageButton5);
        botonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inicia el sonido
                mp2.start();
                // Muestra el avatar activo
                silbos.setVisibility(View.VISIBLE);
                // Quita el avatar inactivo de pantalla
                silencio.setVisibility(View.INVISIBLE);
            }
        });

        // evento del botón salir
        ImageButton salir =(ImageButton) findViewById(R.id.imageButton3);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp2.stop();
                // finaliza la actividad
                finish();

            }
        });

    }
}
