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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil;

//Clase
public class silaba_c extends AppCompatActivity implements View.OnClickListener {
    //Declaramos las variables de imagenes
    ImageView silca,silcas,silce,silces,silco,silcos,silcis,silci,silcu,silcus;
    //Declaramos las variables de sonidos
    MediaPlayer mpca,mpcaa,mpce,mpcee,mpci,mpcii,mpco,mpcoo,mpcu,mpcuu;

    //Metodo OnClick

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_c);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silca=(ImageView) findViewById(R.id.casas);
        silcas=(ImageView) findViewById(R.id.carro);
        silce=(ImageView) findViewById(R.id.cepillo);
        silces=(ImageView) findViewById(R.id.cerebro);
        silcos=(ImageView) findViewById(R.id.coco);
        silco=(ImageView) findViewById(R.id.cocodrilo);
        silcus=(ImageView) findViewById(R.id.cuaderno);
        silcu=(ImageView) findViewById(R.id.cucaracha);
        silcis=(ImageView) findViewById(R.id.ciervo);
        silci=(ImageView) findViewById(R.id.circo);
        // evento que permite activar la silaba c
        findViewById(R.id.ca).setOnClickListener(this);
        findViewById(R.id.ce).setOnClickListener(this);
        findViewById(R.id.co).setOnClickListener(this);
        findViewById(R.id.ci).setOnClickListener(this);
        findViewById(R.id.cu).setOnClickListener(this);
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigc);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });
        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casad);
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
            // caso CA
            case R.id.ca:
                // si se selecciona la primera opción
                if(silca.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silca.setVisibility(View.VISIBLE);
                    silcas.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    // si se selecciona la imagen de carro
                    ImageView sonidoba = (ImageView) findViewById(R.id.carro);
                    mpca= MediaPlayer.create(this,R.raw.carroo);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpca.start();

                        }
                    });
                    // si se selecciona la imagen de casa
                    ImageView sonidobaa = (ImageView) findViewById(R.id.casas);
                    mpcaa= MediaPlayer.create(this,R.raw.casa);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                }

                break;
            // caso CE
            case R.id.ce:
                // si se selecciona la segunda opción
                if(silce.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silce.setVisibility(View.VISIBLE);
                    silces.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    // si se selecciona la imagen de cepillo
                    ImageView sonidobe = (ImageView) findViewById(R.id.cepillo);
                    mpce= MediaPlayer.create(this,R.raw.cepillo);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpce.start();

                        }
                    });
                    // si se selecciona la imagen de cerebro
                    ImageView sonidobee = (ImageView) findViewById(R.id.cerebro);
                    mpcee= MediaPlayer.create(this,R.raw.cerebro);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcee.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                }

                break;
            // caso CO
            case R.id.co:
                // si se selecciona la tercera
                if(silco.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silco.setVisibility(View.VISIBLE);
                    silcos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    // si se selecciona la imagen de coco
                    ImageView sonidobo = (ImageView) findViewById(R.id.coco);
                    mpco= MediaPlayer.create(this,R.raw.coco);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpco.start();

                        }
                    });
                    // si se selecciona la imagen de cocodrilo
                    ImageView sonidoboo = (ImageView) findViewById(R.id.cocodrilo);
                    mpcoo= MediaPlayer.create(this,R.raw.cocodrilo);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                }
                break;
            // caso CI
            case R.id.ci:
                // si se selecciona la cuarta opción
                if(silci.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silci.setVisibility(View.VISIBLE);
                    silcis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    // si se selecciona la imagen de ciervo
                    ImageView sonidobi = (ImageView) findViewById(R.id.ciervo);
                    mpci= MediaPlayer.create(this,R.raw.ciervo);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpci.start();

                        }
                    });
                    // si se selecciona la imagen de circo
                    ImageView sonidobii = (ImageView) findViewById(R.id.circo);
                    mpcii= MediaPlayer.create(this,R.raw.circo);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                }

                break;
            // caso CU
            case R.id.cu:
                // si se selecciona la cuarta opción
                if(silcu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silcu.setVisibility(View.VISIBLE);
                    silcus.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);

                    // si se selecciona la imagen de cuaderno
                    ImageView sonidobu = (ImageView) findViewById(R.id.cuaderno);
                    mpcu= MediaPlayer.create(this,R.raw.cuaderno);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcu.start();

                        }
                    });
                    // si se selecciona la imagen de cucaracha
                    ImageView sonidobuu = (ImageView) findViewById(R.id.cucaracha);
                    mpcuu= MediaPlayer.create(this,R.raw.cucaracha);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpcuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);
                }

                break;
        }
    }
}
