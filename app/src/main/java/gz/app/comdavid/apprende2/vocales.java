package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class vocales extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);

        Button inicio= (Button) findViewById(R.id.casa);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
                finish();
            }
        });
        Button next= (Button) findViewById(R.id.siguiente_a);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),vocales_e.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });

        Button sonidoa = (Button)findViewById(R.id.sonido_a);
        mp= MediaPlayer.create(this,R.raw.sonidoa);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();


            }
        });

        ImageView sonidoaa = (ImageView) findViewById(R.id.imageView);
        mp= MediaPlayer.create(this,R.raw.sonidoa);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }


}
