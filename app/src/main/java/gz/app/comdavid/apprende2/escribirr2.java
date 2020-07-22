package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class escribirr2 extends AppCompatActivity implements escribirr.DrawFinishListener {
    MediaPlayer mp,mp2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribirr2);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);

        Button inicio= (Button) findViewById(R.id.botoncasaesc);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),escribirinicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        });
        button = (Button)findViewById(R.id.botonreset);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(escribirr2.this,escribirr2.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);



                    }
                },10);

            }
        });

        LinearLayout llMain = (LinearLayout) findViewById(R.id.llMain);


        int drawable = R.drawable.letra1a;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), drawable);
        escribirr image = new escribirr(this, bitmap);
        image.setImageBitmap(bitmap);
        llMain.addView(image);
    }





    @Override
    public void onDrawFinish() {
        Toast.makeText(getApplicationContext(), "Finalizado", Toast.LENGTH_LONG).show();
        mp.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(escribirr2.this,escribirr3_1.class);
                startActivity(intent);

                finish();

            }
        },1000);
    }

    @Override
    public void onDrawStop() {
        Log.i("Action: ", "Draw stop");
    }

    @Override
    public void onDrawStart() {
        Log.i("Action: ", "Draw start");
    }


}

