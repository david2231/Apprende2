package gz.app.comdavid.apprende2.ui;

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

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.fragment.Instruccion1Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion2Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion3Fragment;
import gz.app.comdavid.apprende2.ui.main.SectionsPagerAdapter;

//Se implementan los fragmentos que contendran las instrucciones
public class ContenedorInstrucciones extends AppCompatActivity implements Instruccion1Fragment.OnFragmentInteractionListener, Instruccion2Fragment.OnFragmentInteractionListener, Instruccion3Fragment.OnFragmentInteractionListener {
    //Llamado al linear layout que contiene los puntos
    private LinearLayout linearpuntos;
    //Se realiza un arreglo de tipo TextView el cual va representar los puntos que se muestran
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

        //Se instancian el layout linearPuntos
        linearpuntos=findViewById(R.id.LinearPuntos);
        //Se realiza el llamdo al metodo agregarIndicadorPuntos y se envia una posición inicial de 0
        agregarIndicadorPuntos(0);
        mViewPager.addOnPageChangeListener(viewListener);
    }
    //Se realiza la creación del metodo agregarIndicadorPuntos en donde se relacione la posición del usuario
    private void agregarIndicadorPuntos(int pos) {
        //Se instancia el arreglo de puntosSlide
        puntosSlide=new TextView[3];
        //Se remuven todas las vistas que esten en linear Layout
        linearpuntos.removeAllViews();
        //Ciclo for que crea los componentes TextView que se guardan
        for(int i=0;i<puntosSlide.length;i++){
            //Se define la instancia
            puntosSlide[i]=new TextView(this);
            //Se define la instancia
            //Formato de texto
            puntosSlide[i].setText(Html.fromHtml("&#8226"));
            puntosSlide[i].setText(Html.fromHtml("&#8226"));
            //Tamaño de la fuente
            puntosSlide[i].setTextSize(35);
            //Color del texto, se realiza el llamado del archivo de recursos colors
            puntosSlide[i].setTextColor(getResources().getColor(R.color.colorBlancoTransparente));
            //Se agregan los textview el arreglo puntosSlide en la posición donde se encuentre el usuario
            linearpuntos.addView(puntosSlide[i]);
        }
        //Validación que permite cambiar el color del texto cada vez que el usuario pase de pantalla
        if(puntosSlide.length>0){
            //Color del texto, se realiza el llamado del archivo de recursos colors
            puntosSlide[pos].setTextColor(getResources().getColor(R.color.colorBlanco));

        }

    }
    //Creación de una interfaz que permita cambiar entre paginas
    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        //Se realiza el llamado de la posición i
        public void onPageSelected(int i) {
            agregarIndicadorPuntos(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}