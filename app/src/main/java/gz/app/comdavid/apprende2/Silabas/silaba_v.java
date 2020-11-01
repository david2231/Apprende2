package gz.app.comdavid.apprende2.Silabas;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil61;

//Clase
public class silaba_v extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silva,silvas,silve,silves,silvo,silvos,silvis,silvi,silvu,silvus;
    //Declaramos las variables de sonidos
    MediaPlayer mpva,mpvaa,mpve,mpvee,mpvi,mpvii,mpvo,mpvoo,mpvu,mpvuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_v);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silva=(ImageView) findViewById(R.id.vacas);
        silvas=(ImageView) findViewById(R.id.vasos);
        silve=(ImageView) findViewById(R.id.venenos);
        silves=(ImageView) findViewById(R.id.ventanas);
        silvos=(ImageView) findViewById(R.id.volcaless);
        silvo=(ImageView) findViewById(R.id.volcanes);
        silvus=(ImageView) findViewById(R.id.vuelos);
        silvu=(ImageView) findViewById(R.id.vueltas);
        silvis=(ImageView) findViewById(R.id.viboras);
        silvi=(ImageView) findViewById(R.id.viruss);
        // evento que permite activar la silaba v
        findViewById(R.id.vas).setOnClickListener(this);
        findViewById(R.id.ves).setOnClickListener(this);
        findViewById(R.id.vos).setOnClickListener(this);
        findViewById(R.id.vis).setOnClickListener(this);
        findViewById(R.id.vus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigv);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil61.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casav);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                // finaliza actividad
                finish();
            }
        });

    }
    // Método OnClick
    @Override
    public void onClick(View view) {
        // Switch Case
        switch (view.getId()) {
            // si se selecciona la primera opción
            case R.id.vas:
                if(silva.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silva.setVisibility(View.VISIBLE);
                    silvas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);

                    // si se selecciona la imagen de vaca
                    ImageView sonidoba = (ImageView) findViewById(R.id.vacas);
                    mpva= MediaPlayer.create(this,R.raw.vaca);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpva.start();

                        }
                    });
                    // si se selecciona la imagen de vaso
                    ImageView sonidobaa = (ImageView) findViewById(R.id.vasos);
                    mpvaa= MediaPlayer.create(this,R.raw.vaso);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.ves:
                if(silve.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silve.setVisibility(View.VISIBLE);
                    silves.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);
                    // si se selecciona la imagen de veneno
                    ImageView sonidobe = (ImageView) findViewById(R.id.venenos);
                    mpve= MediaPlayer.create(this,R.raw.veneno);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpve.start();

                        }
                    });
                    // si se selecciona la imagen de ventana
                    ImageView sonidobee = (ImageView) findViewById(R.id.ventanas);
                    mpvee= MediaPlayer.create(this,R.raw.ventana);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvee.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                }

                break;

            case R.id.vos:
                // si se selecciona la tercera opción
                if(silvo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silvo.setVisibility(View.VISIBLE);
                    silvos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);

                    // si se selecciona la imagen de vocal
                    ImageView sonidobo = (ImageView) findViewById(R.id.volcaless);
                    mpvo= MediaPlayer.create(this,R.raw.vocal);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvo.start();

                        }
                    });
                    // si se selecciona la imagen de volcan
                    ImageView sonidoboo = (ImageView) findViewById(R.id.volcanes);
                    mpvoo= MediaPlayer.create(this,R.raw.volcan);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.vis:
                if(silvi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silvi.setVisibility(View.VISIBLE);
                    silvis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);
                    // si se selecciona la imagen de vibora
                    ImageView sonidobi = (ImageView) findViewById(R.id.viboras);
                    mpvi= MediaPlayer.create(this,R.raw.vibora);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvi.start();

                        }
                    });
                    // si se selecciona la imagen de virus
                    ImageView sonidobii = (ImageView) findViewById(R.id.viruss);
                    mpvii= MediaPlayer.create(this,R.raw.virus);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        // inicia el sonido
                            mpvii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.vus:
                if(silvu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silvu.setVisibility(View.VISIBLE);
                    silvus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    // si se selecciona la imagen de vuelo
                    ImageView sonidobu = (ImageView) findViewById(R.id.vuelos);
                    mpvu= MediaPlayer.create(this,R.raw.vuelo);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvu.start();

                        }
                    });
                    // si se selecciona la imagen de vuelta
                    ImageView sonidobuu = (ImageView) findViewById(R.id.vueltas);
                    mpvuu= MediaPlayer.create(this,R.raw.vuelta);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpvuu.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);
                }

                break;
        }

    }
}