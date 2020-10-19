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

import gz.app.comdavid.apprende2.Juegos.Vocales.juego;

// Clase juegos
public class juegos extends AppCompatActivity {
    // Se realiza el llamado de los sonidos
    MediaPlayer mp;
    ImageButton silencio;
    // Se realiza el llamado a la imagen sonido activo
    Button silbos;


    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // Se realiza el llamado a la imagen sonido activo
        silbos=(Button) findViewById(R.id.SonidoAvatarJuego);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.SonidoAvatarJuegoSilencio);
        // sonido juegos
        mp= MediaPlayer.create(this,R.raw.lectura);

        //evento Botón incio
        Button inicio= (Button) findViewById(R.id.casa_juego);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                //Transiciones
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Finaliza la actividad
                finish();
            }
        });

        //evento Juegos silabas 1
        Button juegosil1= (Button) findViewById(R.id.juegosilabas1);
        juegosil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),juegosilabas1.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        //evento Juegos silabas 2
        Button juegosil2= (Button) findViewById(R.id.juegosilabas2);
        juegosil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),juegosilabas6.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        //evento Juego vocales
        Button vocales= (Button) findViewById(R.id.juegosvocales);
        vocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juego.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
            }
        });

        // evento que permite silenciar el avatar
        Button sonidoa = (Button)findViewById(R.id.SonidoAvatarJuego);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Try Catch que permite silenciar el avatar
                try {
                    // Detiene el sonido
                    mp.stop();
                    mp.prepare();
                    mp.seekTo(0);
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
        ImageButton sonidob = (ImageButton)findViewById(R.id.SonidoAvatarJuegoSilencio);
        sonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inicia el sonido
                mp.start();
                // Muestra el avatar activo
                silbos.setVisibility(View.VISIBLE);
                // Quita el avatar inactivo de pantalla
                silencio.setVisibility(View.INVISIBLE);


            }
        });

    }
}
