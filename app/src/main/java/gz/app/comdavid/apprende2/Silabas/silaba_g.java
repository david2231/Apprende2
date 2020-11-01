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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil21;

//Clase
public class silaba_g extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silga,silgas,silge,silges,silgo,silgos,silgis,silgi,silgu,silgus;
    //Declaramos las variables de sonidos
    MediaPlayer mpga,mpgaa,mpge,mpgee,mpgi,mpgii,mpgo,mpgoo,mpgu,mpguu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_g);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silga=(ImageView) findViewById(R.id.gasolinas);
        silgas=(ImageView) findViewById(R.id.gatos);
        silge=(ImageView) findViewById(R.id.gelatinas);
        silges=(ImageView) findViewById(R.id.genios);
        silgos=(ImageView) findViewById(R.id.gorras);
        silgo=(ImageView) findViewById(R.id.gotas);
        silgus=(ImageView) findViewById(R.id.guantes);
        silgu=(ImageView) findViewById(R.id.gusanos);
        silgis=(ImageView) findViewById(R.id.gigantes);
        silgi=(ImageView) findViewById(R.id.girasoles);
        // evento que permite activar la silaba g
        findViewById(R.id.gas).setOnClickListener(this);
        findViewById(R.id.ges).setOnClickListener(this);
        findViewById(R.id.gos).setOnClickListener(this);
        findViewById(R.id.gis).setOnClickListener(this);
        findViewById(R.id.gus).setOnClickListener(this);

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casag);
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
        Button sig= (Button) findViewById(R.id.sigg);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil21.class);
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
            case R.id.gas:
                if(silga.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silga.setVisibility(View.VISIBLE);
                    silgas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    // si se selecciona la imagen de gato
                    ImageView sonidoga = (ImageView) findViewById(R.id.gatos);
                    mpga= MediaPlayer.create(this,R.raw.gato);
                    // evento cuando se presione la imagen
                    sonidoga.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpga.start();

                        }
                    });

                    // si se selecciona la imagen de gasolina
                    ImageView sonidogaa = (ImageView) findViewById(R.id.gasolinas);
                    mpgaa= MediaPlayer.create(this,R.raw.gasolina);
                    // evento cuando se presione la imagen
                    sonidogaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.ges:
                if(silge.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silge.setVisibility(View.VISIBLE);
                    silges.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    // si se selecciona la imagen de genio
                    ImageView sonidoge = (ImageView) findViewById(R.id.genios);
                    mpge= MediaPlayer.create(this,R.raw.genio);
                    // evento cuando se presione la imagen
                    sonidoge.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpge.start();

                        }
                    });
                    // si se selecciona la imagen de gelatina
                    ImageView sonidogee = (ImageView) findViewById(R.id.gelatinas);
                    mpgee= MediaPlayer.create(this,R.raw.gelatina);
                    // evento cuando se presione la imagen
                    sonidogee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.gos:
                if(silgo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silgo.setVisibility(View.VISIBLE);
                    silgos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    // si se selecciona la imagen de gota
                    ImageView sonigobo = (ImageView) findViewById(R.id.gotas);
                    mpgo= MediaPlayer.create(this,R.raw.gota);
                    // evento cuando se presione la imagen
                    sonigobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgo.start();

                        }
                    });
                    // si se selecciona la imagen de gorra
                    ImageView sonigoboo = (ImageView) findViewById(R.id.gorras);
                    mpgoo= MediaPlayer.create(this,R.raw.gorro);
                    // evento cuando se presione la imagen
                    sonigoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.gis:
                if(silgi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silgi.setVisibility(View.VISIBLE);
                    silgis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    // si se selecciona la imagen de gigante
                    ImageView sonidogi = (ImageView) findViewById(R.id.gigantes);
                    mpgi= MediaPlayer.create(this,R.raw.gigante);
                    // evento cuando se presione la imagen
                    sonidogi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        // inicia el sonido
                            mpgi.start();

                        }
                    });
                // si se selecciona la imagen de girasol
                    ImageView sonidogii = (ImageView) findViewById(R.id.girasoles);
                    mpgii= MediaPlayer.create(this,R.raw.girasol);
                    // evento cuando se presione la imagen
                    sonidogii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.gus:
                if(silgu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silgu.setVisibility(View.VISIBLE);
                    silgus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);

                    // si se selecciona la imagen de guante
                    ImageView sonigobu = (ImageView) findViewById(R.id.guantes);
                    mpgu= MediaPlayer.create(this,R.raw.guantees);
                    // evento cuando se presione la imagen
                    sonigobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpgu.start();

                        }
                    });
                    // si se selecciona la imagen de gusano
                    ImageView sonidoguu = (ImageView) findViewById(R.id.gusanos);
                    mpguu= MediaPlayer.create(this,R.raw.gusano);
                    // evento cuando se presione la imagen
                    sonidoguu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpguu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);
                }

                break;
        }

    }
}