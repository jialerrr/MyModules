package rp.edu.sg.c346.id20021576.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvDetail;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetail = findViewById(R.id.tvDetail);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String mod = intentReceived.getStringExtra("MC");
        String modName = intentReceived.getStringExtra("MN");
        Integer modYear = intentReceived.getIntExtra("AC", 0);
        Integer modSem = intentReceived.getIntExtra("SEM", 0);
        Integer modCred = intentReceived.getIntExtra("MCR", 0);
        String modVen = intentReceived.getStringExtra("VN");

        String message = "Module Code: " + mod + "\nModule Name: " + modName +
                "\nAcademic Year: " + modYear + "\nSemester: " + modSem +
                "\nModule Credit: " + modCred + "\nVenue: " + modVen;

        tvDetail.setText(message);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(backIntent);
            }

        });




    }
}