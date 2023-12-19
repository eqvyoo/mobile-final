package com.cookandroid.cardetection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewIllegalParking;
    private RecyclerView recyclerViewTrafficViolation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewIllegalParking = findViewById(R.id.recyclerViewIllegalParking);
        recyclerViewTrafficViolation = findViewById(R.id.recyclerViewTrafficViolation);

        List<Option> illegalParkingOptions = new ArrayList<>();
        List<Option> trafficViolationOptions = new ArrayList<>();

        String[] illegalParkingArray = getResources().getStringArray(R.array.illegal_parking_options);
        String[] trafficViolationArray = getResources().getStringArray(R.array.traffic_violation_options);

        for (String option : illegalParkingArray) {
            illegalParkingOptions.add(new Option(option));
        }

        for (String option : trafficViolationArray) {
            trafficViolationOptions.add(new Option(option));
        }

        OptionAdapter illegalParkingAdapter = new OptionAdapter(illegalParkingOptions);
        OptionAdapter trafficViolationAdapter = new OptionAdapter(trafficViolationOptions);

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);

        recyclerViewIllegalParking.setLayoutManager(layoutManager1);
        recyclerViewIllegalParking.setAdapter(illegalParkingAdapter);

        recyclerViewTrafficViolation.setLayoutManager(layoutManager2);
        recyclerViewTrafficViolation.setAdapter(trafficViolationAdapter);
    }
}
//}
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_record_traffic_violation); // 여기서 파일명을 지정해야 함
//        // 화면 요소들을 findViewById()를 통해 가져와서 작업을 진행할 수 있습니다.
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
