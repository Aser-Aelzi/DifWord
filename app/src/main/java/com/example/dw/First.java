package com.example.dw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class First extends AppCompatActivity {
    TextView cout, nm, tV, aa;
    Button next, again;
    ImageButton info;
    ImageView f, l, d, m, g, s;
    String name;
    RadioGroup rG;
    public Integer c = 0, a = 0;
    public Integer cnt = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle arguments = getIntent().getExtras();
        name = arguments.getString("name");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        c++;
        cout = (TextView)findViewById(R.id.cout1);
        nm = (TextView)findViewById(R.id.nm1);
        tV = (TextView)findViewById(R.id.tV);
        aa = (TextView)findViewById(R.id.aa2);
        info = (ImageButton)findViewById(R.id.info2);
        next = (Button) findViewById(R.id.next2);
        again = (Button) findViewById(R.id.again);
        s = (ImageView)findViewById(R.id.s2);
        f = (ImageView)findViewById(R.id.f2);
        l = (ImageView)findViewById(R.id.l2);
        d = (ImageView)findViewById(R.id.d2);
        g = (ImageView)findViewById(R.id.g2);
        m = (ImageView)findViewById(R.id.m2);
        aa.setVisibility(View.INVISIBLE);
        //s.setVisibility(View.INVISIBLE);
        l.setVisibility(View.INVISIBLE);
        f.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
        g.setVisibility(View.INVISIBLE);
        m.setVisibility(View.INVISIBLE);
        again.setVisibility(View.INVISIBLE);
        rG = (RadioGroup) findViewById(R.id.rG);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton r1 = (RadioButton)findViewById(R.id.radio1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton r2 = (RadioButton)findViewById(R.id.radio2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton r3 = (RadioButton)findViewById(R.id.radio3);
        r1.setVisibility(View.INVISIBLE);
        r2.setVisibility(View.INVISIBLE);
        r3.setVisibility(View.INVISIBLE);
        cout.setText("Добро пожаловать на первый уровень «Жадный алгоритм».");
        nm.setText("Система");
        Text t = new Text();
        cout.setTextSize(28);
        View.OnClickListener listener = new View.OnClickListener() {
            // @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View v) {
                if (R.id.next2 == v.getId() || R.id.again == v.getId()) {
                    if (c == 1) {
                        cout.setTextSize(24);
                    } else {
                        cout.setTextSize(28);
                    }


                    if (c == 14) {
                        cout.setVisibility(View.INVISIBLE);
                        tV.setText(t.ctT(1, c));
                        nm.setText(t.ctN(1, c));
                        r1.setVisibility(View.VISIBLE);
                        r2.setVisibility(View.VISIBLE);
                        r3.setVisibility(View.VISIBLE);
                        s.setVisibility(View.VISIBLE);
                        //if (r1.isChecked())
                        //   cnt++;
                        m.setVisibility(View.INVISIBLE);
                        rG.clearCheck();
                    } else if (c == 15) {

                        tV.setText(t.ctT(1, c));
                        nm.setText(t.ctN(1, c));
                        if (r1.isChecked()) cnt++;
                        rG.clearCheck();
                        s.setVisibility(View.VISIBLE);


                    } else if (c == 16) {
                        tV.setText(t.ctT(1, c));
                        nm.setText(t.ctN(1, c));
                        if (r3.isChecked()) cnt++;
                        rG.clearCheck();
                        s.setVisibility(View.VISIBLE);

                    } else if (c == 17) {
                        cout.setVisibility(View.VISIBLE);
                        s.setVisibility(View.VISIBLE);
                  //      cout.setTextSize(30);
                        if (r2.isChecked()) cnt++;
                        tV.setVisibility(View.INVISIBLE);
                        r1.setVisibility(View.INVISIBLE);
                        r2.setVisibility(View.INVISIBLE);
                        r3.setVisibility(View.INVISIBLE);
                        nm.setText("Cистема");
                        cout.setText("Вы заработали звезд: " + cnt.toString() + " из максимальных трёх\n" + "Желаете перепройти первый уровень?");
                        again.setVisibility(View.VISIBLE);
                    } else if (c == 18) {
                        again.setVisibility(View.VISIBLE);
                        if (R.id.next2 == v.getId()) {
                            Intent g = new Intent(First.this, End.class);
                            g.putExtra("cnt", cnt);
                            g.putExtra("name", name);
                            startActivity(g);
                        }
                        if (R.id.again == v.getId()){
                            Intent g = new Intent(First.this, First.class);
                            g.putExtra("name", name);
                            startActivity(g);
                        }
                    }

                    else {
                        cout.setText(t.ctT(1, c));
                        nm.setText(t.ctN(1, c));
                        if (t.ctN(1, c) == "Я")
                            nm.setText(name);
                        String sa = t.ctN(1, c);
                        {
                            if (sa == "Фрайд")
                                f.setVisibility(View.VISIBLE);
                            else
                                f.setVisibility(View.INVISIBLE);
                            if (sa == "Эпэрфлас")
                                l.setVisibility(View.VISIBLE);
                            else
                                l.setVisibility(View.INVISIBLE);
                            if (sa == "Дэн")
                                d.setVisibility(View.VISIBLE);
                            else
                                d.setVisibility(View.INVISIBLE);
                            if (sa == "Гледис")
                                g.setVisibility(View.VISIBLE);
                            else
                                g.setVisibility(View.INVISIBLE);
                            if (sa == "Мира")
                                m.setVisibility(View.VISIBLE);
                            else
                                m.setVisibility(View.INVISIBLE);
                            if (sa == "Система")
                                s.setVisibility(View.VISIBLE);
                            else
                                s.setVisibility(View.INVISIBLE);
                        }
                    }
                    c++;

                }
                if (R.id.info2 == v.getId()) {
                    a++;
                    if (a % 2 == 0)
                        aa.setVisibility(View.INVISIBLE);
                    else
                        aa.setVisibility(View.VISIBLE);
                }
            }
        };
        again.setOnClickListener(listener);
        info.setOnClickListener(listener);
        next.setOnClickListener(listener);
    }
}
