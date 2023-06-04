package com.example.dw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;
    ImageButton info;
    public static String name;
    private TextView cout, nm, aa;
    EditText cin;
    ImageView f, l, d, g, m, pp, pp1, s, fon;
    Integer c = 0, a = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cout = (TextView)findViewById(R.id.cout);
        nm = (TextView)findViewById(R.id.nm);
        aa = (TextView)findViewById(R.id.aa);
        cin = (EditText)findViewById(R.id.cin);
        next = (Button)findViewById(R.id.next);
        info = (ImageButton)findViewById(R.id.info);
        s = (ImageView)findViewById(R.id.s2);
        f = (ImageView)findViewById(R.id.f2);
        l = (ImageView)findViewById(R.id.l2);
        d = (ImageView)findViewById(R.id.d2);
        g = (ImageView)findViewById(R.id.g2);
        m = (ImageView)findViewById(R.id.m2);
        pp = (ImageView)findViewById(R.id.p);
        pp1 = (ImageView)findViewById(R.id.p1);
        fon = (ImageView)findViewById(R.id.imageView4);
        s.setVisibility(View.INVISIBLE);
        l.setVisibility(View.INVISIBLE);
        f.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
        g.setVisibility(View.INVISIBLE);
        m.setVisibility(View.INVISIBLE);
        aa.setVisibility(View.INVISIBLE);
        pp.setVisibility(View.INVISIBLE);
        pp1.setVisibility(View.INVISIBLE);
        cin.setVisibility(View.INVISIBLE);
        cout.setTextSize(36);
        cout.setText("Начать игру?");
        Text t;
        t = new Text();
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R.id.next == v.getId()) {
                    cout.setTextSize(28);
                    if (c == 0){
                        cin.setVisibility(View.VISIBLE);

                    }
                    else{
                        name = cin.getText().toString();
                        cin.setVisibility(View.INVISIBLE);
                    }
                    if (c == 38){
                        Intent i = new Intent(MainActivity.this, First.class);
                        i.putExtra("name", name);
                        startActivity(i);
                    }
                        nm.setText( t.ctN(0, c));
                    if (t.ctN(0, c) == "Я")
                        nm.setText(name);
                    String sa = t.ctN(0, c);

                    {
                        if (sa == "Фрайд" || c == 14)
                            f.setVisibility(View.VISIBLE);
                        else
                            f.setVisibility(View.INVISIBLE);
                        if (sa == "Эпэрфлас" || c == 11)
                            l.setVisibility(View.VISIBLE);
                        else
                            l.setVisibility(View.INVISIBLE);
                        if (sa == "Дэн" || c == 13)
                            d.setVisibility(View.VISIBLE);
                         else
                            d.setVisibility(View.INVISIBLE);
                        if (sa == "Гледис" || c == 10)
                            g.setVisibility(View.VISIBLE);
                         else
                            g.setVisibility(View.INVISIBLE);
                        if (sa == "Мира" || c == 12)
                            m.setVisibility(View.VISIBLE);
                         else
                            m.setVisibility(View.INVISIBLE);
                        if (sa == "Система")
                            s.setVisibility(View.VISIBLE);
                        else
                            s.setVisibility(View.INVISIBLE);
                    }
                    cout.setText(t.ctT(0, c));
                    if( c == 17){
                        cout.setText(t.ctT(0, c) + name + t.ctT(0, c + 1) );
                        c++;
                    }
                    if( c == 26){
                        cout.setText(name + t.ctT(0, c));
                    }
                    if(c >= 2 && c <= 5)
                        fon.setVisibility(View.INVISIBLE);
                    else
                        fon.setVisibility(View.VISIBLE);
                    if( c == 3)
                        pp1.setVisibility(View.VISIBLE);
                    else
                        pp1.setVisibility(View.INVISIBLE);
                    if( c == 4 || c == 5)
                        pp.setVisibility(View.VISIBLE);
                    else
                        pp.setVisibility(View.INVISIBLE);
                    c++;
                }
                if (R.id. info == v.getId()){
                    a++;
                    if(a % 2 == 0)
                        aa.setVisibility(View.INVISIBLE);
                    else
                        aa.setVisibility(View.VISIBLE);
                }
            }
        };
        next.setOnClickListener(listener);
        info.setOnClickListener(listener);
    }
}