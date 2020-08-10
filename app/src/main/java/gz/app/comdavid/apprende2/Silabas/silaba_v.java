package gz.app.comdavid.apprende2.Silabas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil61;
import gz.app.comdavid.apprende2.silabas;

public class silaba_v extends AppCompatActivity  implements View.OnClickListener{

    ImageView silva,silvas,silve,silves,silvo,silvos,silvis,silvi,silvu,silvus;
    MediaPlayer mpva;
    MediaPlayer mpvaa;
    MediaPlayer mpve;
    MediaPlayer mpvee;
    MediaPlayer mpvi;
    MediaPlayer mpvii;
    MediaPlayer mpvo;
    MediaPlayer mpvoo;
    MediaPlayer mpvu;
    MediaPlayer mpvuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_v);

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
        findViewById(R.id.vas).setOnClickListener(this);
        findViewById(R.id.ves).setOnClickListener(this);
        findViewById(R.id.vos).setOnClickListener(this);
        findViewById(R.id.vis).setOnClickListener(this);
        findViewById(R.id.vus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigv);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil61.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casav);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.vas:
                if(silva.getVisibility()==View.GONE){

                    silva.setVisibility(View.VISIBLE);
                    silvas.setVisibility(View.VISIBLE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);


                    ImageView sonidoba = (ImageView) findViewById(R.id.vacas);
                    mpva= MediaPlayer.create(this,R.raw.vaca);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpva.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.vasos);
                    mpvaa= MediaPlayer.create(this,R.raw.vaso);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvaa.start();

                        }
                    });












                }
                else{
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                }

                break;
            case R.id.ves:
                if(silve.getVisibility()==View.GONE){
                    silve.setVisibility(View.VISIBLE);
                    silves.setVisibility(View.VISIBLE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.venenos);
                    mpve= MediaPlayer.create(this,R.raw.veneno);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpve.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.ventanas);
                    mpvee= MediaPlayer.create(this,R.raw.ventana);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvee.start();

                        }
                    });



                }
                else{
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                }

                break;

            case R.id.vos:
                if(silvo.getVisibility()==View.GONE){
                    silvo.setVisibility(View.VISIBLE);
                    silvos.setVisibility(View.VISIBLE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.volcaless);
                    mpvo= MediaPlayer.create(this,R.raw.vocal);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.volcanes);
                    mpvoo= MediaPlayer.create(this,R.raw.volcan);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvoo.start();

                        }
                    });

                }
                else{
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                }
                break;

            case R.id.vis:
                if(silvi.getVisibility()==View.GONE){
                    silvi.setVisibility(View.VISIBLE);
                    silvis.setVisibility(View.VISIBLE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.viboras);
                    mpvi= MediaPlayer.create(this,R.raw.vibora);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.viruss);
                    mpvii= MediaPlayer.create(this,R.raw.virus);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvii.start();

                        }
                    });

                }
                else{
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                }

                break;

            case R.id.vus:
                if(silvu.getVisibility()==View.GONE){
                    silvu.setVisibility(View.VISIBLE);
                    silvus.setVisibility(View.VISIBLE);
                    silvi.setVisibility(View.GONE);
                    silvis.setVisibility(View.GONE);
                    silvo.setVisibility(View.GONE);
                    silvos.setVisibility(View.GONE);
                    silva.setVisibility(View.GONE);
                    silvas.setVisibility(View.GONE);
                    silve.setVisibility(View.GONE);
                    silves.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.vuelos);
                    mpvu= MediaPlayer.create(this,R.raw.vuelo);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.vueltas);
                    mpvuu= MediaPlayer.create(this,R.raw.vuelta);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpvuu.start();

                        }
                    });


                }
                else{
                    silvu.setVisibility(View.GONE);
                    silvus.setVisibility(View.GONE);
                }

                break;
        }

    }
}