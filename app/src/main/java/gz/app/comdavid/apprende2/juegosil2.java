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
public class juegosil2 extends AppCompatActivity implements View.OnClickListener  {

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
        setContentView(R.layout.activity_juegosil2);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionase);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegocep);
        silbas=(ImageView) findViewById(R.id.siljuegocir);
        silbe=(ImageView) findViewById(R.id.siljuegococ);
        err=(ImageView) findViewById(R.id.silerror1);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista1);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido cepillo
        mp3= MediaPlayer.create(this,R.raw.cepillo);

        // se llaman las Imagenes
        findViewById(R.id.siljuegocep).setOnClickListener(this);
        findViewById(R.id.siljuegocir).setOnClickListener(this);
        findViewById(R.id.siljuegococ).setOnClickListener(this);
        findViewById(R.id.siljuegoce).setOnClickListener(this);


        // sonido de la silaba 2
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas2);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // inicia el sonido
                mp4.start();

            }
        });

        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill1);
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
            case R.id.siljuegococ:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // reproduce el sonido de error
                mp2.start();
                // detiene el sonido principal
                mp4.stop();

                break;
            // caso 2
            case R.id.siljuegocir:
                // Elimina el resto de imagenes que puedan estar en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();

                break;
            // caso 3
            case R.id.siljuegocep:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                // Reproduce el audio exitoso
                mp3.start();
                // detiene el sonido principal
                mp4.stop();
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil2.this,juegosil3.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();

                    }
                },4000);

                break;
            // Caso 4
            case R.id.siljuegoce:
                // Dertine el sonido principal
                mp4.stop();

                break;


        }
    }
}

