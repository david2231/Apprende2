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
import gz.app.comdavid.apprende2.juegosil56;
import gz.app.comdavid.apprende2.silabas;

//Clase
public class silabas_t extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silta,siltas,silte,siltes,silto,siltos,siltis,silti,siltu,siltus;
    //Declaramos las variables de sonidos
    MediaPlayer mpta,mptaa,mpte,mptee,mpti,mptii,mpto,mptoo,mptu,mptuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silabas_t);
//Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silta=(ImageView) findViewById(R.id.tablas);
        siltas=(ImageView) findViewById(R.id.tarjetas);
        silte=(ImageView) findViewById(R.id.teteros);
        siltes=(ImageView) findViewById(R.id.telefonos);
        siltos=(ImageView) findViewById(R.id.tomates);
        silto=(ImageView) findViewById(R.id.toros);
        siltus=(ImageView) findViewById(R.id.tubos);
        siltu=(ImageView) findViewById(R.id.tucanes);
        siltis=(ImageView) findViewById(R.id.tiburones);
        silti=(ImageView) findViewById(R.id.tigres);
        // evento que permite activar la silaba t
        findViewById(R.id.tas).setOnClickListener(this);
        findViewById(R.id.tes).setOnClickListener(this);
        findViewById(R.id.tos).setOnClickListener(this);
        findViewById(R.id.tis).setOnClickListener(this);
        findViewById(R.id.tus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigrt);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil56.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });
        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casat);
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
            case R.id.tas:
                if(silta.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silta.setVisibility(View.VISIBLE);
                    siltas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    // si se selecciona la imagen de tabla
                    ImageView sonidoba = (ImageView) findViewById(R.id.tablas);
                    mpta= MediaPlayer.create(this,R.raw.tabla);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpta.start();

                        }
                    });
                    // si se selecciona la imagen de tarjetas
                    ImageView sonidobaa = (ImageView) findViewById(R.id.tarjetas);
                    mptaa= MediaPlayer.create(this,R.raw.tarjeta);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.tes:
                if(silte.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silte.setVisibility(View.VISIBLE);
                    siltes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);
                    // si se selecciona la imagen de tetero
                    ImageView sonidobe = (ImageView) findViewById(R.id.teteros);
                    mpte= MediaPlayer.create(this,R.raw.tetero);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpte.start();

                        }
                    });
                    // si se selecciona la imagen de telefono
                    ImageView sonidobee = (ImageView) findViewById(R.id.telefonos);
                    mptee= MediaPlayer.create(this,R.raw.telefono);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.tos:
                if(silto.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silto.setVisibility(View.VISIBLE);
                    siltos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    // si se selecciona la imagen de tomate
                    ImageView sonidobo = (ImageView) findViewById(R.id.tomates);
                    mpto= MediaPlayer.create(this,R.raw.tomate);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpto.start();

                        }
                    });
                    // si se selecciona la imagen de tarea
                    ImageView sonidoboo = (ImageView) findViewById(R.id.toros);
                    mptoo= MediaPlayer.create(this,R.raw.toro);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptoo.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.tis:
                if(silti.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silti.setVisibility(View.VISIBLE);
                    siltis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    // si se selecciona la imagen de tiburón
                    ImageView sonidobi = (ImageView) findViewById(R.id.tiburones);
                    mpti= MediaPlayer.create(this,R.raw.tiburon);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpti.start();

                        }
                    });
                    // si se selecciona la imagen de tigre
                    ImageView sonidobii = (ImageView) findViewById(R.id.tigres);
                    mptii= MediaPlayer.create(this,R.raw.tigre);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.tus:
                if(siltu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    siltu.setVisibility(View.VISIBLE);
                    siltus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);

                    // si se selecciona la imagen de tubo
                    ImageView sonidobu = (ImageView) findViewById(R.id.tubos);
                    mptu= MediaPlayer.create(this,R.raw.tubo);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptu.start();

                        }
                    });
                    // si se selecciona la imagen de vuelta
                    ImageView sonidobuu = (ImageView) findViewById(R.id.tucanes);
                    mptuu= MediaPlayer.create(this,R.raw.tucan);
                    //evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mptuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);
                }

                break;
        }

    }
}