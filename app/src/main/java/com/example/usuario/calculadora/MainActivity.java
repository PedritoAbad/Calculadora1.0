package com.example.usuario.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,btsum,btres,btmulti,btdivi,br,blim;
    private Button bt2cu,bt3cu,btr2cu,btr3cu,btln,btfac;
    private EditText val;
    double vec[] = new double[2];
    String op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.bt2);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.bt3);
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.bt4);
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.bt5);
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.bt6);
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.bt7);
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.bt8);
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.bt9);
        b9.setOnClickListener(this);

        b0 = (Button) findViewById(R.id.bt0);
        b0.setOnClickListener(this);

        br = (Button) findViewById(R.id.btr);
        br.setOnClickListener(this);

        blim = (Button) findViewById(R.id.btlim);
        blim.setOnClickListener(this);

        btsum = (Button) findViewById(R.id.btsum);
        btsum.setOnClickListener(this);

        btres = (Button) findViewById(R.id.btres);
        btres.setOnClickListener(this);

        btmulti = (Button) findViewById(R.id.btmulti);
        btmulti.setOnClickListener(this);

        btdivi = (Button) findViewById(R.id.btdivi);
        btdivi.setOnClickListener(this);

        bt2cu = (Button) findViewById(R.id.bt2cu);
        bt2cu.setOnClickListener(this);

        bt3cu = (Button) findViewById(R.id.bt3cu);
        bt3cu.setOnClickListener(this);

        btr2cu = (Button) findViewById(R.id.btr2cu);
        btr2cu.setOnClickListener(this);

        btr3cu = (Button) findViewById(R.id.btr3cu);
        btr3cu.setOnClickListener(this);

        btln = (Button) findViewById(R.id.btln);
        btln.setOnClickListener(this);

        btfac = (Button) findViewById(R.id.btfac);
        btfac.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        TextView ver = (TextView) findViewById(R.id.edtver);
        String var = ver.getText().toString();
        int select = v.getId();
        double result;

        try {
            switch (select){
                case R.id.bt0:
                    ver.setText(var+"0");
                    break;
                case R.id.bt1:
                    ver.setText(var+"1");
                    break;
                case R.id.bt2:
                    ver.setText(var+"2");
                    break;
                case R.id.bt3:
                    ver.setText(var+"3");
                    break;
                case R.id.bt4:
                    ver.setText(var+"4");
                    break;
                case R.id.bt5:
                    ver.setText(var+"5");
                    break;
                case R.id.bt6:
                    ver.setText(var+"6");
                    break;
                case R.id.bt7:
                    ver.setText(var+"7");
                    break;
                case R.id.bt8:
                    ver.setText(var+"8");
                    break;
                case R.id.bt9:
                    ver.setText(var+"9");
                    break;
                case R.id.btlim:
                    ver.setText("");
                    vec[0]=0;
                    vec[1]=0;
                    break;
                case R.id.btr:
                    switch (op){
                        case "suma":
                            vec[1] = Double.parseDouble(ver.getText().toString());
                            result = vec[0] + vec[1];
                            ver.setText(String.valueOf(result));
                            break;
                        case "resta":
                            vec[1] = Double.parseDouble(ver.getText().toString());
                            result = vec[0] - vec[1];
                            ver.setText(String.valueOf(result));
                            break;
                        case "multi":
                            vec[1] = Double.parseDouble(ver.getText().toString());
                            result = vec[0] * vec[1];
                            ver.setText(String.valueOf(result));
                            break;
                        case "divi":
                            vec[1] = Double.parseDouble(ver.getText().toString());
                            result = vec[0] / vec[1];
                            ver.setText(String.valueOf(result));
                            break;
                    }
                    break;
                case R.id.btsum:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    ver.setText("");
                    op="suma";
                    break;
                case R.id.btres:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    ver.setText("");
                    op="resta";
                    break;
                case R.id.btmulti:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    ver.setText("");
                    op="multi";
                    break;
                case R.id.btdivi:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    ver.setText("");
                    op="divi";
                    break;
                case R.id.bt2cu:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    result = vec[0] * vec[0];
                    ver.setText(String.valueOf(result));
                    break;
                case R.id.bt3cu:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    result = vec[0] * vec[0] * vec[0];
                    ver.setText(String.valueOf(result));
                    break;
                case R.id.btr2cu:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    result = Math.sqrt(vec[0]);
                    ver.setText(String.valueOf(result));
                    break;
                case R.id.btr3cu:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    result = Math.cbrt(vec[0]);
                    ver.setText(String.valueOf(result));
                    break;
                case R.id.btln:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    result = Math.log10(vec[0]);
                    ver.setText(String.valueOf(result));
                    break;
                case R.id.btfac:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    double num = vec[0];
                    double fact = 1;
                    for (double i=num ;i>1;i--){
                        fact = fact * i ;
                    }
                    ver.setText(String.valueOf(fact));
                    break;
            }
        }catch (Exception e){
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
