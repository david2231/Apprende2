package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_f extends AppCompatActivity  implements View.OnClickListener{

    ImageView silfa,silfas,silfe,silfes,silfo,silfos,silfis,silfi,silfu,silfus;
    MediaPlayer mpfa;
    MediaPlayer mpfaa;
    MediaPlayer mpfe;
    MediaPlayer mpfee;
    MediaPlayer mpfi;
    MediaPlayer mpfii;
    MediaPlayer mpfo;
    MediaPlayer mpfoo;
    MediaPlayer mpfu;
    MediaPlayer mpfuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_f);

        silfa=(ImageView) findViewById(R.id.familias);
        silfas=(ImageView) findViewById(R.id.faros);
        silfe=(ImageView) findViewById(R.id.felices);
        silfes=(ImageView) findViewById(R.id.ferrocarriles);
        silfos=(ImageView) findViewById(R.id.fotografias);
        silfo=(ImageView) findViewById(R.id.focas);
        silfus=(ImageView) findViewById(R.id.fuentes);
        silfu=(ImageView) findViewById(R.id.fuegos);
        silfis=(ImageView) findViewById(R.id.filetes);
        silfi=(ImageView) findViewById(R.id.fichas);
        findViewById(R.id.fas).setOnClickListener(this);
        findViewById(R.id.fes).setOnClickListener(this);
        findViewById(R.id.fos).setOnClickListener(this);
        findViewById(R.id.fis).setOnClickListener(this);
        findViewById(R.id.fus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigf);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil16.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casaf);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.fas:
                if(silfa.getVisibility()==View.GONE){

                    silfa.setVisibility(View.VISIBLE);
                    silfas.setVisibility(View.VISIBLE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.familias);
                    mpfa= MediaPlayer.create(this,R.raw.familia);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfa.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.faros);
                    mpfaa= MediaPlayer.create(this,R.raw.faro);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfaa.start();

                        }
                    });












                }
                else{
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                }

                break;
            case R.id.fes:
                if(silfe.getVisibility()==View.GONE){
                    silfe.setVisibility(View.VISIBLE);
                    silfes.setVisibility(View.VISIBLE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.felices);
                    mpfe= MediaPlayer.create(this,R.raw.feliz);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfe.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.ferrocarriles);
                    mpfee= MediaPlayer.create(this,R.raw.ferrocarril);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfee.start();

                        }
                    });


                }
                else{
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                }

                break;

            case R.id.fos:
                if(silfo.getVisibility()==View.GONE){
                    silfo.setVisibility(View.VISIBLE);
                    silfos.setVisibility(View.VISIBLE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.focas);
                    mpfo= MediaPlayer.create(this,R.raw.foca);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.fotografias);
                    mpfoo= MediaPlayer.create(this,R.raw.foto);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfoo.start();

                        }
                    });

                }
                else{
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                }
                break;

            case R.id.fis:
                if(silfi.getVisibility()==View.GONE){
                    silfi.setVisibility(View.VISIBLE);
                    silfis.setVisibility(View.VISIBLE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.fichas);
                    mpfi= MediaPlayer.create(this,R.raw.ficha);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.filetes);
                    mpfii= MediaPlayer.create(this,R.raw.filete);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfii.start();

                        }
                    });

                }
                else{
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                }

                break;

            case R.id.fus:
                if(silfu.getVisibility()==View.GONE){
                    silfu.setVisibility(View.VISIBLE);
                    silfus.setVisibility(View.VISIBLE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.fuentes);
                    mpfu= MediaPlayer.create(this,R.raw.fuente);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.fuegos);
                    mpfuu= MediaPlayer.create(this,R.raw.fuego);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpfuu.start();

                        }
                    });

                }
                else{
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);
                }

                break;
        }

    }
}