package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class creditos extends AppCompatActivity {
    private VideoView azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        azul=(VideoView) findViewById(R.id.creditto) ;

        String path=("android.resource://"+getPackageName()+"/"+R.raw.creditosporfin);

        azul.setVideoURI(Uri.parse(path));
        azul.start();
        Button inicio= (Button) findViewById(R.id.botoncredito);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),inicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                azul.pause();
                finish();
            }
        });
    }
}
