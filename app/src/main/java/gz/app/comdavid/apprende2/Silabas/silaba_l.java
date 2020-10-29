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
import gz.app.comdavid.apprende2.juegosil26;
import gz.app.comdavid.apprende2.silabas;

//Clase
public class silaba_l extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silla,sillas,sille,silles,sillo,sillos,sillis,silli,sillu,sillus;
    //Declaramos las variables de sonidos
    MediaPlayer mpla,mplaa,mple,mplee,mpli,mplii,mplo,mploo,mplu,mpluu;


    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_l);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silla=(ImageView) findViewById(R.id.ladrillos);
        sillas=(ImageView) findViewById(R.id.lamparas);
        sille=(ImageView) findViewById(R.id.leches);
        silles=(ImageView) findViewById(R.id.lenguas);
        sillos=(ImageView) findViewById(R.id.lobos);
        sillo=(ImageView) findViewById(R.id.loros);
        sillus=(ImageView) findViewById(R.id.lupas);
        sillu=(ImageView) findViewById(R.id.lunas);
        sillis=(ImageView) findViewById(R.id.libros);
        silli=(ImageView) findViewById(R.id.limones);
        // evento que permite activar la silaba l
        findViewById(R.id.las).setOnClickListener(this);
        findViewById(R.id.les).setOnClickListener(this);
        findViewById(R.id.los).setOnClickListener(this);
        findViewById(R.id.lis).setOnClickListener(this);
        findViewById(R.id.lus).setOnClickListener(this);

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casal);
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
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigl);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil26.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
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
            case R.id.las:
                if(silla.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silla.setVisibility(View.VISIBLE);
                    sillas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);
                    // si se selecciona la imagen de lampara
                    ImageView sonidoba = (ImageView) findViewById(R.id.lamparas);
                    mpla= MediaPlayer.create(this,R.raw.lampara);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpla.start();

                        }
                    });
                    // si se selecciona la imagen de ladrillo
                    ImageView sonidobaa = (ImageView) findViewById(R.id.ladrillos);
                    mplaa= MediaPlayer.create(this,R.raw.ladrillo);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mplaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                }

                break;
            case R.id.les:
                // si se selecciona la segunda opción
                if(sille.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sille.setVisibility(View.VISIBLE);
                    silles.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    // si se selecciona la imagen de leche
                    ImageView sonidobe = (ImageView) findViewById(R.id.leches);
                    // evento cuando se presione la imagen
                    mple= MediaPlayer.create(this,R.raw.leche);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mple.start();

                        }
                    });
                    // si se selecciona la imagen de lengua
                    ImageView sonidobee = (ImageView) findViewById(R.id.lenguas);
                    // evento cuando se presione la imagen
                    mplee= MediaPlayer.create(this,R.raw.lengua);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mplee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                }

                break;

            case R.id.los:
                // si se selecciona la tercera opción
                if(sillo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sillo.setVisibility(View.VISIBLE);
                    sillos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    // si se selecciona la imagen de lobo
                    ImageView sonidobo = (ImageView) findViewById(R.id.lobos);
                    mplo= MediaPlayer.create(this,R.raw.lobo);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mplo.start();

                        }
                    });
                    // si se selecciona la imagen de loro
                    ImageView sonidoboo = (ImageView) findViewById(R.id.loros);
                    mploo= MediaPlayer.create(this,R.raw.loro);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mploo.start();

                        }
                    });
                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.lis:
                if(silli.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silli.setVisibility(View.VISIBLE);
                    sillis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    // si se selecciona la imagen de libro
                    ImageView sonidobi = (ImageView) findViewById(R.id.libros);
                    mpli= MediaPlayer.create(this,R.raw.libro);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpli.start();

                        }
                    });
                    // si se selecciona la imagen de limón
                    ImageView sonidobii = (ImageView) findViewById(R.id.limones);
                    mplii= MediaPlayer.create(this,R.raw.limon);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mplii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.lus:
                if(sillu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sillu.setVisibility(View.VISIBLE);
                    sillus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);

                    // si se selecciona la imagen de luna
                    ImageView sonidobu = (ImageView) findViewById(R.id.lunas);
                    mplu= MediaPlayer.create(this,R.raw.luna);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mplu.start();

                        }
                    });
                    // si se selecciona la imagen de lupa
                    ImageView sonidobuu = (ImageView) findViewById(R.id.lupas);
                    mpluu= MediaPlayer.create(this,R.raw.lupa);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpluu.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);
                }

                break;
        }

    }
}


