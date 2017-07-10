package test.bwie.com.fanliangliang0710;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

public class Main2Activity extends Activity {
    private Button btnDecrease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnDecrease = (Button) findViewById(R.id.btnDecrease2);

        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }

}
