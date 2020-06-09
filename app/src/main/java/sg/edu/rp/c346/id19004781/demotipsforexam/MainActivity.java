package sg.edu.rp.c346.id19004781.demotipsforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;

    String[] examTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        examTipsArray = new String[5];
        examTipsArray[0] = "Prepare way before the exam";
        examTipsArray[1] = "Practice coding";
        examTipsArray[2] = "Seek help from lecturer";
        examTipsArray[3] = "Prepare template code";
        examTipsArray[4] = "Create empty projects for MSA";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examTipsArray);

        lvExamTips.setAdapter(adapter);
    }
}
