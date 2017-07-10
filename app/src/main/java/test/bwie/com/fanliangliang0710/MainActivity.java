package test.bwie.com.fanliangliang0710;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{
    private EditText etAmount;
    private Button btnDecrease;
    private Button btnIncrease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText) findViewById(R.id.etAmount);
        btnDecrease = (Button) findViewById(R.id.btnDecrease);
        btnIncrease = (Button) findViewById(R.id.btnIncrease);

        btnDecrease.setOnClickListener(this);
        btnIncrease.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnDecrease:


            break;

            case R.id.btnIncrease:

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            break;

        }

    }
}
