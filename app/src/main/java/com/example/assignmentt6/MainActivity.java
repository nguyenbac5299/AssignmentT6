package com.example.assignmentt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<ContactModel> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);

        list.add(new ContactModel("A","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("B","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("C","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("D","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("E","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("F","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("G","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("H","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("K","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("Q","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));
        list.add(new ContactModel("R","Chúc mừng bạn đã trúng 1 tỷ đồng, vui lòng liên hệ chúng tôi để nhận thưởng","9 th4",false));

        ContactAapter adapter=new ContactAapter(list);
        listView.setAdapter(adapter);
    }
}
