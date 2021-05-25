package rp.edu.sg.c346.id20021576.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt203;
    Button bt346;
    Button bt235;
    Button bt206;
    Button bt218;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt203 = findViewById(R.id.bt203);
        bt346 = findViewById(R.id.bt346);
        bt235 = findViewById(R.id.bt235);
        bt206 = findViewById(R.id.bt206);
        bt218 = findViewById(R.id.bt218);

        bt203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("MC", "C203");
                intent.putExtra("MN", "Web Appln Development in php");
                intent.putExtra("AC", 2021);
                intent.putExtra("SEM", 1);
                intent.putExtra("MCR", 4);
                intent.putExtra("VN", "W67N");
                startActivity(intent);
            }
        });

        bt346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("MC", "C346");
                intent.putExtra("MN", "Mobile App Development");
                intent.putExtra("AC", 2021);
                intent.putExtra("SEM", 1);
                intent.putExtra("MCR", 4);
                intent.putExtra("VN", "E62E");
                startActivity(intent);
            }
        });

        bt235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("MC", "C235");
                intent.putExtra("MN", "IT Security and Management");
                intent.putExtra("AC", 2021);
                intent.putExtra("SEM", 1);
                intent.putExtra("MCR", 4);
                intent.putExtra("VN", "W67N");
                startActivity(intent);
            }
        });

        bt206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("MC", "C206");
                intent.putExtra("MN", "Software Development Process");
                intent.putExtra("AC", 2021);
                intent.putExtra("SEM", 1);
                intent.putExtra("MCR", 4);
                intent.putExtra("VN", "W67N");
                startActivity(intent);
            }
        });

        bt218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("MC", "C218");
                intent.putExtra("MN", "UI/UX for Apps");
                intent.putExtra("AC", 2021);
                intent.putExtra("SEM", 1);
                intent.putExtra("MCR", 4);
                intent.putExtra("VN", "W64G");
                startActivity(intent);
            }
        });
    }
}