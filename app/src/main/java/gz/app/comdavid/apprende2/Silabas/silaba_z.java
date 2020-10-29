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
import gz.app.comdavid.apprende2.juegosil71;
import gz.app.comdavid.apprende2.silabas;

//Clase
public class silaba_z extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silza,silzas,silze,silzes,silzo,silzos,silzis,silzi,silzu,silzus;
    //Declaramos las variables de sonidos
    MediaPlayer mpza,mpzaa,mpze,mpzee,mpzi,mpzii,mpzo,mpzoo,mpzu,mpzuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_z);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silza=(ImageView) findViewById(R.id.zanahorias);
        silzas=(ImageView) findViewById(R.id.zapatos);
        silze=(ImageView) findViewById(R.id.zebras);
        silzo=(ImageView) findViewById(R.id.zorros);
        silzus=(ImageView) findViewById(R.id.zumbidos);
        silzu=(ImageView) findViewById(R.id.zumos);
        silzi=(ImageView) findViewById(R.id.zins);
        // evento que permite activar la silaba z
        findViewById(R.id.zas).setOnClickListener(this);
        findViewById(R.id.zes).setOnClickListener(this);
        findViewById(R.id.zos).setOnClickListener(this);
        findViewById(R.id.zis).setOnClickListener(this);
        findViewById(R.id.zus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigz);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil71.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });


        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casaz);
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
            case R.id.zas:
                if(silza.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silza.setVisibility(View.VISIBLE);
                    silzas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silze.setVisibility(View.GONE);
                    silzo.setVisibility(View.GONE);
                    silzi.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    // si se selecciona la imagen de zanahoria
                    ImageView sonidoba = (ImageView) findViewById(R.id.zanahorias);
                    mpza= MediaPlayer.create(this,R.raw.zanahoria);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpza.start();

                        }
                    });
                    // si se selecciona la imagen de zapato
                    ImageView sonidobaa = (ImageView) findViewById(R.id.zapatos);
                    mpzaa= MediaPlayer.create(this,R.raw.zapato);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpzaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.zes:
                if(silze.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silze.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silzo.setVisibility(View.GONE);
                    silzi.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    // si se selecciona la imagen de zebra
                    ImageView sonidobe = (ImageView) findViewById(R.id.zebras);
                    mpze= MediaPlayer.create(this,R.raw.zebra);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpze.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silze.setVisibility(View.GONE);

                }

                break;
            // si se selecciona la tercera opción
            case R.id.zos:
                if(silzo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silzo.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);
                    silzi.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    // si se selecciona la imagen de zorro
                    ImageView sonidobo = (ImageView) findViewById(R.id.zorros);
                    mpzo= MediaPlayer.create(this,R.raw.zorro);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpzo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silzo.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.zis:
                if(silzi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silzi.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silzo.setVisibility(View.GONE);
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    // si se selecciona la imagen de zinc
                    ImageView sonidobi = (ImageView) findViewById(R.id.zins);
                    mpzi= MediaPlayer.create(this,R.raw.zinc);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpzi.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silzi.setVisibility(View.GONE);

                }

                break;
            // si se selecciona la quinta opción
            case R.id.zus:
                if(silzu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silzu.setVisibility(View.VISIBLE);
                    silzus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silzi.setVisibility(View.GONE);
                    silzo.setVisibility(View.GONE);
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);

                    // si se selecciona la imagen de zumbido
                    ImageView sonidobu = (ImageView) findViewById(R.id.zumbidos);
                    mpzu= MediaPlayer.create(this,R.raw.zumbido);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpzu.start();

                        }
                    });
                    // si se selecciona la imagen de zumo
                    ImageView sonidobuu = (ImageView) findViewById(R.id.zumos);
                    mpzuu= MediaPlayer.create(this,R.raw.zumo);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpzuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
