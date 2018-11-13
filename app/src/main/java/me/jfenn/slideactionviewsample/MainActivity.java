package me.jfenn.slideactionviewsample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import me.jfenn.slideactionview.SlideActionListener;
import me.jfenn.slideactionview.SlideActionView;

public class MainActivity extends AppCompatActivity implements SlideActionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlideActionView view = findViewById(R.id.actionView);
        view.setListener(this);
        view.setLeftIcon(ContextCompat.getDrawable(this, R.drawable.ic_announcement_black_24dp));
        view.setRightIcon(ContextCompat.getDrawable(this, R.drawable.ic_assignment_turned_in_black_24dp));
    }

    @Override
    public void onSlideLeft() {
        Toast.makeText(this, "slid left", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideRight() {
        Toast.makeText(this, "slid right", Toast.LENGTH_SHORT).show();
    }
}
