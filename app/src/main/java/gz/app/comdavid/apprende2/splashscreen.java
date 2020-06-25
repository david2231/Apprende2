package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class splashscreen extends AppCompatActivity {
    private VideoView azul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        azul=(VideoView) findViewById(R.id.intros) ;

        String path=("android.resource://"+getPackageName()+"/"+R.raw.introporfin);

        azul.setVideoURI(Uri.parse(path));
        azul.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(splashscreen.this,inicio2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();

            }
        },20000);


    }

}
