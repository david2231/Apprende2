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
import gz.app.comdavid.apprende2.juegosil31;
import gz.app.comdavid.apprende2.silabas;
//Clase
public class silaba_m extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silma,silmas,silme,silmes,silmo,silmos,silmis,silmi,silmu,silmus;
    //Declaramos las variables de sonidos
    MediaPlayer mpma,mpmaa,mpme,mpmee,mpmi,mpmii,mpmo,mpmoo,mpmu,mpmuu;


    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_m);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silma=(ImageView) findViewById(R.id.mamas);
        silmas=(ImageView) findViewById(R.id.mangos);
        silme=(ImageView) findViewById(R.id.medallas);
        silmes=(ImageView) findViewById(R.id.mesas);
        silmos=(ImageView) findViewById(R.id.montannas);
        silmo=(ImageView) findViewById(R.id.monedas);
        silmus=(ImageView) findViewById(R.id.munnecas);
        silmu=(ImageView) findViewById(R.id.murcielagos);
        silmis=(ImageView) findViewById(R.id.micos);
        silmi=(ImageView) findViewById(R.id.mieles);
        // evento que permite activar la silaba m
        findViewById(R.id.mas).setOnClickListener(this);
        findViewById(R.id.mes).setOnClickListener(this);
        findViewById(R.id.mos).setOnClickListener(this);
        findViewById(R.id.mis).setOnClickListener(this);
        findViewById(R.id.mus).setOnClickListener(this);

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casam);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), silabas.class);
                // transición
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                // finaliza actividad
                finish();
            }
        });
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigm);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil31.class);
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
            case R.id.mas:
                if(silma.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silma.setVisibility(View.VISIBLE);
                    silmas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);
                    // si se selecciona la imagen de mamá
                    ImageView sonidoba = (ImageView) findViewById(R.id.mamas);
                    mpma= MediaPlayer.create(this,R.raw.mama);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpma.start();

                        }
                    });
                    // si se selecciona la imagen de mango
                    ImageView sonidobaa = (ImageView) findViewById(R.id.mangos);
                    mpmaa= MediaPlayer.create(this,R.raw.mango);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.mes:
                if(silme.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silme.setVisibility(View.VISIBLE);
                    silmes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    // si se selecciona la imagen de medalla
                    ImageView sonidobe = (ImageView) findViewById(R.id.medallas);
                    // evento cuando se presione la imagen
                    mpme= MediaPlayer.create(this,R.raw.medalla);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpme.start();

                        }
                    });
                    // si se selecciona la imagen de mesa
                    ImageView sonidobee = (ImageView) findViewById(R.id.mesas);
                    mpmee= MediaPlayer.create(this,R.raw.mesa);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                }

                break;

            case R.id.mos:
                // si se selecciona la tercera opción
                if(silmo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silmo.setVisibility(View.VISIBLE);
                    silmos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    // si se selecciona la imagen de moneda
                    ImageView sonidobo = (ImageView) findViewById(R.id.monedas);
                    mpmo= MediaPlayer.create(this,R.raw.moneda);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmo.start();

                        }
                    });
                    // si se selecciona la imagen de montaña
                    ImageView sonidoboo = (ImageView) findViewById(R.id.montannas);
                    mpmoo= MediaPlayer.create(this,R.raw.montanna);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.mis:
                if(silmi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silmi.setVisibility(View.VISIBLE);
                    silmis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    // si se selecciona la imagen de mico
                    ImageView sonidobi = (ImageView) findViewById(R.id.micos);
                    mpmi= MediaPlayer.create(this,R.raw.mico);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmi.start();

                        }
                    });
                    // si se selecciona la imagen de miel
                    ImageView sonidobii = (ImageView) findViewById(R.id.mieles);
                    mpmii= MediaPlayer.create(this,R.raw.miel);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.mus:
                if(silmu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silmu.setVisibility(View.VISIBLE);
                    silmus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);

                    // si se selecciona la imagen de muñecas
                    ImageView sonidobu = (ImageView) findViewById(R.id.munnecas);
                    mpmu= MediaPlayer.create(this,R.raw.munneca);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmu.start();

                        }
                    });
                    // si se selecciona la imagen de lupa
                    ImageView sonidobuu = (ImageView) findViewById(R.id.murcielagos);
                    mpmuu= MediaPlayer.create(this,R.raw.murcielago);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpmuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);
                }

                break;
        }

    }
}