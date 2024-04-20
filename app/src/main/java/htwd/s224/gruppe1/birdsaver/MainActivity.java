package htwd.s224.gruppe1.birdsaver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitIpAddress(View view){
        // navigate to delete view
        Intent intent = new Intent(this, DeleteView.class);
        startActivity(intent);
    }
}