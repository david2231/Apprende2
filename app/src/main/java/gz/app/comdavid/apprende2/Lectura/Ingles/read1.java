package gz.app.comdavid.apprende2.Lectura.Ingles;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

import gz.app.comdavid.apprende2.R;

public class read1 extends AppCompatActivity  implements View.OnClickListener{


    TextView grabar;
    String sonido;
    TextView bien;
    String exce;
    MediaPlayer mp;
    MediaPlayer mp2,mp4;

    private VideoView azul;


    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read1);
        azul=(VideoView) findViewById(R.id.videohouse) ;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        String path=("android.resource://"+getPackageName()+"/"+R.raw.house);
        azul.setVideoURI(Uri.parse(path));
        azul.start();
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        findViewById(R.id.videohouse).setOnClickListener(this);
        bien=(TextView) findViewById(R.id.textoo11);
        grabar = (TextView) findViewById(R.id.txtGrabarVoz11);

        Button inicio= (Button) findViewById(R.id.casa_lectura11);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),mainactivity2.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                azul.stopPlayback();
                azul.seekTo(0);
                finish();
            }
        });

        Button sig= (Button) findViewById(R.id.siguiente_lectura11);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),read2.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                azul.stopPlayback();
                azul.seekTo(0);
                finish();
            }
        });


        Button azull= (Button) findViewById(R.id.botonazul11);
        azull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                azul.start();

            }
        });
        Button omitirr= (Button) findViewById(R.id.omitir11);
        omitirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                azul.start();

            }
        });
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.videohouse:
                azul.start();
                break;

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:

                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String strSpeech2Text = speech.get(0);

                    grabar.setText(strSpeech2Text);



                } if(bien.getText().toString().equals(grabar.getText().toString())){
                Toast.makeText(this,"Nice Good Job",Toast.LENGTH_LONG).show();
                mp.start();


            }
            else{

                Toast.makeText(this,"Try Again",Toast.LENGTH_LONG).show();
                mp2.start();
            }




                break;
            default:

                break;
        }
    }

    public void onClickImgBtnHablar11(View v) {

        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);


        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Your device does not  support voice recognition",
                    Toast.LENGTH_SHORT).show();
        }

    }



}



