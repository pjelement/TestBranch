package tcss450.uw.edu.testbranches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Minh Branch", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "I am done", Toast.LENGTH_LONG).show();
    }
}
