package gz.app.comdavid.apprende2;

//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

//Clase Juegossilaba
public class juegosil7 extends AppCompatActivity implements View.OnClickListener  {

    //Se declaran los image view
    ImageView silba,silbas,silbe,err;
    //Se declaran los sonidos
    MediaPlayer mp,mp2,mp3,mp4;
    //Se declara la vista principal
    RelativeLayout casss;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil7);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionave);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegobe3);
        silbas=(ImageView) findViewById(R.id.siljuegobu);
        silbe=(ImageView) findViewById(R.id.siljuegobo);
        err=(ImageView) findViewById(R.id.silerror7);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista7);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido bebida
        mp3= MediaPlayer.create(this,R.raw.bebida);
        // se llaman las Imagenes
        findViewById(R.id.siljuegobe3).setOnClickListener(this);
        findViewById(R.id.siljuegobe2).setOnClickListener(this);
        findViewById(R.id.siljuegobu).setOnClickListener(this);
        findViewById(R.id.siljuegobo).setOnClickListener(this);

        // sonido de la silaba 7
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas7);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill7);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abre una actividad
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                // transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                // detiene los sonidos
                mp4.stop();
                // finaliza la actividad
                finish();
            }
        });

    }

    // Metodo onClick
    @Override
    public void onClick(View view) {
        // Switch Case dependiendo de la opción del usuario
        switch (view.getId()) {
            // caso 1
            case R.id.siljuegobo:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // reproduce el sonido de error
                mp4.stop();
                // detiene el sonido principal
                mp2.start();

                break;

            //caso 2
            case R.id.siljuegobu:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // reproduce el sonido de error
                mp4.stop();
                // detiene el sonido principal
                mp2.start();

                break;
             //caso 3
            case R.id.siljuegobe3:
                // Elimina el resto de imagenes que puedan estar en pantalla
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                // Reproduce el audio exitoso
                mp4.stop();
                // detiene el sonido principal
                mp3.start();
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil7.this,juegosil8.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();

                    }
                },4000);

                break;
            //caso 4
            case R.id.siljuegobe2:
                // Dertine el sonido principal
                mp4.stop();
                break;


        }
    }
}



