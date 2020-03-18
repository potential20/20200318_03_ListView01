package kr.co.tjoeun.a20200318_03_listview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200318_03_listview01.adapters.StoreAdapter;
import kr.co.tjoeun.a20200318_03_listview01.databinding.ActivityMainBinding;
import kr.co.tjoeun.a20200318_03_listview01.datas.Store;

public class MainActivity extends BaseActivity {

//    가게목록이 담길 리스트
    List<Store> storeDatas = new ArrayList<>();
    //    목록을 뿌려줄 StoreAdapter 변수
    StoreAdapter storeAdapter = null;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {



//        어댑터를 객체화 (우리가 작성한 생성자 활용)
        storeAdapter = new StoreAdapter(mContext, R.layout.store_list_item,storeDatas);
//        리스트뷰와 어댑터를 연결
        binding.storeListView.setAdapter(storeAdapter);

        addStores();

    }

    void addStores() {
        storeDatas.add(new Store("삼겹더하기 본점",4));
        storeDatas.add(new Store("밥해주는 남자",3));
        storeDatas.add(new Store("굽네치킨",5));
        storeDatas.add(new Store("BBQ",4));
        storeDatas.add(new Store("피자헛",4));
        storeDatas.add(new Store("도미노피자",5));
        storeDatas.add(new Store("할매순대국",4));
        storeDatas.add(new Store("원할머니 보쌈",5));
        storeDatas.add(new Store("놀부 부대찌개",2));
        storeDatas.add(new Store("롯데리아",3));
        storeAdapter.notifyDataSetChanged();

    }
}
