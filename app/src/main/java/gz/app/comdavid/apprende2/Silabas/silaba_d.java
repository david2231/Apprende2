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
import gz.app.comdavid.apprende2.juegosil11;
import gz.app.comdavid.apprende2.silabas;

//Clase
public class silaba_d extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silda,sildas,silde,sildes,sildo,sildos,sildis,sildi,sildu,sildus;
    //Declaramos las variables de sonidos
    MediaPlayer mpda,mpdaa,mpde,mpdee,mpdi,mpdii,mpdo,mpdoo,mpdu,mpduu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_d);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silda=(ImageView) findViewById(R.id.dados);
        sildas=(ImageView) findViewById(R.id.dardos);
        silde=(ImageView) findViewById(R.id.dedos);
        sildes=(ImageView) findViewById(R.id.delfins);
        sildos=(ImageView) findViewById(R.id.dolares);
        sildo=(ImageView) findViewById(R.id.doctores);
        sildus=(ImageView) findViewById(R.id.duendes);
        sildu=(ImageView) findViewById(R.id.dulces);
        sildis=(ImageView) findViewById(R.id.dientes);
        sildi=(ImageView) findViewById(R.id.diamanetes);
        // evento que permite activar la silaba d
        findViewById(R.id.das).setOnClickListener(this);
        findViewById(R.id.des).setOnClickListener(this);
        findViewById(R.id.dos).setOnClickListener(this);
        findViewById(R.id.dis).setOnClickListener(this);
        findViewById(R.id.dus).setOnClickListener(this);

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
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigd);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil11.class);
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
            // caso DA
            case R.id.das:
                // si se selecciona la primera opción
                if(silda.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silda.setVisibility(View.VISIBLE);
                    sildas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    // si se selecciona la imagen de dardo
                    ImageView sonidoba = (ImageView) findViewById(R.id.dardos);
                    mpda= MediaPlayer.create(this,R.raw.dardo);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpda.start();

                        }
                    });

                    // si se selecciona la imagen de dado
                    ImageView sonidobaa = (ImageView) findViewById(R.id.dados);
                    mpdaa= MediaPlayer.create(this,R.raw.dado);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                }

                break;
            // caso DE
            case R.id.des:
                // si se selecciona la segunda opción
                if(silde.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silde.setVisibility(View.VISIBLE);
                    sildes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    // si se selecciona la imagen de dedo
                    ImageView sonidobe = (ImageView) findViewById(R.id.dedos);
                    mpde= MediaPlayer.create(this,R.raw.dedo);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpde.start();

                        }
                    });
                    // si se selecciona la imagen de delfin
                    ImageView sonidobee = (ImageView) findViewById(R.id.delfins);
                    mpdee= MediaPlayer.create(this,R.raw.delfin);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                }

                break;
            // caso DO
            case R.id.dos:
                // si se selecciona la tercera
                if(sildo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sildo.setVisibility(View.VISIBLE);
                    sildos.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    // si se selecciona la imagen de doctor
                    ImageView sonidobo = (ImageView) findViewById(R.id.doctores);
                    mpdo= MediaPlayer.create(this,R.raw.doctor);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdo.start();

                        }
                    });
                    // si se selecciona la imagen de dolar
                    ImageView sonidoboo = (ImageView) findViewById(R.id.dolares);
                    mpdoo= MediaPlayer.create(this,R.raw.dolar);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                }
                break;
            // caso DI
            case R.id.dis:
                // si se selecciona la cuarta opción
                if(sildi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sildi.setVisibility(View.VISIBLE);
                    sildis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    // si se selecciona la imagen de diente
                    ImageView sonidobi = (ImageView) findViewById(R.id.dientes);
                    mpdi= MediaPlayer.create(this,R.raw.diente);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.diamanetes);
                    mpdii= MediaPlayer.create(this,R.raw.diamante);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                }

                break;
            // caso DU
            case R.id.dus:
                // si se selecciona la cuarta opción
                if(sildu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    sildu.setVisibility(View.VISIBLE);
                    sildus.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);

                    // si se selecciona la imagen de duende
                    ImageView sonidobu = (ImageView) findViewById(R.id.duendes);
                    mpdu= MediaPlayer.create(this,R.raw.duende);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpdu.start();

                        }
                    });

                    // si se selecciona la imagen de dulces
                    ImageView sonidobuu = (ImageView) findViewById(R.id.dulces);
                    mpduu= MediaPlayer.create(this,R.raw.dulce);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpduu.start();

                        }
                    });

                }
                else{

                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
