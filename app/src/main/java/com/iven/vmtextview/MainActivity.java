package com.iven.vmtextview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.iven.vmtextview.entity.VMEntity;
import com.iven.vmtextview.view.VMTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VMTextView mVMTextView;
    private List<VMEntity> mList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVMTextView = (VMTextView) findViewById(R.id.ad_textview);
        mList.add(new VMEntity("前缀1", "内容1", "连接1"));
        mList.add(new VMEntity("前缀2", "内容2", "连接2"));
        mList.add(new VMEntity("前缀3", "内容3", "连接3"));
        mList.add(new VMEntity("前缀4", "内容4", "连接4"));

        mVMTextView.setFrontColor(Color.RED);//设置提示信息的字体颜色
        mVMTextView.setBackColor(Color.BLACK);//设置内容的字体的颜色
        mVMTextView.setmTexts(mList);//绑定数据源！！！！！
        mVMTextView.setInterval(1000);//设置每个Item的显示的时间

        mVMTextView.setOnItemClickListener(new VMTextView.OnItemClickListener() {
            @Override
            public void onClick(String mUrl) {
                Toast.makeText(MainActivity.this, "URL="+mUrl, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
