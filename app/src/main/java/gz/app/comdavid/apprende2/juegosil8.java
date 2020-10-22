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
public class juegosil8 extends AppCompatActivity implements View.OnClickListener  {

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
        setContentView(R.layout.activity_juegosil8);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionavi);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegobi3);
        silbas=(ImageView) findViewById(R.id.siljuegoba3);
        silbe=(ImageView) findViewById(R.id.siljuegobu2);
        err=(ImageView) findViewById(R.id.silerror8);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista8);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido bicicleta
        mp3= MediaPlayer.create(this,R.raw.bicicleta);
        // se llaman las Imagenes
        findViewById(R.id.siljuegobi3).setOnClickListener(this);
        findViewById(R.id.siljuegobi2).setOnClickListener(this);
        findViewById(R.id.siljuegoba3).setOnClickListener(this);
        findViewById(R.id.siljuegobu2).setOnClickListener(this);
        // sonido de la silaba 8
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas8);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill8);
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
            case R.id.siljuegoba3:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();

                break;
            // caso 2
            case R.id.siljuegobu2:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();
                break;
            //caso 3
            case R.id.siljuegobi3:
                // Elimina el resto de imagenes que puedan estar en pantalla
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                 // detiene el sonido principal
                mp4.stop();
                // Reproduce el audio exitoso
                mp3.start();
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil8.this,juegosil9.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();


                    }
                },4000);
                break;

            // Caso 4
            case R.id.siljuegobi2:
                // Dertine el sonido principal
                mp4.stop();
                break;


        }
    }
}



