package gz.app.comdavid.apprende2.Lectura.Ingles;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import java.io.IOException;

import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;

// Clase MainActivityIngles
public class mainactivity2 extends AppCompatActivity {
    // switch que permite cambiar de español a ingles
    Switch switchingles;
    //  Se realiza el llamado al botón silencio
    ImageButton silencio;
    // Se realiza el llamado a la imagen sonido activo
    Button silbos;
    // Se declaran los sonidos
    MediaPlayer mp;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // Se realiza el llamado a la imagen sonido activo
        silbos=(Button) findViewById(R.id.sonidoing);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.sonidooing);
        // sonido lectura
        mp= MediaPlayer.create(this,R.raw.sonidoingles);

        // evento que permite silenciar el avatar
        Button sonidoa = (Button)findViewById(R.id.sonidoing);
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
        ImageButton sonidob = (ImageButton)findViewById(R.id.sonidooing);
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

        // evento del botón regresar
        Button regresar= (Button) findViewById(R.id.backing);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent i =new Intent(mainactivity2.this, MainActivity.class);
                startActivity(i);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
            }
        });
        // evento frases en ingles
        Button pal= (Button) findViewById(R.id.palabraing);
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),read1.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                mp.stop();
                //Detiene los sonidos  que puedan estar reproduciendose
                finish();
            }
        });
        // Switch que cambia de ingles a español
        switchingles =(Switch) findViewById(R.id.switch1ing);
        // Evento Onclick  del switch
        switchingles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // validación si el botón  selaccionado
                if(switchingles.isEnabled()){
                    //Abrir una nueva actividad
                    Intent intent=new Intent(v.getContext(),MainActivity.class);
                    startActivityForResult(intent,0);
                    //Detiene los sonidos  que puedan estar reproduciendose
                    mp.stop();
                    finish();
                }
            }
        });

    }
}
