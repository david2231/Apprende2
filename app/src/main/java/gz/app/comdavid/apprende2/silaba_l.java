package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_l extends AppCompatActivity  implements View.OnClickListener{

    ImageView silla,sillas,sille,silles,sillo,sillos,sillis,silli,sillu,sillus;
    MediaPlayer mpla;
    MediaPlayer mplaa;
    MediaPlayer mple;
    MediaPlayer mplee;
    MediaPlayer mpli;
    MediaPlayer mplii;
    MediaPlayer mplo;
    MediaPlayer mploo;
    MediaPlayer mplu;
    MediaPlayer mpluu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_l);

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
        findViewById(R.id.las).setOnClickListener(this);
        findViewById(R.id.les).setOnClickListener(this);
        findViewById(R.id.los).setOnClickListener(this);
        findViewById(R.id.lis).setOnClickListener(this);
        findViewById(R.id.lus).setOnClickListener(this);

        Button inicio= (Button) findViewById(R.id.sil_casal);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });
        Button sig= (Button) findViewById(R.id.sigl);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil26.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.las:
                if(silla.getVisibility()==View.GONE){

                    silla.setVisibility(View.VISIBLE);
                    sillas.setVisibility(View.VISIBLE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.lamparas);
                    mpla= MediaPlayer.create(this,R.raw.lampara);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpla.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.ladrillos);
                    mplaa= MediaPlayer.create(this,R.raw.ladrillo);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mplaa.start();

                        }
                    });








                }
                else{
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                }

                break;
            case R.id.les:
                if(sille.getVisibility()==View.GONE){
                    sille.setVisibility(View.VISIBLE);
                    silles.setVisibility(View.VISIBLE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.leches);
                    mple= MediaPlayer.create(this,R.raw.leche);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mple.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.lenguas);
                    mplee= MediaPlayer.create(this,R.raw.lengua);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mplee.start();

                        }
                    });


                }
                else{
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                }

                break;

            case R.id.los:
                if(sillo.getVisibility()==View.GONE){
                    sillo.setVisibility(View.VISIBLE);
                    sillos.setVisibility(View.VISIBLE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.lobos);
                    mplo= MediaPlayer.create(this,R.raw.lobo);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mplo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.loros);
                    mploo= MediaPlayer.create(this,R.raw.loro);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mploo.start();

                        }
                    });


                }
                else{
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                }
                break;

            case R.id.lis:
                if(silli.getVisibility()==View.GONE){
                    silli.setVisibility(View.VISIBLE);
                    sillis.setVisibility(View.VISIBLE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.libros);
                    mpli= MediaPlayer.create(this,R.raw.libro);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpli.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.limones);
                    mplii= MediaPlayer.create(this,R.raw.limon);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mplii.start();

                        }
                    });

                }
                else{
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                }

                break;

            case R.id.lus:
                if(sillu.getVisibility()==View.GONE){
                    sillu.setVisibility(View.VISIBLE);
                    sillus.setVisibility(View.VISIBLE);
                    silli.setVisibility(View.GONE);
                    sillis.setVisibility(View.GONE);
                    sillo.setVisibility(View.GONE);
                    sillos.setVisibility(View.GONE);
                    silla.setVisibility(View.GONE);
                    sillas.setVisibility(View.GONE);
                    sille.setVisibility(View.GONE);
                    silles.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.lunas);
                    mplu= MediaPlayer.create(this,R.raw.luna);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mplu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.lupas);
                    mpluu= MediaPlayer.create(this,R.raw.lupa);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpluu.start();

                        }
                    });


                }
                else{
                    sillu.setVisibility(View.GONE);
                    sillus.setVisibility(View.GONE);
                }

                break;
        }

    }
}


