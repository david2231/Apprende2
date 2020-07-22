package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.preference.PreferenceManager;
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

                SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor=preferences.edit();
                int bandera=Integer.parseInt(preferences.getString("bandera","0"));
                if(bandera==1){
                    Intent intent=new Intent(splashscreen.this,inicio2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                }
                else{
                    editor.putString("bandera","1");
                    editor.commit();

                    Intent intent=new Intent(splashscreen.this,MainActivity3.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);

                    Intent intent2=new Intent(splashscreen.this,ContenedorInstrucciones.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                }

                finish();


            }
        },1000);


    }

}
