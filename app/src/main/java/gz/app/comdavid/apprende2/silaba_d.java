package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_d extends AppCompatActivity  implements View.OnClickListener{

    ImageView silda,sildas,silde,sildes,sildo,sildos,sildis,sildi,sildu,sildus;
    MediaPlayer mpda;
    MediaPlayer mpdaa;
    MediaPlayer mpde;
    MediaPlayer mpdee;
    MediaPlayer mpdi;
    MediaPlayer mpdii;
    MediaPlayer mpdo;
    MediaPlayer mpdoo;
    MediaPlayer mpdu;
    MediaPlayer mpduu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_d);
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
        findViewById(R.id.das).setOnClickListener(this);
        findViewById(R.id.des).setOnClickListener(this);
        findViewById(R.id.dos).setOnClickListener(this);
        findViewById(R.id.dis).setOnClickListener(this);
        findViewById(R.id.dus).setOnClickListener(this);

        Button inicio= (Button) findViewById(R.id.sil_casad);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

        Button sig= (Button) findViewById(R.id.sigd);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil11.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.das:
                if(silda.getVisibility()==View.GONE){

                    silda.setVisibility(View.VISIBLE);
                    sildas.setVisibility(View.VISIBLE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.dardos);
                    mpda= MediaPlayer.create(this,R.raw.dardo);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpda.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.dados);
                    mpdaa= MediaPlayer.create(this,R.raw.dado);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdaa.start();

                        }
                    });










                }
                else{
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                }

                break;
            case R.id.des:
                if(silde.getVisibility()==View.GONE){
                    silde.setVisibility(View.VISIBLE);
                    sildes.setVisibility(View.VISIBLE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.dedos);
                    mpde= MediaPlayer.create(this,R.raw.dedo);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpde.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.delfins);
                    mpdee= MediaPlayer.create(this,R.raw.delfin);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdee.start();

                        }
                    });


                }
                else{
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                }

                break;

            case R.id.dos:
                if(sildo.getVisibility()==View.GONE){
                    sildo.setVisibility(View.VISIBLE);
                    sildos.setVisibility(View.VISIBLE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.doctores);
                    mpdo= MediaPlayer.create(this,R.raw.doctor);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.dolares);
                    mpdoo= MediaPlayer.create(this,R.raw.dolar);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdoo.start();

                        }
                    });

                }
                else{
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                }
                break;

            case R.id.dis:
                if(sildi.getVisibility()==View.GONE){
                    sildi.setVisibility(View.VISIBLE);
                    sildis.setVisibility(View.VISIBLE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.dientes);
                    mpdi= MediaPlayer.create(this,R.raw.diente);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.diamanetes);
                    mpdii= MediaPlayer.create(this,R.raw.diamante);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdii.start();

                        }
                    });

                }
                else{
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                }

                break;

            case R.id.dus:
                if(sildu.getVisibility()==View.GONE){
                    sildu.setVisibility(View.VISIBLE);
                    sildus.setVisibility(View.VISIBLE);
                    sildi.setVisibility(View.GONE);
                    sildis.setVisibility(View.GONE);
                    sildo.setVisibility(View.GONE);
                    sildos.setVisibility(View.GONE);
                    silda.setVisibility(View.GONE);
                    sildas.setVisibility(View.GONE);
                    silde.setVisibility(View.GONE);
                    sildes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.duendes);
                    mpdu= MediaPlayer.create(this,R.raw.duende);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpdu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.dulces);
                    mpduu= MediaPlayer.create(this,R.raw.dulce);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpduu.start();

                        }
                    });



                }
                else{
                    sildu.setVisibility(View.GONE);
                    sildus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
