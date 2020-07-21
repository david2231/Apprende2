package gz.app.comdavid.apprende2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import gz.app.comdavid.apprende2.fragment.Instruccion1Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion2Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion3Fragment;
import gz.app.comdavid.apprende2.ui.main.SectionsPagerAdapter;

public class ContenedorInstrucciones extends AppCompatActivity implements Instruccion1Fragment.OnFragmentInteractionListener, Instruccion2Fragment.OnFragmentInteractionListener, Instruccion3Fragment.OnFragmentInteractionListener {
    private LinearLayout linearpuntos;
    private TextView[] puntosSlide;
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_instrucciones2);
        mSectionsPagerAdapter = new SectionsPagerAdapter(this,getSupportFragmentManager());
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        mViewPager  = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        linearpuntos=findViewById(R.id.LinearPuntos);
        agregarIndicadorPuntos(0);
        mViewPager.addOnPageChangeListener(viewListener);
    }

    private void agregarIndicadorPuntos(int pos) {
        puntosSlide=new TextView[3];
        linearpuntos.removeAllViews();
        for(int i=0;i<puntosSlide.length;i++){
            puntosSlide[i]=new TextView(this);
            puntosSlide[i].setText(Html.fromHtml("&#8226"));
            puntosSlide[i].setText(Html.fromHtml("&#8226"));
            puntosSlide[i].setTextSize(35);
            puntosSlide[i].setTextColor(getResources().getColor(R.color.colorBlancoTransparente));
            linearpuntos.addView(puntosSlide[i]);
        }
        if(puntosSlide.length>0){
            puntosSlide[pos].setTextColor(getResources().getColor(R.color.colorBlanco));

        }

    }
    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            agregarIndicadorPuntos(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}